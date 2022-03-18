/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caracteristicas;

/**
 *
 * @author alan
 */
public class Autor {
 private String Nombre;
 private String Biografia;

    public Autor() {
    }

    public Autor(String Nombre, String Biografia) {
        this.Nombre = Nombre;
        this.Biografia = Biografia;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "Nombre=" + Nombre + ", Biografia=" + Biografia + '}';
    }
 
}
