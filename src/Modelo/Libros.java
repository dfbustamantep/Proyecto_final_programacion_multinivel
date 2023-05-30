
package Modelo;

/**
 * @author DBUSTAMANTEP
 */

//en esta clase tenemos todos los atributos que tienen nuestras tablas en la bd
public class Libros {
    // private int ID;

    private int ISBN;
    private String nombre;
    private String autor;
    private String fechaPublicacion;
    private int nEjemplares;
    private int nEjemplaresDisponibles;
    private String Resumen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getnEjemplaresDisponibles() {
        return nEjemplaresDisponibles;
    }

    public void setnEjemplaresDisponibles(int nEjemplaresDisponibles) {
        this.nEjemplaresDisponibles = nEjemplaresDisponibles;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String Resumen) {
        this.Resumen = Resumen;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

}
