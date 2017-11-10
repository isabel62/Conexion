/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import javax.swing.*;
import java.awt.*;
//PASO 14-IMPORTAR LA CLASE CONEXCION
import bd.ConexionBD;
import java. sql.Connection;
import java.awt.event.*;
/**
 *
 * @author LAB08
 */
public class Interfaz extends JFrame 
{
 JPanel panel;
 JLabel label;
 JTextField text;
 JButton boton;
 JButton boton2;
 //PASO 15-Creacion de un objeto tipo ConoxionBD
 ConexionBD con;
 public Interfaz()
 {
panel = new JPanel();
label= new JLabel();
text =new JTextField(20);
boton=new JButton();
boton2=new JButton();

this.add(panel);
panel.add(label);
panel.add(text);
panel.add(boton);
panel.add(boton2);

label.setText("ATRBUTO");
boton.setText("Conectar");
boton.setText("Desconextar");
panel.setBackground(Color.BLUE);
//PASO 16 AGREGAMOS ESCUCHADORES AL BOTON
boton.addA{ionListener()

    public void actionPerformed(ActionEvent evt)
     {       ctionListener(new Act
       con=new ConexionBD() ; 
       
      Connection reg = con.conectar();
      
      }  
});




     


   

 