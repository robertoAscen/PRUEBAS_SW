/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.practicasjunit;

import com.mti.prueba.cantidadTexto.PruebaCantidadATexto;
import com.mti.prueba.racional.PruebaRacional;
import com.mti.pruebas.fechas.PruebaFechas;
import com.mti.pruebas.forma.PruebaValidateForm;
import com.mti.pruebas.saturn.PruebaLPSaturn;
import com.mti.pruebas.triangulo.PruebaTriangulo;

/**
 *
 * @author Roberto Ascencio
 */
public class RegresionJUnit 
{
    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(PruebaFechas.suite());
        junit.textui.TestRunner.run(PruebaTriangulo.suite());
        junit.textui.TestRunner.run(PruebaValidateForm.suite());
        junit.textui.TestRunner.run(PruebaLPSaturn.suite());
        junit.textui.TestRunner.run(PruebaCantidadATexto.suite());
        junit.textui.TestRunner.run(PruebaRacional.suite());
    }    
}
