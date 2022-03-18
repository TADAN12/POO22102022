/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caracteristicas;

/**
 *
 * @author alan
 */
public class Editorial {
    private String Nombre;
    private int año;

    public Editorial() {
    }

    public Editorial(String Nombre, int año) {
        this.Nombre = Nombre;
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", a\u00f1o=" + año + '}';
    }

}
