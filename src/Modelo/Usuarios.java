
package Modelo;

/**
 * @author DBUSTAMANTEP
 */

//en esta clase tenemos todos los atributos que tienen nuestras tablas en la bd
public class Usuarios {

    //private int ID;
    private long documento;
    private String nombre;
    private String apellido;
    private String correo;
    private long nContacto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getnContacto() {
        return nContacto;
    }

    public void setnContacto(long nContacto) {
        this.nContacto = nContacto;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

}
