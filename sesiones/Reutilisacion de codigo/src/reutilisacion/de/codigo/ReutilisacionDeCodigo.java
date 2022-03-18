/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilisacion.de.codigo;

import Ico.fes.equipos.Computadora;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.iu.MiVevntana;

/**
 *
 * @author alan
 */
public class ReutilisacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String facultad = new String("FES Aragon");
        char letra=  facultad.charAt(7);
        System.out.println(letra);
        System.out.println("Hola");
        //MiVevntana v1= new MiVevntana();
        Computadora compu= new Computadora();
        compu.setMarca("Asus");
        compu.setModelo("VivoBook");
        compu.setCpu(new Procesador("Intel", "i9",5.0f));
        Mouse raton =new Mouse();
        raton.setMarca("Logitech");
        compu.setRaton(raton);
        compu.getRaton().setModelo("GS400");
        System.out.println(compu);
        
    }
    
}
