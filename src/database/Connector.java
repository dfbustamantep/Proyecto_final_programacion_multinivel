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
    private String nombreDatabase="";
    private Connection connection=null;

    public Connector() {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "",
                    "root", "");
        }
        catch(Exception exception){
            System.out.println(exception);
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
    
}
