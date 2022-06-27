/*
/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ico.fes;

/**
 *
 * @author alan
 */
public interface Figuta {
    public static final int Cuadrado=1;
    public static final int circulo=2;
    public static final int triangulo=3;
    public static final int rectangulo=4;
    
    public abstract float calcularArea();
    public String saludar();
    
}
