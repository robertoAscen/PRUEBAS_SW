/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.forma;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import junit.framework.JUnit4TestAdapter;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author rascencio
 */
public class PruebaValidateForm 
{    
    @Test public void FormaPartEquivalencia()
    {
        assertFalse(ValidateForm.getValidationName(""));
        assertTrue(ValidateForm.getValidationName("r"));
        assertTrue(ValidateForm.getValidationName("R"));
        assertTrue(ValidateForm.getValidationName("Roberto"));
        assertTrue(ValidateForm.getValidationName("Roberto "));
        assertTrue(ValidateForm.getValidationName("Roberto A"));
        assertTrue(ValidateForm.getValidationName("Roberto 1"));
        assertTrue(ValidateForm.getValidationName("Roberto Ascencio"));
        assertTrue(ValidateForm.getValidationName("Roberto Ascencio "));
        assertTrue(ValidateForm.getValidationName("Roberto Ascencio L"));
        assertTrue(ValidateForm.getValidationName("Roberto Ascencio 4"));
        assertTrue(ValidateForm.getValidationName("Roberto Ascencio Lopez"));
        assertFalse(ValidateForm.getValidationName("Brhadaranyakopanishadvivekachudamani Erreh"));
        
        assertFalse(ValidateForm.getValidationImporte(""));
        assertTrue(ValidateForm.getValidationImporte("-"));
        assertTrue(ValidateForm.getValidationImporte("-1"));
        assertTrue(ValidateForm.getValidationImporte("-12"));
        assertTrue(ValidateForm.getValidationImporte("-123"));
        assertTrue(ValidateForm.getValidationImporte("-1234"));
        assertTrue(ValidateForm.getValidationImporte("-12345"));
        assertTrue(ValidateForm.getValidationImporte("-123456"));
        assertTrue(ValidateForm.getValidationImporte("-1234567"));
        assertTrue(ValidateForm.getValidationImporte("-12345678"));
        assertTrue(ValidateForm.getValidationImporte("-123456789"));
        assertTrue(ValidateForm.getValidationImporte("-1234567890"));
        assertTrue(ValidateForm.getValidationImporte("-1234567890.1"));
        assertTrue(ValidateForm.getValidationImporte("-1234567890.10"));
        assertFalse(ValidateForm.getValidationImporte("-1234567890.101"));
        assertFalse(ValidateForm.getValidationImporte("-1234567890.101"));
        assertTrue(ValidateForm.getValidationImporte("1234567890.10"));
        assertTrue(ValidateForm.getValidationImporte("1234567890.1"));
        assertTrue(ValidateForm.getValidationImporte("1234567890"));
        assertTrue(ValidateForm.getValidationImporte("123456789"));
        assertTrue(ValidateForm.getValidationImporte("12345678"));
        assertTrue(ValidateForm.getValidationImporte("1234567"));
        assertTrue(ValidateForm.getValidationImporte("123456"));
        assertTrue(ValidateForm.getValidationImporte("12345"));
        assertTrue(ValidateForm.getValidationImporte("1234"));
        assertTrue(ValidateForm.getValidationImporte("123"));
        assertTrue(ValidateForm.getValidationImporte("12"));
        assertTrue(ValidateForm.getValidationImporte("1"));        
        
        assertFalse(ValidateForm.getValidationPhoneNumber(""));
        assertFalse(ValidateForm.getValidationPhoneNumber("1"));
        assertFalse(ValidateForm.getValidationPhoneNumber("12"));
        assertFalse(ValidateForm.getValidationPhoneNumber("123"));
        assertFalse(ValidateForm.getValidationPhoneNumber("1234"));
        assertFalse(ValidateForm.getValidationPhoneNumber("12345"));
        assertFalse(ValidateForm.getValidationPhoneNumber("123456"));
        assertFalse(ValidateForm.getValidationPhoneNumber("1234567"));
        assertFalse(ValidateForm.getValidationPhoneNumber("12345678"));
        assertFalse(ValidateForm.getValidationPhoneNumber("123456789"));
        assertTrue(ValidateForm.getValidationPhoneNumber("1234567890"));
        assertFalse(ValidateForm.getValidationPhoneNumber("12345678901"));        
    }   
    
    @Before public void setUp()
    {
        
    }
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter(PruebaValidateForm.class);
    }
}
