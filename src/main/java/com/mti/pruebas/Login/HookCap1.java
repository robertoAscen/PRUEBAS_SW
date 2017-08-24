/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.Login;

import java.lang.reflect.Field;

/**
 *
 * @author Roberto
 */

public class HookCap1 
{
    public static void PermiteLlavesGrandes() throws Exception, IllegalAccessException
    {
	try 
        {
            Field field = Class.forName("javax.crypto.JceSecurity").getDeclaredField("isRestricted");
            field.setAccessible(true);
            field.set(null, java.lang.Boolean.FALSE);
	} catch (IllegalAccessException ex) 
        {
        }
    }
	
}