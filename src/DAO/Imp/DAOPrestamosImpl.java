/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.Imp;

import DAO.Interfaces.DAOPrestamos;
import Modelo.Prestamos;
import Modelo.Prestamos;
import database.Connector;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author DBUSTAMANTEP
 */
public class DAOPrestamosImpl extends Connector implements DAOPrestamos{
    
    Connector connector=null;

    public DAOPrestamosImpl() {
        this.connector=new Connector();
    }
    
    @Override
    public void Registrar(Prestamos prestamo) throws Exception {
        String sql="INSERT INTO prestamos (ISBNLibro,documentoUsuario,estado) VALUES (?,?,?)";
        
        try{
            PreparedStatement st;
            st =connector.getConnection().prepareStatement(sql);
            st.setInt(1, prestamo.getISBNLibro());
            st.setLong(2,prestamo.getDocumentoUsuario());
            st.setString(3, prestamo.getEstado());
            
            st.executeUpdate();
            st.close();
            connector.getConnection().close();
        }
        catch(Exception e){
            System.out.println("Error registro"+e);
        };
    }

    @Override
    public void Modificar(Prestamos prestamo) throws Exception {
        String sql="UPDATE prestamos SET ISBNLibro=?,documentoUsuario=?,estado=? WHERE id?";
        
        try{
        PreparedStatement st;
            st =connector.getConnection().prepareStatement(sql);
            st.setInt(1, prestamo.getISBNLibro());
            st.setLong(2,prestamo.getDocumentoUsuario());
            st.setString(3, prestamo.getEstado());
            st.setInt(4, prestamo.getID());
            st.executeUpdate();
            st.close();
            connector.getConnection().close();
        }catch(Exception e){
            System.out.println("Erorr al modificar"+e);
        }
    }

    @Override
    public void Eliminar(int id) throws Exception {
        String sql="DELETE FROM prestamos WHERE id=?;";
        
        try{
            PreparedStatement st;
             st = connector.getConnection().prepareStatement(sql);
             st.setInt(1, id);
             
             
             st.executeUpdate();
             st.close();
             connector.getConnection().close();
        }catch(Exception e){
            System.out.println("Error registro "+e);
        }
    }

    @Override
    public List<Prestamos> Lista() throws Exception {
        List<Prestamos> lista=null;
        String sql="SELECT *FROM prestamos;";
       try{
            PreparedStatement st= connector.getConnection().prepareStatement(sql);
            lista = new ArrayList();
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Prestamos prestamo=new Prestamos();
                prestamo.setID(rs.getInt("id"));
                prestamo.setISBNLibro(rs.getInt("ISBNLibro"));
                prestamo.setDocumentoUsuario(rs.getLong("documentoUsuario"));
                prestamo.setEstado(rs.getString("estado"));
                lista.add(prestamo);
            }
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }
        return lista;

    }

    @Override
    public Prestamos getPrestamosbyID(int id) throws Exception {
    Prestamos prestamo=new Prestamos();
        String sql="SELECT *FROM libros WHERE id=?;";
        
        try{
            PreparedStatement st= connector.getConnection().prepareStatement(sql);
            st.setInt(1,id);
           
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                prestamo.setID(rs.getInt("id"));
                prestamo.setISBNLibro(rs.getInt("ISBNLibro"));
                prestamo.setDocumentoUsuario(rs.getLong("documentoUsuario"));
                prestamo.setEstado(rs.getString("estado"));
                
            }
            rs.close();
            st.close();
        }
        catch(Exception e){
        
        }
        return prestamo;
        //return;
    }   
    
}
