/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.Imp;

import DAO.Interfaces.DAOUsuarios;
import Modelo.Usuarios;
import database.Connector;
import java.util.List;

/**
 *
 * @author DBUSTAMANTEP
 */
public class DAOUsuariosImpl extends Connector implements DAOUsuarios{

    @Override
    public void Registrar(Usuarios usuario) throws Exception {
        
    }

    @Override
    public void Modificar(Usuarios usuario) throws Exception {

    }

    @Override
    public void Eliminar(Usuarios usuario) throws Exception {

    }

    @Override
    public List<Usuarios> Lista() throws Exception {

        return null;

    }
    
}
