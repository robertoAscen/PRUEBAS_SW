/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.Login;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Roberto
 */
public class SeguridadServidor {
     public Key simetricKey;
     public Key GeneraAES256() throws Exception
    {
    	KeyGenerator generator = KeyGenerator.getInstance("AES", "BC");
    	Key encryptionSimetricKey;
       	generator.init(256); // 128 default; 192 y 256 son permitidos
        encryptionSimetricKey = generator.generateKey();  
        System.out.println("    Base de Datos: LLave AES generada:");
        return encryptionSimetricKey;
    }
    public byte[] EncriptaLlaveAESConRSA(Key pub, Key sk) throws Exception
    {
	Cipher cipher = Cipher.getInstance("RSA/None/NoPadding", "BC");
        cipher.init(Cipher.ENCRYPT_MODE, pub);
        byte[] cipherText = cipher.doFinal(sk.getEncoded());
        return cipherText;
    }
    public String DesencriptaMensajeAES(byte[] MensajeEncriptado, Key simetricKey) throws Exception
    {
        byte[] ivBytes = new byte[] { 
            0x00, 0x00, 0x00, 0x01, 0x04, 0x05, 0x06, 0x07,
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 };
    	Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding", "BC");
    	Key decryptionKey = new SecretKeySpec(simetricKey.getEncoded(), simetricKey.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, decryptionKey, new IvParameterSpec(ivBytes));
    	byte[] plainText = new byte[cipher.getOutputSize(MensajeEncriptado.length)];
    	int ptLength = cipher.update(MensajeEncriptado, 0, MensajeEncriptado.length, plainText, 0);
	ptLength += cipher.doFinal(plainText, ptLength);
	return new String(plainText);
    }
}