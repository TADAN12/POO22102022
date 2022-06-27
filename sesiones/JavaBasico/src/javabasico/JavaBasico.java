/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author alan
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=22;
        Integer edad2= new Integer(3);
        float x=edad2.floatValue();
       // System.out.println(x);
        String dia="Dia MIercoles .";
        System.out.println(dia+x+"Hola");
      //  int temp = Integer.parseInt(dia);
      //  System.out.println(temp);     
        Perro dog1=new Perro("Podle",1);
        Perro dog2=new Perro();
        dog2.setRaza("Labrador");
        dog2.setTamano(2);
        //System.out.println(dog1);
        //System.out.println(dog2);
        //System.out.println(Perro.cola);
        //Perro.ladrar();
      /*  int val1=7;
        int val2=2;
        System.out.println(val1|val2);
        System.out.println(val1&val2);
        int val3=1;
        int val4=val3<<1;
        System.out.println(val4);
        val4=val4<<1;
        System.out.println(val4);*/
        int [] edades;
        int [] edades2= new int [5];
        int [] edades3={22,21,20,18,19};
        edades2[0]=33;
       /* System.out.println(edades2[0]);
        System.out.println(edades2[1]);
        
        System.out.println(edades3[0]);
        System.out.println(edades3[1]);
        System.out.println(edades3[2]);
        System.out.println(edades3[3]);
        
        System.out.println("Edades3");
        for(int i=0;i<edades3.length;i++){
            System.out.println(edades3[i]+" hola");
        }
        System.out.println("Edades 3 inverso");
        for(int i=4;i>-1;i--){
            System.out.println(edades3[i]+" hola");
        }
        System.out.println("Edades 3 =18");
      for(int i=0;i<edades3.length;i++){
            if(edades3[i]!=18)
                edades3[i]=18;
            System.out.println(edades3[i]);
        }
      */
        for (int i:edades3) {
            System.out.println(i);
        }
        System.out.println("Arreglo clase perro");
        Perro [] lista=new Perro [3];
        lista[0]= new Perro("Poddle",1);
        lista[1]= new Perro("Labrador",2);
        lista[2]= new Perro("Pastor ALeman",3);
        for (Perro perroo : lista) {
            perroo.comer();
        }
        System.out.println("Todos los perros a doverman");
        for (Perro perro : lista) {
            perro.setRaza("Doverman");
            System.out.println(perro);
        }
        ArrayList mascotas = new ArrayList();
        mascotas.add(new Perro("Poodle",0));
        mascotas.add(new Perro("Pug",1));
        mascotas.add(new Perro("Pastor",2));
        mascotas.add(new Perro("Perro",3));
        mascotas.add(new Perro("Patch",4));
      //  mascotas.add(5, "Labrador");
        for (Object mascota : mascotas) {
            Perro tmp = (Perro)mascota;
            System.out.println(tmp);
        }
        ArrayList<Perro> mascotas2=new ArrayList<Perro>();
        mascotas2.add(new Perro("Poodle",0));
        mascotas2.add(new Perro("Pug",1));
        mascotas2.add(new Perro("Pastor",2));
        mascotas2.add(new Perro("Perro",3));
        mascotas2.add(new Perro("Patch",4));
        Scanner teclado=new Scanner(System.in);
        System.out.println("Nombre perro");
       /* String raza= teclado.next();
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        for (Perro perro: mascotas2) {
            if(perro.getRaza().equals(raza)){
                perro.setTamano(4);
            }
            
        }*/
        mascotas2.set(1,new Perro("labrador",3));
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        System.out.println("Elije un numero entre 0 y 4");
        
        Perro puppy=null;
        int num=10;
         try{
             int indice=teclado.nextInt();
             puppy=mascotas2.get(indice);
             num= num / indice;
           // System.out.println(mascotas2.get(indice));
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Ocurrio un error, el valor debe estar entre 0 y 4");
            puppy=mascotas2.get(0);
            System.out.println(ex.getMessage());
        }catch(InputMismatchException ime){
            System.out.println("Ocurrio un error, deben ser letras");
            puppy=mascotas2.get(0);
        }catch(Exception e){
             System.out.println("ultimo recurso..");
                    puppy=mascotas2.get(0);
        }
         finally{
             System.out.println("En finally");
             System.out.println(puppy);
         }
        
       
    }
    
    
    
}
