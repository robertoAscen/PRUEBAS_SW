/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.triangulo;

/**
 *
 * @author Roberto Ascencio
 */
public class Triangulo 
{
    //private int tipoTriangulo = 0;    
    
    public static int getTipoTriangulo(int lado_1, int lado_2, int lado_3)
    {
        if((lado_1>0 && lado_2>0 && lado_3>0) && (lado_1+lado_2 > lado_3 && lado_1+lado_3 > lado_2 && lado_2+lado_3 > lado_1) && (lado_1 == lado_2 && lado_1 == lado_3))
            {
                int tipoTriangulo = 2;//Equilátero
                return tipoTriangulo;           
            }
            else
                if((lado_1>0 && lado_2>0 && lado_3>0) && (lado_1+lado_2 > lado_3 && lado_1+lado_3 > lado_2 && lado_2+lado_3 > lado_1) && ((lado_1 == lado_2 && lado_1 != lado_3) || (lado_1 == lado_3 && lado_1 != lado_2) || (lado_2 == lado_3 && lado_2 != lado_1)))
                {
                    int tipoTriangulo = 1;//Isósceles
                    return tipoTriangulo;
                }
                    else
                        if((lado_1>0 && lado_2>0 && lado_3>0) && (lado_1+lado_2 > lado_3 && lado_1+lado_3 > lado_2 && lado_2+lado_3 > lado_1) && (lado_1 != lado_2 && lado_1 != lado_3 && lado_1 != lado_2))
                        {
                            int tipoTriangulo = 3;//Escaleno
                            return tipoTriangulo;                    
                        }
                            else
                            {
                                int tipoTriangulo = 0;//Error de triangulo
                                return tipoTriangulo;
                            }
    }       
}