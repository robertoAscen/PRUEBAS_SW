/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.forma;

import java.awt.EventQueue;

/**
 *
 * @author rascencio
 */
public class Launcher 
{
    public static JFrameMain jFrameMain = new JFrameMain();
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                Launcher.getFrameMain().setVisible(true);
                Launcher.getFrameMain().setLocationRelativeTo(null);
            }
        });        
    }
    
    public static JFrameMain getFrameMain()
    {
        return jFrameMain;
    }    
    
}
