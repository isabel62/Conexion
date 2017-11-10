/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;//Paso 10 necesario para conexcion con MySQL
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LAB08
 */
public class conexcionBD
{   
 private static Connection conex;
 // PASO 11-DECLARAMOS OBJETOS PARA LA CONEXCION
private static final String DRIVER="com.mysql.jdbc.Driver";
private static final String USER="root";
private static final String PASS="";
private static final String URL="jdbc:mysql:/"
      
   //PASO 12 
        public ConnectionBD();
        {             
    conex = null;
    //Metodo para manejar excepcion
    try
    { 
    Class.forName(DRIVE);
    conex=DriverManager.getConnection(URL, USER,PASS);
    if (conex !=null)
        ´{
System.out.pritln("Conexcion Establecida");
           }  
   }   
catch(ClassNotFoundException ! SQLE
{  
 System.out.println("Error en la Conexion");
        }
     }
        //PASO 13 DEFINICION METODOS PARA CONECTAR Y DESCONOCIDO
        public Connection conectar()
        {       
         return conex;//  
        }
        public void desconectar()
        {
            conex=null;
            if (conex==null)
            {
                System.out.println("Conexcion Finalizada");
            } 
            
                 }   
            }