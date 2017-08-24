/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.saturn;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import junit.framework.JUnit4TestAdapter;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author rascencio
 */
public class PruebaLPSaturn 
{
    @Test public void wisperSaturn()
    {
        assertEquals(LPSaturn.getWiperSaturn("OFF", "POS 1"),"0 rpms");
        assertEquals(LPSaturn.getWiperSaturn("INT", "POS 1"), "6 rpms");
        assertEquals(LPSaturn.getWiperSaturn("INT", "POS 2"), "12 rpms");
        assertEquals(LPSaturn.getWiperSaturn("INT", "POS 3"), "20 rpms");
        assertEquals(LPSaturn.getWiperSaturn("LOW", "POS 1"), "30 rpms");
        assertEquals(LPSaturn.getWiperSaturn("HIGH", "POS 1"), "60 rpms");   
        assertEquals(LPSaturn.getWiperSaturn("LOW", "POS 2"), "30 rpms");
        assertEquals(LPSaturn.getWiperSaturn("HIGH", "POS 2"), "60 rpms"); 
        assertEquals(LPSaturn.getWiperSaturn("LOW", "POS 3"), "30 rpms");
        assertEquals(LPSaturn.getWiperSaturn("HIGH", "POS 3"), "60 rpms"); 
    }
    
    @Before public void setUp()
    {
        
    }
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter(PruebaLPSaturn.class);
    }
}
