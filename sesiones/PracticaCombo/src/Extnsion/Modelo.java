/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extnsion;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author alan
 */
public class Modelo implements ComboBoxModel<String> {
   private ArrayList <String> datos;
   private String selected;

    public Modelo() {
    }

    public Modelo(ArrayList<String> datos,String selected) {
        this.datos = datos;
        this.selected=selected;
    }
    public ArrayList <String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList <String> datos) {
        this.datos = datos;
    }

    @Override
    public Object getSelectedItem() {
        return selected; 
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public String getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener ll) {

    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected=((String)o);
    }
      public void addNombbre(String nombre){
        
        datos.add(nombre);
       
    }

   
    
}
