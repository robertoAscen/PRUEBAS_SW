/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.prueba.cantidadTexto;

/**
 *
 * @author rascencio
 */
public class CantidadATexto 
{
    private static int flag;
    public static String strUnidad;
    public static String strDecenas;
    public static String strCentenas;
    public static String strMiles;
    public static String strDecenasMiles;
    public static String strCentenasMiles;
    public static String strMillones;
    public static String strDecenasMillones;
    public static String strCentenasMillones;
    public static boolean respuesta;
    public static String texto;
    
    public static String cantidadATexto(long numero)
    {
        texto = getCentenasMillon(numero);
        return texto;
    }
    
    private static String getUnidades(int numero)
    {
        switch (numero)
        {
            case 9:
                strUnidad = "NUEVE ";
                break;
            case 8:
                strUnidad = "OCHO ";
                break;
            case 7:
                strUnidad = "SIETE ";
                break;
            case 6:
                strUnidad = "SEIS ";
                break;
            case 5:
                strUnidad = "CINCO ";
                break;
            case 4:
                strUnidad = "CUATRO ";
                break;
            case 3:
                strUnidad = "TRES ";
                break;
            case 2:
                strUnidad = "DOS ";
                break;
            case 1:
                if (flag == 0)
                {
                    strUnidad = "UNO ";
                }
                else
                {
                    strUnidad = "UN ";
                }
                break;
            case 0:
                strUnidad = "";
                break;
	}
            return strUnidad;
    }
    
    private static String getDecenas(int numero)
    {
        if (numero >= 90 && numero <= 99)
        {
            strDecenas = "NOVENTA ";
            if (numero > 90)
            {
                strDecenas = strDecenas.concat("Y ").concat(getUnidades(numero - 90));
            }
        }
        else if (numero >= 80 && numero <= 89)
        {
            strDecenas = "OCHENTA ";
            if (numero > 80)
            {
                strDecenas = strDecenas.concat("Y ").concat(getUnidades(numero - 80));
            }
        }
        else if (numero >= 70 && numero <= 79)
        {
            strDecenas = "SETENTA ";
            if (numero > 70)
            {
                strDecenas = strDecenas.concat("Y ").concat(getUnidades(numero - 70));
            }
        }
        else if (numero >= 60 && numero <= 69)
        {
            strDecenas = "SESENTA ";
            if (numero > 60)
            {
                strDecenas = strDecenas.concat("Y ").concat(getUnidades(numero - 60));
            }
        }
        else if (numero >= 50 && numero <= 59)
        {
            strDecenas = "CINCUENTA ";
            if (numero > 50)
            {
                strDecenas = strDecenas.concat("Y ").concat(getUnidades(numero - 50));
            }
        }
        else if (numero >= 40 && numero <= 49)
        {
            strDecenas = "CUARENTA ";
            if (numero > 40)
            {
                strDecenas = strDecenas.concat("Y ").concat(getUnidades(numero - 40));
            }
        }
        else if (numero >= 30 && numero <= 39)
        {
            strDecenas = "TREINTA ";
            if (numero > 30)
            {
                strDecenas = strDecenas.concat("Y ").concat(getUnidades(numero - 30));
            }
        }
        else if (numero >= 20 && numero <= 29)
        {
            if (numero == 20)
            {
                strDecenas = "VEINTE ";
            }
            else
            {
                strDecenas = "VEINTI".concat(getUnidades(numero - 20));
            }
        }
        else if (numero >= 10 && numero <= 19)
        {
            switch (numero)
            {
                case 10:
                    strDecenas = "DIEZ ";
                    break;
                case 11:
                    strDecenas = "ONCE";
                    break;
                case 12:
                    strDecenas = "DOCE";
                    break;
                case 13:
                    strDecenas = "TRECE";
                    break;
                case 14:
                    strDecenas = "CATORCE";
                    break;
                case 15:
                    strDecenas = "QUINCE";
                    break;
                case 16:
                    strDecenas = "DIECISEIS";
                    break;
                case 17:
                    strDecenas = "DIECISIETE";
                    break;
                case 18:
                    strDecenas = "DIECIOCHO";
                    break;
                case 19:
                    strDecenas = "DIECINUEVE";
                    break;
            }
        }
        else
        {
            strDecenas = getUnidades(numero);
        }
        return strDecenas;
    }
    
