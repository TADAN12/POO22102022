/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentashabiente;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Cuentahabiente {
    private int idCliente;
    private String nombre;
    private float balance;
    
    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero(float dinero, float Monto, boolean retiro){
       // Scanner teclado= new Scanner(System.in);
        //String opcion=teclado.next();
        //System.out.println("Desea retirar dinero?Si/No");
        if(retiro){
      
        if(dinero<Monto)
        System.out.println("No tienes cuentas con suficiente dinero para retirar. Elije una cantidad menor a:"+dinero);
          if(dinero>=Monto){
        dinero=dinero-Monto;
        this.balance=dinero;
            System.out.println("Tu nuevo saldo es: "+dinero);
            
        }
        }
        }
    public void nivelCliente(float dinero, String persona){
        if(dinero>=50000.00f)
            System.out.println("Cliente PREMIUM "+persona);
        if(dinero<=49000.00f)
            System.out.println("Cliente Regular "+persona);
            }
    
}
