/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.Imp;

import DAO.Interfaces.DAOLibros;
import Modelo.Libros;
import database.Connector;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author DBUSTAMANTEP
 */
public class DAOLibrosImpl extends Connector implements DAOLibros {

    Connector connector=null;

    public DAOLibrosImpl() {
        this.connector=new Connector();
    }
    
    @Override
    public void Registrar(Libros libro) throws Exception {
        String sql="INSERT INTO libros (ISBN,nombre,autor,fechaPublicacion,nEjemplares,nEjemplaresDisponibles,resumen) VALUES (?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement st;
             st = connector.getConnection().prepareStatement(sql);
             st.setInt(1, libro.getISBN());
             st.setString(2, libro.getNombre());
             st.setString(3, libro.getAutor());
             st.setString(4, libro.getFechaPublicacion());
             st.setInt(5,libro.getnEjemplares());
             st.setInt(6,libro.getnEjemplaresDisponibles());
             st.setString(7, libro.getResumen());
             
             st.executeUpdate();
             st.close();
             connector.getConnection().close();
        }catch(Exception e){
            System.out.println("Error registro "+e);
        }
    }

    @Override
    public void Modificar(Libros libro) throws Exception {
        String sql="UPDATE libros SET ISBN=?,nombre=?,autor=?,fechaPublicacion=?,nEjemplares=?,nEjemplaresDisponibles=?,resumen=?";
        
        try{
            PreparedStatement st;
             st = connector.getConnection().prepareStatement(sql);
             st.setInt(1, libro.getISBN());
             st.setString(2, libro.getNombre());
             st.setString(3, libro.getAutor());
             st.setString(4, libro.getFechaPublicacion());
             st.setInt(5,libro.getnEjemplares());
             st.setInt(6,libro.getnEjemplaresDisponibles());
             st.setString(7, libro.getResumen());
             
             st.executeUpdate();
             st.close();
             connector.getConnection().close();
        }catch(Exception e){
            System.out.println("Error registro "+e);
        }
    }

    @Override
    public void Eliminar(int ISBN) throws Exception {
        String sql="DELETE FROM libros WHERE ISBN=?;";
        
        try{
            PreparedStatement st;
             st = connector.getConnection().prepareStatement(sql);
             st.setInt(1, ISBN);
             
             
             st.executeUpdate();
             st.close();
             connector.getConnection().close();
        }catch(Exception e){
            System.out.println("Error registro "+e);
        }
    }

    @Override
    public List<Libros> Lista() throws Exception {
        List<Libros> lista=null;
        String sql="SELECT *FROM libros;";
        
        try{
            PreparedStatement st= connector.getConnection().prepareStatement(sql);
            lista = new ArrayList();
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Libros libro=new Libros();
                libro.setISBN(rs.getInt("ISBN"));
                libro.setNombre(rs.getString("nombre"));
                libro.setAutor(rs.getString("autor"));
                libro.setFechaPublicacion(rs.getString("fechaPublicacion"));
                libro.setnEjemplares(rs.getInt("nEjemplares"));
                libro.setnEjemplaresDisponibles(rs.getInt("nEjemplaresDisponibles"));
                libro.setResumen(rs.getString("resumen"));
                lista.add(libro);
            }
            rs.close();
            st.close();
        }
        catch(Exception e){
        
        }
        return lista;
    }
       
}
