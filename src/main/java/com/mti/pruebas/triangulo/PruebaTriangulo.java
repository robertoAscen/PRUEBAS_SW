/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.triangulo;

import com.mti.pruebas.fechas.PruebaFechas;
import junit.framework.JUnit4TestAdapter;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Roberto Ascencio
 */
public class PruebaTriangulo 
{
    @Test public void TrianguloMcCabe()
    {
        int resultadoEsperado_1 = 1;
        int resultadoEsperado_2 = 2;
        int resultadoEsperado_3 = 3;
        int resultadoEsperado_4 = 0;
        
        int resultadoReal_1;
        int resultadoReal_2;
        int resultadoReal_3;
        int resultadoReal_4;
        
        resultadoReal_1 = Triangulo.getTipoTriangulo(3,3,5);   
        resultadoReal_2 = Triangulo.getTipoTriangulo(3,3,3);
        resultadoReal_3 = Triangulo.getTipoTriangulo(3,4,5);
        resultadoReal_4 = Triangulo.getTipoTriangulo(0,0,0);
        
        assertEquals(resultadoEsperado_1, resultadoReal_1);
        assertEquals(resultadoEsperado_2, resultadoReal_2);
        assertEquals(resultadoEsperado_3, resultadoReal_3);
        assertEquals(resultadoEsperado_4, resultadoReal_4);
    }
    
    @Test public void TrianguloValoresLimite()
    {
        //Caso Normal Nominal 4n+1        
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 1), 2);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 200), 0);
        
        //Caso Normal Robusto 6n+1
        assertEquals(Triangulo.getTipoTriangulo(0, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 1), 2);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 0, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 201, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 201), 0);
        
        //Peor Caso Nominal 5^n
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 1), 2);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 1), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 2), 2);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 1), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 100), 2);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 1), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 199), 2);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 2), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 100), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 2), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 100), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 1), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 200), 2);

        
        //Peor Caso Robusto 7 ^n
        assertEquals(Triangulo.getTipoTriangulo(0, 0, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 0, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 0, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 0, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 0, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 0, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 0, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 1, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 1, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 2, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 2, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 2, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 2, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 2, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 100, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 100, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 100, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 100, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 110, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 199, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 199, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 199, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 199, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 199, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 199, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 200, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 200, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 200, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 200, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 200, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 200, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 201, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 201, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 201, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 201, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 201, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 201, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(0, 201, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 0, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 0, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 0, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 0, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 0, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 0, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 0, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 1), 2);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 1, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 2, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 100, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 110, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 199, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(1, 200, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 201, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 201, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 201, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 201, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 201, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 201, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(1, 201, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 0, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 0, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 0, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 0, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 0, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 0, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 0, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 1, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 1), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 2), 2);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 2, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 100, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 110, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(2, 199, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(2, 200, 201), 3);
        assertEquals(Triangulo.getTipoTriangulo(2, 201, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 201, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 201, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 201, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 201, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(2, 201, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(2, 201, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 0, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 0, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 0, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 0, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 0, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 0, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 0, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 1, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 2, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 1), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 100), 2);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 100, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(100, 199, 201), 3);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(100, 200, 201), 3);
        assertEquals(Triangulo.getTipoTriangulo(100, 201, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 201, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 201, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 201, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(100, 201, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(100, 201, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(100, 201, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 0, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 0, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 0, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 0, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 0, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 0, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 0, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 1, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 2, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 100, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 110, 201), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 1), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 199), 2);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 199, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 2), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 100), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 200, 201), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 201, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 201, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 201, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(199, 201, 100), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 201, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(199, 201, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(199, 201, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 0, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 0, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 0, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 0, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 0, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 0, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 0, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 1, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 2, 201), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 100, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 110, 201), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 2), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 100), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 199, 201), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 1), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 200), 2);
        assertEquals(Triangulo.getTipoTriangulo(200, 200, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 201, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 201, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(200, 201, 2), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 201, 100), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 201, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(200, 201, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(200, 201, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 0, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 0, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 0, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 0, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 0, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 0, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 0, 201), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 1, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 1, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 1, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 1, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 1, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 1, 200), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 1, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 2, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 2, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 2, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 2, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 2, 199), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 2, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(201, 2, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 100, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 100, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 100, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 100, 100), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 100, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(201, 100, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(201, 110, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 199, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 199, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 199, 2), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 199, 100), 3);
        assertEquals(Triangulo.getTipoTriangulo(201, 199, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 199, 200), 3);
        assertEquals(Triangulo.getTipoTriangulo(201, 199, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 200, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 200, 1), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 200, 2), 3);
        assertEquals(Triangulo.getTipoTriangulo(201, 200, 100), 3);
        assertEquals(Triangulo.getTipoTriangulo(201, 200, 199), 3);
        assertEquals(Triangulo.getTipoTriangulo(201, 200, 200), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 200, 201), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 201, 0), 0);
        assertEquals(Triangulo.getTipoTriangulo(201, 201, 1), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 201, 2), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 201, 100), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 201, 199), 1);
        assertEquals(Triangulo.getTipoTriangulo(201, 201, 200), 1);        
        
    }
    
    
    @Before public void setUp()
    {
        
    }
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter(PruebaTriangulo.class);
    }
}
