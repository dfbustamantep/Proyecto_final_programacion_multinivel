
package DAO.Imp;

import DAO.Interfaces.DAOUsuarios;
import Modelo.Usuarios;
import database.Connector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DBUSTAMANTEP
 */

public class DAOUsuariosImpl /*extends Connector*/ implements DAOUsuarios {

    private Connector connector;

    public DAOUsuariosImpl() {
        this.connector = Connector.getInstance();/*new Connector()*//*Connector.getConnection()*/;
    }

    //creamos un registro de usuario
    @Override
    public void Registrar(Usuarios usuario) throws Exception {
        String sql = "INSERT INTO usuarios (documento,nombre,apellido,correo,nContacto) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement st;
            st = connector.getConnection().prepareStatement(sql);

            st.setLong(1, usuario.getDocumento());
            st.setString(2, usuario.getNombre());
            st.setString(3, usuario.getApellido());
            st.setString(4, usuario.getCorreo());
            st.setLong(5, usuario.getnContacto());

            st.executeUpdate();
            st.close();
            //connector.getConnection().close();
        } catch (Exception e) {
            System.out.println("Error registro de usuario " + e);
        }
    }

    //modificamos un usario ya existente
    @Override
    public void Modificar(Usuarios usuario) throws Exception {
        String sql = "UPDATE usuarios SET documento=?,nombre=?,apellido=?,correo=?,nContacto=? WHERE documento=? ";

        try {
            PreparedStatement st;
            st = connector.getConnection().prepareStatement(sql);
            st.setLong(1, usuario.getDocumento());
            st.setString(2, usuario.getNombre());
            st.setString(3, usuario.getApellido());
            st.setString(4, usuario.getCorreo());
            st.setLong(5, usuario.getnContacto());

            st.setLong(6, usuario.getDocumento());

            st.executeUpdate();
            st.close();
            //connector.getConnection().close();
        } catch (Exception e) {
            System.out.println("Error modificacion del usuario " + e);
        }
    }

//elimanmos un usario por medio de su documento
    @Override
    public void Eliminar(long documento) throws Exception {
        String sql = "DELETE FROM usuarios WHERE documento=?;";

        try {
            PreparedStatement st;
            st = connector.getConnection().prepareStatement(sql);
            st.setLong(1, documento);

            st.executeUpdate();
            st.close();
            //connector.getConnection().close();
        } catch (Exception e) {
            System.out.println("Error eliminacion del registro " + e);
        }
    }

    //creamos un alista de usarios
    @Override
    public List<Usuarios> Lista() throws Exception {
        List<Usuarios> lista = null;
        String sql = "SELECT * FROM usuarios;";

        try {
            PreparedStatement st = connector.getConnection().prepareStatement(sql);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Usuarios usuario = new Usuarios();

                usuario.setDocumento(rs.getLong("documento"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setnContacto(rs.getLong("nContacto"));

                lista.add(usuario);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error listar" + e);
        }
        return lista;
    }

    //buscamos un usuario por medio de su id
    @Override
    public Usuarios getUsuariobyDocument(long documento) throws Exception {
        Modelo.Usuarios usuario = new Modelo.Usuarios();
        String sql = "SELECT *FROM usuarios WHERE documento=?;";

        try {
            PreparedStatement st = connector.getConnection().prepareStatement(sql);
            st.setLong(1, documento);
            //System.out.println(documento);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                usuario.setDocumento(rs.getLong("documento"));
                //System.out.println(usuario.getDocumento());

                usuario.setNombre(rs.getString("nombre"));
                //System.out.println(usuario.getNombre());

                usuario.setApellido(rs.getString("apellido"));
                //System.out.println(usuario.getApellido());

                usuario.setCorreo(rs.getString("correo"));
                //System.out.println(usuario.getCorreo());

                usuario.setnContacto(rs.getLong("nContacto"));
                //System.out.println(usuario.getnContacto());
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error no se pudo conseguir el usuario" + e);
        }
        return usuario;
    }

}
