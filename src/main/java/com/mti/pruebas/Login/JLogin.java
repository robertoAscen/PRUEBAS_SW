/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.Login;

import com.mti.pruebas.Login.Validar;
import java.security.Key;
import java.security.KeyPair;

/**
 *
 * @author noriega
 */
public class JLogin extends javax.swing.JFrame {

    /**
     * Creates new form JLogin
     */
    Validar valida = new Validar();
    
    public JLogin() {
        
        initComponents();
        System.out.println("--- COMPROBACIÓN CONTRA ENCRIPTACIÓN MD5 ---");

    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtUsr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Registro");
        setBackground(new java.awt.Color(207, 245, 236));
        setLocation(new java.awt.Point(700, 400));
        setMinimumSize(new java.awt.Dimension(170, 242));

        jLabel1.setText("Usuario:");
        jLabel1.setPreferredSize(new java.awt.Dimension(67, 20));

        jTxtUsr.setToolTipText("Nombre de Usuario");

        jLabel2.setText("Password:");

        jPass.setSelectionColor(new java.awt.Color(217, 74, 79));

        jButton1.setText("Conectar");
        jButton1.setPreferredSize(new java.awt.Dimension(10, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPass)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Usua = jTxtUsr.getText();
        String Pass = new String(jPass.getPassword());      
        Consulta(Usua, Pass);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JLogin().setVisible(true);
        });
    } 
    
    public static String getHash(String txt, String hashType) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest
                    .getInstance(hashType);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
       
    static int Incor;
    public static int Consulta(String U_, String P_){
        
        SeguridadUsuario S_Usr = new SeguridadUsuario();
        Validar Conexion = new Validar();
        // Crea un usuario ne la base de datos sin encriptar
        String usr = U_;
        String pswr = P_;
        byte[] LlaveAESEncriptada;
        byte[] MensajeEncriptado;
        int ResLog = 0;
        
        Key clavePublica;
        Key clavePrivada;
        Key simetrica;
        KeyPair parAsimetrica;
        
        String data = usr + "/"+pswr+"/";
        
        if (usr.length() > 0 && pswr.length() > 0) {
            try{
                S_Usr.ClienteBC();
                clavePublica = S_Usr.RegresaPublica();
                parAsimetrica = S_Usr.RegresaLlaves();
                clavePrivada = S_Usr.RegresaPrivada();
                
                System.out.println("    RSA privada: " + Utils.toHex(clavePrivada.getEncoded())+
                        "\n    RSA publica: " + Utils.toHex(clavePublica.getEncoded()));
                
                Conexion.LoginRequest(clavePublica);
                System.out.println("S - Enviando llave AES encriptada");
                
                LlaveAESEncriptada = Conexion.RegresaLLaveEncriptada();
                System.out.println("L - Desencripta llave AES recibida.....");
                
                simetrica = S_Usr.DesencriptaLlaveAESConRSA(clavePrivada, LlaveAESEncriptada);
                System.out.println("L - Encriptando datos con llave AES.....");
                
                MensajeEncriptado = S_Usr.EncriptaMensajeAES(data, simetrica);
                System.out.println("S - Analiza informacion previo desencriptado");
                
                if (Incor <10){
                    ResLog = Conexion.login(MensajeEncriptado);
                    if(ResLog == 1) {
                        System.out.println("Acceso ");
                        Incor = 0;

                    } else if(ResLog == 2) {
                        System.out.println("Pass incorrecto");
                        Incor ++;
                        
                    } else if(ResLog == 3) {
                        System.out.println("Usuario invalido");
                        Incor ++;
                        
                    } else if (ResLog == 4) {
                        System.out.println("Usuario Bloqueado");
                    } 
                    else {
                        ResLog = 0;
                        //System.out.println("Error bd");
                    }                    
                }
            }catch(Exception e){
                System.err.println(e);
            }
        }    
        return ResLog;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jTxtUsr;
    // End of variables declaration//GEN-END:variables
}
