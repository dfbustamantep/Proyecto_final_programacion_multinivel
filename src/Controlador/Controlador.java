/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Libros;
import Modelo.Prestamos;
import Modelo.Usuarios;
import Vista.EditarLibro;
import Vista.EditarPrestamo;
import Vista.EditarUsuario;
import Vista.Home;
import Vista.NuevoLibro;
import Vista.NuevoPrestamo;
import Vista.NuevoUsuario;
import database.Connector;

/**
 *
 * @author DBUSTAMANTEP
 */
public class Controlador {
    //creacion instancias de Modelo
        private Modelo.Libros libro;
        private Modelo.Prestamos prestamo;
        private Modelo.Usuarios usuario;
        
        //creacion instancias de Vista
        private Vista.EditarLibro editarL;
        private Vista.EditarPrestamo editrarP;
        private Vista.EditarUsuario editarU;
        private Vista.Home home;
        private Vista.Libros lib;
        private Vista.NuevoLibro nLib;
        private Vista.NuevoPrestamo nPres;
        private Vista.NuevoUsuario nPrest;
        private Vista.Prestamos prest;
        private Vista.Usuarios usua;
        
        //creacion instancia de Connector
        private Connector conector;

    public Controlador(Libros libro, Prestamos prestamo, Usuarios usuario, EditarLibro editarL, EditarPrestamo editrarP, EditarUsuario editarU, Home home, Vista.Libros lib, NuevoLibro nLib, NuevoPrestamo nPres, NuevoUsuario nPrest, Vista.Prestamos prest, Vista.Usuarios usua) {
        this.libro = libro;
        this.prestamo = prestamo;
        this.usuario = usuario;
        this.editarL = editarL;
        this.editrarP = editrarP;
        this.editarU = editarU;
        this.home = home;
        this.lib = lib;
        this.nLib = nLib;
        this.nPres = nPres;
        this.nPrest = nPrest;
        this.prest = prest;
        this.usua = usua;
        //conector=Connector.getConnection();
    }
        
    public void IniciarVista(){
        home.setVisible(true);
    }    

   
        
        
}
