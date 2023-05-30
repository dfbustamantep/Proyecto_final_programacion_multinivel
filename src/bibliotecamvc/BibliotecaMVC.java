
package bibliotecamvc;

import Controlador.Controlador;
import database.Connector;

/*
 * @author DBUSTAMANTEP
 */

public class BibliotecaMVC {

    public static void main(String[] args) {
        //creacion instancias de Modelo
        Modelo.Libros libro = new Modelo.Libros();
        Modelo.Prestamos prestamo = new Modelo.Prestamos();
        Modelo.Usuarios usuario = new Modelo.Usuarios();

        //creacion instancias de Vista
        Vista.EditarLibro editarL = new Vista.EditarLibro(libro);
        Vista.EditarPrestamo editrarP = new Vista.EditarPrestamo(prestamo);
        Vista.EditarUsuario editarU = new Vista.EditarUsuario(usuario);
        Vista.Home home = new Vista.Home();
        Vista.Libros lib = new Vista.Libros();
        Vista.NuevoLibro nLib = new Vista.NuevoLibro();
        Vista.NuevoPrestamo nPres = new Vista.NuevoPrestamo();
        Vista.NuevoUsuario nUsu = new Vista.NuevoUsuario();
        Vista.Prestamos prest = new Vista.Prestamos();
        Vista.Usuarios usua = new Vista.Usuarios();

        //instancia del conector
        Connector conector = Connector.getInstance();

        //creacion instancias de Controlador
        Controlador controller = new Controlador(libro, prestamo, usuario, editarL, editrarP, editarU, home, lib, nLib, nPres, nUsu, prest, usua, conector);
        controller.IniciarVista();
    }

}
