/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.prueba.racional;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import org.junit.Before;

/**
 *
 * @author rascencio
 */
public class PruebaRacional 
{
    @Before public void setUp()
    {
        Racional test_1 = new Racional(4,0);
        Racional test_2 = new Racional(2,4);
        
    }
    
    @Test public void C()
    {
        
    }
    
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter(PruebaRacional.class);
    }    
}
