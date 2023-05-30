
package database;

/**
 * @author DBUSTAMANTEP
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    // private String nombreDatabase="biblioteca";

    private static Connector instance;
    private Connection connection;

    // private static final Connector connector=new Connector();
//se usa el constructor priavte ya que se va a a hacer uso del patro de diseño singleston
    /*private*/
 /*public Connector() {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:33064/biblioteca",
                    "root", "");
        }
        catch(Exception exception){
            System.out.println(exception);
        }
    }*/
    // public /*static Connector */Connection getConnection(){
    /*if(connector==null){
            connector=new Connector();
        }*/
    //return connector;
    //   return connection;
    //}
    private Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:33064/biblioteca",
                    "root", "");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static Connector getInstance() {
        if (instance == null) {
            instance = new Connector();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
