
package DAO.Interfaces;

import Modelo.Usuarios;
import java.util.List;

/*
 * @author DBUSTAMANTEP
 */

public interface DAOUsuarios {

    public void Registrar(Usuarios usuario) throws Exception;

    public void Modificar(Usuarios usuario) throws Exception;

    public void Eliminar(long documento) throws Exception;

    public List<Usuarios> Lista() throws Exception;

    public Usuarios getUsuariobyDocument(long documento) throws Exception;
}
