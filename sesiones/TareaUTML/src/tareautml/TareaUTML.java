/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareautml;

import Caracteristicas.Autor;
import Caracteristicas.Editorial;
import Libro.Libroo;
import java.util.HashSet;

/**
 *
 * @author alan
 */
public class TareaUTML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Datos:");
        Libroo info=new Libroo();
        info.setNombre("La vida de un fan del color.");
        
       // info.setEdicion(new Editorial("Madrid", 2001));
        info.setPersona(new Autor("Marco Polo", "Nacido en 1935"));
//cambiar el año unicamente de la editorial.
            Editorial edi=new Editorial();
            edi.setNombre("Buenavista");
            edi.setAño(2002);
            info.setEdicion(edi);
       // info.getEdicion().setAño(2005);
        System.out.println(info);
        
    }
    
}
