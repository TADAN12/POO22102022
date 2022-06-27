/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javainterface;

import ico.fes.Cuadrado;
import ico.fes.Figuta;
import ico.fes.circulo;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alan
 */
public class JavaInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado c=new Cuadrado(4.0f,4.0f);
        circulo circ=new circulo(5.0f);
        System.out.println(c.calcularArea());
        System.out.println(circ.calcularArea());
        Scanner teclado= new Scanner(System.in);
        System.out.println("1)cuadrado,2)circulo,3)triangulo,4)rectangulo\n");
        int opcion=teclado.nextInt();
        switch (opcion) {
            case Figuta.Cuadrado:
            System.out.println(c.calcularArea()); 
                break;
            case Figuta.circulo: 
                System.out.println(circ.calcularArea());
                break;
            case Figuta.triangulo:
                //area traingulo;
                break;
            case Figuta.rectangulo:
                //rectangulo
                break;

            default:
            System.out.println("Opcion no valida.");
                throw new AssertionError();
        }
                JOptionPane.showMessageDialog(null, "Hola", "El titulo", JOptionPane.INFORMATION_MESSAGE);
        //        JFrame.;
          //     JButton;
            //   MouseListener;
              // JDialog;
              // Color color=new Color(Color.BLUE);
    }
    
}
