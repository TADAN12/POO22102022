/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author alan
 */
public class circulo implements Figuta{
    public  static final float PI=3.1216f;
    private float radio;

    public circulo() {
    }

    public circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return PI*this.radio*this.radio;
    }

    @Override
    public String saludar() {
        System.out.println("Hola desde el circulo");
        return  "Hola360";
    }
    
    
}
