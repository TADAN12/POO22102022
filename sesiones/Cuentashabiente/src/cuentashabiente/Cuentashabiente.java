/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentashabiente;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Cuentashabiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero de cuenta: ");
        int numCuenta = teclado.nextInt();
        Cuentahabiente[] clientes = new Cuentahabiente[5];
        Cuentahabiente accesos = new Cuentahabiente(001, "Manuel", 50000.00f);
        clientes[0] = (new Cuentahabiente(001, "Manuel", 40000.00f));
        clientes[1] = (new Cuentahabiente(002, "Ricardo", 60000.00f));
        clientes[2] = (new Cuentahabiente(003, "Pepe", 100000.00f));
        clientes[3] = (new Cuentahabiente(004, "Ercik", 49000.00f));
        clientes[4] = (new Cuentahabiente(005, "Samuel", 50000.01f));
        for (Cuentahabiente cliente : clientes) {
            if(cliente.getIdCliente()==numCuenta){
            System.out.println(cliente);
           accesos.nivelCliente(cliente.getBalance(), cliente.getNombre());
           accesos.retirarDinero(cliente.getBalance(), 48000.00f, false);
        }
        }

    }

}
