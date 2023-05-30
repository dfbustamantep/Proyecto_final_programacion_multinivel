/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interfaces;

import Modelo.Prestamos;
import java.util.List;

/**
 *
 * @author DBUSTAMANTEP
 */
public interface DAOPrestamos {

    public void Registrar(Prestamos prestamo) throws Exception;

    public void Modificar(Prestamos prestamo) throws Exception;

    public void Eliminar(int prestamo) throws Exception;

    public List<Prestamos> Lista() throws Exception;

    public Prestamos getPrestamosbyID(int prestamo) throws Exception;
}
