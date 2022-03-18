/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ICO.FES.Lenovo.Procesador;

/**
 *
 * @author alan
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Procesador cpu= new Procesador();
        cpu.setFrecuencia(5.2f);
        System.out.println(cpu);
    }
    
}
