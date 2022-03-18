/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author alan
 */
public class Teclado {
 private String marca;
 private int numteclas;
 private boolean multimedia;//true=multimedia

    public Teclado() {
    }

    public Teclado(String marca, int numteclas, boolean multimedia) {
        this.marca = marca;
        this.numteclas = numteclas;
        this.multimedia = multimedia;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumteclas() {
        return numteclas;
    }

    public void setNumteclas(int numteclas) {
        this.numteclas = numteclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numteclas=" + numteclas + ", multimedia=" + multimedia + '}';
    }
 
}
