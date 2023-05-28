/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interfaces;

import Modelo.Usuarios;
import java.util.List;

/**
 *
 * @author DBUSTAMANTEP
 */
public interface DAOUsuarios {
    public void Registrar(Usuarios usuario)throws Exception;
    public void Modificar(Usuarios usuario)throws Exception;
    public void Eliminar(Usuarios usuario)throws Exception;
    public List<Usuarios> Lista()throws Exception;
}
