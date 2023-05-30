
package DAO.Interfaces;

import Modelo.Libros;
import java.util.List;

/**
 * @author DBUSTAMANTEP
 */
public interface DAOLibros {

    public void Registrar(Libros libro) throws Exception;

    public void Modificar(Libros libro) throws Exception;

    public void Eliminar(int libro) throws Exception;

    public List<Libros> Lista() throws Exception;

    public Libros getLibrobyISBN(int libroISBN) throws Exception;
}
