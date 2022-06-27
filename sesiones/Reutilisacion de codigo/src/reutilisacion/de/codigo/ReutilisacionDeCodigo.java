/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilisacion.de.codigo;

import Ico.fes.equipos.Computadora;
import Ico.fes.equipos.Persons;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
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
        
        compu.setPantalla(new Monitor("Samsung", "LED", 20));
        System.out.println(compu);
        
        System.out.println("----Herencia---");
        Alumno alu1= new Alumno();
        alu1.setNombre("alan");
        alu1.setEdad(19);
        /*Persons alumno= new Persons();
        alumno.setNombre("Pepe");
        alumno.setEdad(10);
        alumno.setNiño(new Alumno("3100101", "Derecho", 8, "Ale", 20));*/
        Alumno alu2= new Alumno("219194971", "Ico", 2, "Alan", 19);
        alu2.setCarrera("Derecho");
       // System.out.println(alu2);
        System.out.println("-----Polimorfismo----");
        Animal animal1=new Animal(4);
        Perro  animal2=new Perro("poodle",4);
        animal1.hablar();
        animal2.hablar();
        animal2.hablar(5);
    }
    
}