    private static String getCentenas(int numero)
    {
        if (numero >= 100)
        {
            if (numero >= 900 && numero <= 999)
            {
                strCentenas = "NOVECIENTOS ";
                if (numero > 900)
                {
                    strCentenas = strCentenas.concat(getDecenas(numero - 900));
                }
            }
            else if (numero >= 800 && numero <= 899)
            {
                strCentenas = "OCHOCIENTOS ";
                if (numero > 800)
                {
                    strCentenas = strCentenas.concat(getDecenas(numero - 800));
                }
            }
            else if (numero >= 700 && numero <= 799)
            {
                strCentenas = "SETECIENTOS ";
                if (numero > 700)
                {
                    strCentenas = strCentenas.concat(getDecenas(numero - 700));
                }
            }
            else if (numero >= 600 && numero <= 699)
            {
                strCentenas = "SEISCIENTOS ";
                if (numero > 600)
                {
                    strCentenas = strCentenas.concat(getDecenas(numero - 600));
                }
            }
            else if (numero >= 500 && numero <= 599)
            {
                strCentenas = "QUINIENTOS ";
                if (numero > 500)
                {
                    strCentenas = strCentenas.concat(getDecenas(numero - 500));
                }
            }
            else if (numero >= 400 && numero <= 499)
            {
                strCentenas = "CUATROCIENTOS ";
                if (numero > 400)
                {
                    strCentenas = strCentenas.concat(getDecenas(numero - 400));
                }
            }
            else if (numero >= 300 && numero <= 399)
            {
                strCentenas = "TRESCIENTOS ";
                if (numero > 300)
                {
                    strCentenas = strCentenas.concat(getDecenas(numero - 300));
                }
            }
            else if (numero >= 200 && numero <= 299)
            {
                strCentenas = "DOSCIENTOS ";
                if (numero > 200)
                {
                    strCentenas = strCentenas.concat(getDecenas(numero - 200));
                }
            }
            else if (numero >= 100 && numero <= 199)
            {
                if (numero == 100)
                {
                    strCentenas = "CIEN ";
                }
                else
                {
                    strCentenas = "CIENTO ".concat(getDecenas(numero - 100));
                }
            }
        }
        else
        {
            strCentenas = getDecenas(numero);
        }
        return strCentenas;	
    }
    
    private static String getMiles(int numero)
    {
        if (numero >= 1000 && numero <2000)
        {
            strMiles = ("MIL ").concat(getCentenas(numero%1000));
        }
        if (numero >= 2000 && numero <10000)
        {
            flag=1;
            strMiles = getUnidades(numero/1000).concat("MIL ").concat(getCentenas(numero%1000));
        }
        if (numero < 1000)
        {
            strMiles = getCentenas(numero);
        }
        return strMiles;
    }
    
    private static String getDecenasMiles(int numero)
    {
        if (numero == 10000)
        {
            strDecenasMiles = "DIEZ MIL"; 
        }
        if (numero > 10000 && numero <20000)
        {
            flag = 0;
            strDecenasMiles = getDecenas(numero/1000).concat("MIL ").concat(getCentenas(numero%1000));		
        }
        if (numero >= 20000 && numero <100000)
        {
            flag = 1;
            strDecenasMiles = getDecenas(numero/1000).concat("MIL ").concat(getMiles(numero%1000));		
        }
        if (numero < 10000)
        {
            strDecenasMiles = getMiles(numero);
        }
        return strDecenasMiles;
    }
    
    private static String getCentenasMiles(int numero)
    {
        if (numero == 100000)
        {
            strCentenasMiles = "CIEN MIL";
        }
        if (numero >= 100000 && numero <1000000)
        {
            flag = 1;
            strCentenasMiles = getCentenas(numero/1000).concat("MIL ").concat(getCentenas(numero%1000));
        }
        if (numero < 100000)
        {
            strCentenasMiles = getDecenasMiles(numero);
        }
        return strCentenasMiles;
    }
    
    private static String getMillones(int numero)
    {
        if (numero >= 1000000 && numero <2000000)
        {
            flag=1;
            strMillones = ("UN MILLON ").concat(getCentenasMiles(numero%1000000));
        }
        if (numero >= 2000000 && numero <10000000)
        {
            flag=1;
            strMillones = getUnidades(numero/1000000).concat("MILLONES ").concat(getCentenasMiles(numero%1000000));
        }
        if (numero < 1000000)
        {
            strMillones = getCentenasMiles(numero);
        }
        return strMillones;
    }
    
    private static String getDecenasMillon(int numero)
    {
        if (numero == 10000000)
        {
            strDecenasMillones = "DIEZ MILLONES";
        }
        if (numero > 10000000 && numero < 20000000)
        {
            flag = 1;
            strDecenasMillones = getDecenas(numero/1000000).concat("MILLONES ").concat(getCentenasMiles(numero%1000000));		
        }
        if (numero >= 20000000 && numero < 100000000)
        {
            flag = 1;
            strDecenasMillones = getDecenas(numero/1000000).concat("MILLONES ").concat(getMillones(numero%1000000));		
        }
        if (numero < 10000000)
        {
            strDecenasMillones = getMillones(numero);
        }
        return strDecenasMillones;
    }
    
    private static String getCentenasMillon(long numero)// El ultimo número que debe aceptar es el 999,999,999
    {
    	if(numero == 100000000)
    	{
            strCentenasMillones = "CIEN MILLONES";
    	}
    	if(numero > 100000000 && numero < 1000000000)
    	{
            flag=1;
            strCentenasMillones = getCentenas((int) (numero/1000000)).concat("MILLONES ").concat(getMillones((int) (numero%1000000)));
    	}
        if(numero < 100000000)
        {
            strCentenasMillones = getDecenasMillon((int) numero);
        }        
        return strCentenasMillones;
    }
}