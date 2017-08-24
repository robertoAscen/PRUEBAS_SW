/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.prueba.racional;

/**
 *
 * @author rascencio
 */
public class Racional 
{
    private int numerador,denominador;
    //private static int numerador,denominador;
    
    public Racional()
    {
        numerador=1;
        denominador=0;
    }
    
    public Racional( int nume,int deno)
    {
        numerador=nume;
        denominador=deno;
    }
    
    
    public static Racional suma(Racional a, Racional b)
    {
        Racional c= new Racional();
        c.numerador=(a.numerador*b.denominador)+(b.numerador*a.denominador);
        c.denominador=a.denominador*b.denominador;
        if(a.denominador==0 || b.denominador==0)
            return new Racional(0,0);
        return c;
    }
    
    public static Racional resta(Racional a, Racional b)
    {
        Racional c= new Racional();
        c.numerador=(a.numerador*b.denominador)-(b.numerador*a.denominador);
        c.denominador=a.denominador*b.denominador;
        if(a.denominador==0 || b.denominador==0)
            return new Racional(0,0);
        return c;
    }
    
    public static Racional multi(Racional a, Racional b)
    {
        Racional c= new Racional();
        c.numerador=a.numerador*b.numerador;
        c.denominador=a.denominador*b.denominador;
        if(a.denominador==0 || b.denominador==0)
            return new Racional(0,0);
        return c;
    }
    
    public static Racional divi(Racional a, Racional b)
    {
        Racional c= new Racional();
        c.numerador=a.numerador*b.denominador;
        c.denominador=a.denominador*b.numerador;
        if(a.denominador==0 || b.denominador==0)
            return new Racional(0,0);
        return c;
    }
    
    int mcd()
    {
        if(denominador==0)
        {
            return 0;
        }
       
        int a = Math.max(Math.abs(numerador), Math.abs(denominador));
        int b = Math.min(Math.abs(numerador), Math.abs(denominador));
        int res;        
        do 
        {
            res = b;
            b = a%b;
            a = res;
        } while (b!=0);
        return res;
    }
    
    public Racional simplificado()
    {
        int dividir=mcd();
        if(denominador==0)
            return new Racional(0,0);
        numerador/=dividir;
        denominador/=dividir;
        return this;
    }
    
    public String convertir()
    {
        if(denominador==0)
            return "e";
        return numerador+"/"+denominador;
    }    
}
