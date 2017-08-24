/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.pruebas.forma;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rascencio
 */
public class JFrameMain extends JFrame
{
    private JLabel jlNombre;
    private JLabel jlImporte;
    private JLabel jlTelefono;
    private JTextField jtfNombre;    
    private JTextField jtfImporte;    
    private JTextField jtfTelefono;
    private JButton jbValidation;
    private ValidateForm vF;
    
    public JFrameMain()
    {
        initComponents();       
    }
    
    public void initComponents()
    {
        setLayout(null);
        
        jlNombre = new JLabel();
        jlImporte = new JLabel();
        jlTelefono = new JLabel();
        jtfNombre = new JTextField();
        jtfImporte = new JTextField();
        jtfTelefono = new JTextField();
        jbValidation = new JButton();
        vF = new ValidateForm();
        
        jlNombre.setText("Nombre");
        jlNombre.setBounds(10, 10, 80, 20);
        add(jlNombre);
        
        jtfNombre.setBounds(110, 10, 300, 20);
        add(jtfNombre);
        
        jlImporte.setText("Importe");
        jlImporte.setBounds(10, 50, 80, 20);
        add(jlImporte);
        
        jtfImporte.setBounds(110, 50, 300, 20);
        add(jtfImporte);
        
        jlTelefono.setText("Teléfono");
        jlTelefono.setBounds(10, 90, 80, 20);
        add(jlTelefono);
        
        jtfTelefono.setBounds(110, 90, 300, 20);
        add(jtfTelefono);       
        
        jbValidation.setBounds(110, 120, 250, 20);
        jbValidation.setText("Validar");
        add(jbValidation);
        jbValidation.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
                jbValidationPerformed(e);
            }
        });
        
        setSize(450, 180);  
        setResizable(false);
        setTitle("FORMA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);            
    }  
    
    private void jbValidationPerformed(ActionEvent evt)
    {
        if(vF.getValidationName(jtfNombre.getText()))
        {
            jtfNombre.setBackground(Color.GREEN);
        }
        else
        {
            jtfNombre.setBackground(Color.RED);
        }
        
        if(vF.getValidationImporte(jtfImporte.getText()))
        {
            jtfImporte.setBackground(Color.GREEN);
            
        }
        else
        {
            jtfImporte.setBackground(Color.RED);
        }
        
        if(vF.getValidationPhoneNumber(jtfTelefono.getText()))
        {
            jtfTelefono.setBackground(Color.GREEN);
        }
        else
        {
            jtfTelefono.setBackground(Color.RED);
        }           
    }
}
