/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.forma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rascencio
 */
public class ValidateForm 
{
    private static boolean validation;
    
    public static boolean getValidationName(String name)
    {
        Pattern patt = Pattern.compile("[[0-9a-zA-Z]{1}[a-z]+\\p{Punct}+\\s{1}[0-9a-zA-Z]{1}[a-z]+\\p{Punct}+\\s{1}[0-9a-zA-Z]{1}[a-z]+\\p{Punct}+\\s?]{1,30}");
        Matcher match = patt.matcher(name);
        
        if(match.matches())
        {
            return validation = true;            
        }
        else
        {
            return validation = false;
        }     
    }
    
    public static boolean getValidationImporte(String importe)
    {
        Pattern patt = Pattern.compile("[-]?[0-9]{0,10}.[0-9]{0,2}");
        Matcher match = patt.matcher(importe);
        
        if(match.matches())
        {
            return validation = true;            
        }
        else
        {
            return validation = false;
        }  
    }
    
    public static boolean getValidationPhoneNumber(String phoneNumber)
    {
        Pattern patt = Pattern.compile("[0-9]{10}");
        Matcher match = patt.matcher(phoneNumber);
        
        if(match.matches())
        {
            return validation = true;            
        }
        else
        {
            return validation = false;
        }        
    }   
}
