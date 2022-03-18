/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import Caracteristicas.Autor;
import Caracteristicas.Editorial;

/**
 *
 * @author alan
 */
public class Libroo {
    private String Nombre;
    private Autor Persona;
    private Editorial Edicion;

    public Libroo() {
    }

    public Libroo(String Nombre, Autor Persona, Editorial Edicion) {
        this.Nombre = Nombre;
        this.Persona = Persona;
        this.Edicion = Edicion;
    }

    public Editorial getEdicion() {
        return Edicion;
    }

    public void setEdicion(Editorial Edicion) {
        this.Edicion = Edicion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Autor getPersona() {
        return Persona;
    }

    public void setPersona(Autor Persona) {
        this.Persona = Persona;
    }

    @Override
    public String toString() {
        return "Libroo{" + "Nombre=" + Nombre + ", Persona=" + Persona + ", Edicion=" + Edicion + '}';
    }
    
}
