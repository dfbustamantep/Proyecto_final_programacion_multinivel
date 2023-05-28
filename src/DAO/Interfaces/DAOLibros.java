/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interfaces;

import Modelo.Libros;
import java.util.List;



/**
 *
 * @author DBUSTAMANTEP
 */
public interface DAOLibros {
    public void Registrar(Libros libro)throws Exception;
    public void Modificar(Libros libro)throws Exception;
    public void Eliminar(int libro)throws Exception;
    public List<Libros> Lista()throws Exception;
}
