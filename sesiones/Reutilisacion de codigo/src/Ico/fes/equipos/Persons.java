/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.equipos;

import ico.fes.herencia.Alumno;

/**
 *
 * @author alan
 */
public class Persons {
    private String Nombre;
    private int edad;
    private Alumno niño;

    public Persons() {
    }

    public Persons(Alumno niño) {
        this.niño = niño;
    }

    public Persons(String Nombre, int edad, Alumno niño) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.niño = niño;
    }



    @Override
    public String toString() {
        return "Persons{" + "Nombre=" + Nombre + ", edad=" + edad + ", ni\u00f1o=" + niño + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Alumno getNiño() {
        return niño;
    }

    public void setNiño(Alumno niño) {
        this.niño = niño;
    }

   
    
}
