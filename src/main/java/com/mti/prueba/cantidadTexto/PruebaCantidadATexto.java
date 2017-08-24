/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.prueba.cantidadTexto;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import junit.framework.JUnit4TestAdapter;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author rascencio
 */
public class PruebaCantidadATexto 
{
    @Test public void TestCantidadATexto()
    {
        assertEquals(CantidadATexto.cantidadATexto(1), "UNO ");
        assertEquals(CantidadATexto.cantidadATexto(10), "DIEZ ");
        assertEquals(CantidadATexto.cantidadATexto(100), "CIEN ");
        assertEquals(CantidadATexto.cantidadATexto(101), "CIENTO UNO ");
        assertEquals(CantidadATexto.cantidadATexto(1000),"MIL ");
        assertEquals(CantidadATexto.cantidadATexto(1101), "MIL CIENTO UNO ");
        assertEquals(CantidadATexto.cantidadATexto(10000), "DIEZ MIL");
        assertEquals(CantidadATexto.cantidadATexto(10101), "DIEZ MIL CIENTO UNO ");
        assertEquals(CantidadATexto.cantidadATexto(100000), "CIEN MIL ");
        assertEquals(CantidadATexto.cantidadATexto(100001), "CIEN MIL UN ");
        assertEquals(CantidadATexto.cantidadATexto(100100), "CIEN MIL CIEN ");
        assertEquals(CantidadATexto.cantidadATexto(100101), "CIEN MIL CIENTO UN ");
        assertEquals(CantidadATexto.cantidadATexto(101001), "CIENTO UN MIL UN ");
        assertEquals(CantidadATexto.cantidadATexto(101100), "CIENTO UN MIL CIEN ");
        assertEquals(CantidadATexto.cantidadATexto(101101), "CIENTO UN MIL CIENTO UN ");
        assertEquals(CantidadATexto.cantidadATexto(1000000), "UN MILLON ");
        assertEquals(CantidadATexto.cantidadATexto(1000001), "UN MILLON UN ");
        assertEquals(CantidadATexto.cantidadATexto(1000100), "UN MILLON CIEN ");
        assertEquals(CantidadATexto.cantidadATexto(1000101), "UN MILLON CIENTO UN ");
        assertEquals(CantidadATexto.cantidadATexto(1001000), "UN MILLON MIL ");
        assertEquals(CantidadATexto.cantidadATexto(1001001), "UN MILLON MIL UN ");
        assertEquals(CantidadATexto.cantidadATexto(1001100), "UN MILLON MIL CIEN ");
        assertEquals(CantidadATexto.cantidadATexto(1001101), "UN MILLON MIL CIENTO UN ");
        assertEquals(CantidadATexto.cantidadATexto(10000000), "DIEZ MILLONES");
        assertEquals(CantidadATexto.cantidadATexto(10000001), "DIEZ MILLONES UN ");
        assertEquals(CantidadATexto.cantidadATexto(10000100), "DIEZ MILLONES CIEN ");
        assertEquals(CantidadATexto.cantidadATexto(10000101), "DIEZ MILLONES CIENTO UN ");
        assertEquals(CantidadATexto.cantidadATexto(10001000), "DIEZ MILLONES MIL ");
        assertEquals(CantidadATexto.cantidadATexto(10001001), "DIEZ MILLONES MIL UN ");
        assertEquals(CantidadATexto.cantidadATexto(10001100), "DIEZ MILLONES MIL CIEN ");
        assertEquals(CantidadATexto.cantidadATexto(10001101), "DIEZ MILLONES MIL CIENTO UN ");
        assertEquals(CantidadATexto.cantidadATexto(100000000), "CIEN MILLONES");
        assertEquals(CantidadATexto.cantidadATexto(100000001), "CIEN MILLONES UN ");
        assertEquals(CantidadATexto.cantidadATexto(100000100), "CIEN MILLONES CIEN ");
        assertEquals(CantidadATexto.cantidadATexto(100000101), "CIEN MILLONES CIENTO UN ");
        assertEquals(CantidadATexto.cantidadATexto(100001000), "CIEN MILLONES MIL ");
        assertEquals(CantidadATexto.cantidadATexto(100001001), "CIEN MILLONES MIL UN ");
        assertEquals(CantidadATexto.cantidadATexto(100001100), "CIEN MILLONES MIL CIEN ");
        assertEquals(CantidadATexto.cantidadATexto(100001101), "CIEN MILLONES MIL CIENTO UN ");
    }
    
    @Before public void setUp()
    {
        
    }
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter(PruebaCantidadATexto.class);
    }    
}
