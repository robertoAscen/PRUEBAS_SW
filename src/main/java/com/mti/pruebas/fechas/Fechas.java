/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.fechas;

/**
 *
 * @author Roberto Ascencio
 */
public class Fechas 
{
    //Indica si un año en formato AAAA es un año bisiesto
    public static boolean Bisiesto(int anio)
    {
        if((anio % 4) != 0) //2011
        {
            return false;            
        }
        else if(anio <= 1589)//Fecha de entrada del calendario gregoriano
        {
            return true;
        }
        else if((anio % 100) != 0)//2012
        {
            return true;
        }
        else if((anio % 400) == 0)//2000
        {
            return true;
        }
        else
        {
            return false;//1900
        }
    }    
}
