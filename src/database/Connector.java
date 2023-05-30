/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author DBUSTAMANTEP
 */

import java.sql.*;

public class Connector {
    private String nombreDatabase="biblioteca";
    private Connection connection=null;
    //private static Connector connector;
    
//se usa el constructor priavte ya que se va a a hacer uso del patro de diseño singleston
    /*private*/ public Connector() {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:33064/biblioteca",
                    "root", "");
        }
        catch(Exception exception){
            System.out.println(exception);
        }
    }

    public /*static Connector */Connection getConnection() {
        
        /*if(connector==null){
            connector=new Connector();
        }
        return connector;*/
        return connection;
    }
    
    
}
