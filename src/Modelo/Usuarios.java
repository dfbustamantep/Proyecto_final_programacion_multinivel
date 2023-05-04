/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DBUSTAMANTEP
 */
public class Usuarios {
    //private int ID;
    private String nombre;
    private String apellido;
    private String correo;
    private int nContacto;

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

    public int getnContacto() {
        return nContacto;
    }

    public void setnContacto(int nContacto) {
        this.nContacto = nContacto;
    }
    
}
