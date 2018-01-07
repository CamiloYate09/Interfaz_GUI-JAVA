/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guinivel1;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Kernel-2018
 */
public class GUInivel1 extends JFrame {
    
    public GUInivel1() {
        
        JLabel saludo = new JLabel();
        saludo.setBounds(25, 10, 200, 30);
        
        JLabel pasosiguiente = new JLabel("Ingrese su nombre");
        pasosiguiente.setBounds(25, 165, 200, 30);
        JTextField camposaludo = new JTextField(200);
        camposaludo.setBounds(25, 200, 200, 30);
        JButton boton = new JButton("Saludar!!!!");
        boton.setBounds(25, 235, 150, 30);

        //----------------------------------------------
        ActionListener presion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                saludo.setText("Hola Bienvenido \n" + camposaludo.getText());
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        boton.addActionListener(presion);
        //-.---------------------------------------------
        
        add(saludo);
        add(pasosiguiente);
        add(camposaludo);
        add(boton);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new GUInivel1();
        
    }
    
}
