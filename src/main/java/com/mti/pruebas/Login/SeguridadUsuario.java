/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.Login;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 *
 * @author Roberto
 */
public class SeguridadUsuario {
    
    private KeyPair asimetricas;
    private Key privKey;
    private Key pubKey;
    private SecureRandom random;
    
    public void ClienteBC() throws Exception, NullPointerException
    {
        try
        {
            Security.addProvider(new BouncyCastleProvider());
        } catch (NullPointerException e1)
        {
        }
        // Quita el candado de 128 bits de la JVM
	try {
            HookCap1.PermiteLlavesGrandes();
	} catch (Exception e1) 
        {
        }
        GeneraRSA2048();
        /*
        As = new Asimetricas();
        As.GeneraAsimetricas();
         */
    }
    public void GeneraRSA2048() throws Exception
    {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA", "BC");
        random = new SecureRandom();
        keyGen.initialize(2048, random); 
        asimetricas = keyGen.generateKeyPair();
        privKey = asimetricas.getPrivate();
        pubKey = asimetricas.getPublic();
    }
    
    public Key DesencriptaLlaveAESConRSA(Key pk, byte[] criptogramaAES) throws Exception
    {
        System.out.println("    Cliente: Desencriptando llave AES");
    	Cipher cipher = Cipher.getInstance("RSA/None/NoPadding", "BC");
    	cipher.init(Cipher.DECRYPT_MODE, pk);
    	byte[] plainAES = cipher.doFinal(criptogramaAES);
    	System.out.println("    plainAES:  " + Utils.toHex(plainAES));  
    	SecretKey decryptionKey = new SecretKeySpec(plainAES, "AES");
    	return decryptionKey;
    }
    
    public byte[] EncriptaMensajeAES(String Mensaje, Key simetricKey) throws Exception
    {
        byte[] ByteMensaje = Utils.toByteArray(Mensaje);
        byte[] ivBytes = new byte[] { 
        0x00, 0x00, 0x00, 0x01, 0x04, 0x05, 0x06, 0x07,
        0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 };
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding", "BC");
        cipher.init(Cipher.ENCRYPT_MODE, simetricKey, new IvParameterSpec(ivBytes));
        byte[] cipherText = new byte[cipher.getOutputSize(ByteMensaje.length)];
        int ctLength = cipher.update(ByteMensaje, 0, ByteMensaje.length, cipherText, 0);
        ctLength += cipher.doFinal(cipherText, ctLength);
        return cipherText;
    }
    
    public Key RegresaPublica() throws Exception
    {
    	return pubKey;
    }
    public KeyPair RegresaLlaves() throws Exception
    {
    	return asimetricas;
    }
    public Key RegresaPrivada() throws Exception
    {
    	return privKey;
    }
}
