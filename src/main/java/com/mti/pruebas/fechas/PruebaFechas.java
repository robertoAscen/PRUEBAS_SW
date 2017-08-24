/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.fechas;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import junit.framework.JUnit4TestAdapter;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Roberto Ascencio
 */
public class PruebaFechas 
{
    @Test public void BisiestoMcCabe()
    {
        assertTrue(Fechas.Bisiesto(1500));
        assertTrue(Fechas.Bisiesto(2000));
        assertFalse(Fechas.Bisiesto(1900));
        assertFalse(Fechas.Bisiesto(2011));
        assertTrue(Fechas.Bisiesto(2012));
    }  
    
    @Before public void setUp()
    {
        
    }
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter(PruebaFechas.class);
    }
}