/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES.Lenovo;

/**
 *
 * @author alan
 */
public class Procesador {
    private String marca;
    private float frecuencia;
    private String submarca;

    public Procesador() {
    }

    public Procesador(String marca, float frecuencia, String submarca) {
        this.marca = marca;
        this.frecuencia = frecuencia;
        this.submarca = submarca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        if(frecuencia<=5.3f)
        this.frecuencia = frecuencia;
        else System.out.println("Valor fuera de rango");
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecuencia=" + frecuencia + ", submarca=" + submarca + '}';
    }
    
    
}
