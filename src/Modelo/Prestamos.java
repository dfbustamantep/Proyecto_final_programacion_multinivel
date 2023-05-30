
package Modelo;

/**
 * @author DBUSTAMANTEP
 */

//en esta clase tenemos todos los atributos que tienen nuestras tablas en la bd
public class Prestamos {

    private int ID;
    int ISBNLibro;
    private long documentoUsuario;
    private String Estado;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getISBNLibro() {
        return ISBNLibro;
    }

    public void setISBNLibro(int ISBNLibro) {
        this.ISBNLibro = ISBNLibro;
    }

    public long getDocumentoUsuario() {
        return documentoUsuario;
    }

    public void setDocumentoUsuario(long documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
