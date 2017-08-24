/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.saturn;

/**
 *
 * @author rascencio
 */
public class LPSaturn 
{
    public static String getWiperSaturn(String palanca, String dial)
    {
        String rpms = "";
        
        if(palanca.equals("OFF"))
        {
            rpms = "0 rpms";
        }
        else if(palanca.equals("INT") && dial.equals("POS 1"))
        {
            rpms = "6 rpms";
        }
        else if(palanca.equals("INT") && dial.equals("POS 2"))
        {
            rpms = "12 rpms";
        }
        else if(palanca.equals("INT") && dial.equals("POS 3"))
        {
            rpms = "20 rpms";
        }
        else if(palanca.equals("LOW"))
        {
            rpms = "30 rpms";
        }
        else if(palanca.equals("HIGH"))
        {
            rpms = "60 rpms";
        }
        
        return rpms;        
    }
}
