/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.Login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.security.Key;


/**
 *
 * @author Roberto
 */
public class Validar {
    
   String conector = "com.mysql.jdbc.Driver";
   public SeguridadServidor SS;
   String infoDB;
   String [][] DatosDB;
   String usr,pass,intentos;
   
   String datos= null;
    
    //LLaves
   Key pubKey;
   Key simetricKey;
   byte[] LlaveAESEncriptada;
    
    // Inicia peticion de login
    public void LoginRequest(Key pubKey_C){
        System.out.println("----- Iniciado proceso de Login -----");
        pubKey = pubKey_C;
        ServerSequirity();
    }

    public void ServerSequirity(){
        SS = new SeguridadServidor();
        System.out.println("---Servidor - Generando llave AES---");
        try{
            simetricKey = SS.GeneraAES256();
            System.out.println("    Key AES: " + Utils.toHex(simetricKey.getEncoded()));
            System.out.println("    Base de Datos: Encriptando llave AES con llave publica del usuario");
            LlaveAESEncriptada = SS.EncriptaLlaveAESConRSA(pubKey,simetricKey);
        }catch(Exception e){
         e.printStackTrace();
        }
    }
    
    public  byte[] RegresaLLaveEncriptada(){
        System.out.println("    Base de Datos: Enviando llave AES encriptada");
        return LlaveAESEncriptada;
    }
        
    public int login(byte[] MensajeEncriptado){
        String codIngresado, passIngresado;
        String codDB,passDB;
        int intentosCodigo;
        int intentosDB;
        boolean identificado=false;
        boolean passIdentificado=false;
        //Conexión a base de datos
        try {
            datos = SS.DesencriptaMensajeAES(MensajeEncriptado, simetricKey);
            System.out.println("-----Desencriptando mensage AES-----");

            String[] parts = datos.split("/");
            codIngresado = parts[0];
            passIngresado = parts[1];
                       
            System.out.println("part1: " + codIngresado);
            System.out.println("part2: " + passIngresado);
            
            System.out.println("Comenzando conexion con mysql");
            
            Class.forName(conector); 
            Connection co = DriverManager.getConnection("jdbc:mysql://localhost/cuentas","root",""); 
            Statement requestuser = co.createStatement();
            ResultSet outuser = requestuser.executeQuery("SELECT * FROM usuario;");
            System.out.println("Conexion correcta");
            
            while (outuser.next()){
                codDB = outuser.getString("user");
                passDB = outuser.getString("pass");
                intentosDB = outuser.getInt("errores");
                if (codIngresado.equals(codDB)) {
                    intentosCodigo = intentosDB;
                    identificado = true;
                    if (intentosCodigo >= 3){
                        return 4;
                    } else {
                        if (passIngresado.equals(passDB)) {
                            passIdentificado=true;
                            intentosCodigo=0;
                            try {
                                Class.forName(conector);
                            } catch (ClassNotFoundException e) {
                                System.out.println(e);
                            }
                            try {
                                Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost/cuentas","root","");
                                Statement stmt3 = con3.createStatement();
                                String mensaje3 = "UPDATE usuario SET errores=0 WHERE user='"+ codDB+"';";
                                int resultado = stmt3.executeUpdate(mensaje3);
                            } catch (SQLException e3) {
                                System.err.println(e3);
                            }
                            return 1;
                        } else {
                            intentosCodigo ++;
                            try {
                                Class.forName(conector);
                            } catch (ClassNotFoundException e) {
                                System.out.println(e);
                            }

                            try {
                                Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost/cuentas","root","");
                                Statement stmt2 = con2.createStatement();
                                String mensaje2 = "UPDATE usuario" + " SET errores="+ 
                                        intentosCodigo + " WHERE user='"+ codIngresado+"';";
                                stmt2.executeUpdate(mensaje2);
                                
                            } catch (SQLException e2) {
                                System.err.println(e2);
                            }
                            return 2;
                        }
                    }
                }
            }
            if(!identificado){
                return 3;
            }
        } catch (Exception e) {
            return 0;
        }
        return 0;
    }    
}