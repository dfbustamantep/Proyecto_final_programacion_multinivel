/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DBUSTAMANTEP
 */
public class Libros {
   // private int ID;
    private String nombre;
    private String autor;
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
}