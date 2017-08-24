/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.Login;

import junit.framework.JUnit4TestAdapter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 *
 * @author Roberto
 */
public class Trans_estados_login {
     public static void main(String[] args){
        junit.textui.TestRunner.run((Trans_estados_login.suite()));
        
    }    
          
    @Test
    public void testPrueba() {
        
        //Usuario incorrecto
        assertEquals(JLogin.Consulta("j","a"),3);
        assertEquals(JLogin.Consulta("33","33"),3);
        assertEquals(JLogin.Consulta("44","44"),3);
        
        //Contraseña incorrecta
        /*assertEquals(JLogin.Consulta("roberto","roberto"),2);
        assertEquals(JLogin.Consulta("roberto","aaa"),2);
        assertEquals(JLogin.Consulta("roberto","ddd"),2);
        assertEquals(JLogin.Consulta("elisa","ddd"),2);*/
        
        //Correcto
        assertEquals(JLogin.Consulta("roberto","ascencio"),1);
        assertEquals(JLogin.Consulta("elisa","ascencio"),1);
        assertEquals(JLogin.Consulta("mti","cucea"),1);

        //Bloqueo
        assertEquals(JLogin.Consulta("roberto","www"),2);
        assertEquals(JLogin.Consulta("roberto","333"),2);
        assertEquals(JLogin.Consulta("roberto","qwerty"),2);
        assertEquals(JLogin.Consulta("roberto","33df"),4);
    }
        
     public static junit.framework.Test suite() 
    {
        return new JUnit4TestAdapter(Trans_estados_login.class);
    }
}



    
    
