/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.db;

import java.sql.*;

/**
 *
 * @author alan
 */
public class SQLPrueba {

    public static void main(String[] args) {
        Connection conect;
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/poo2022.db";
            conect= DriverManager.getConnection(url);
            System.out.println(System.getProperty("user.dir") + "/poo2022.db");
            System.out.println("Conexion establecida..");
            Statement stm = conect.createStatement();
           // stm.execute("CREATE TABLE alumno(id INT,nc VARCHAR(20),nombre VARCHAR(50))");
            //stm.execute("INSERT INTO alumno VALUES(1,'12345','Diana');");
           ResultSet rst = stm.executeQuery("SELECT*FROM alumno");
           while(rst.next()){
               System.out.print("Id:"+rst.getInt(1));
               System.out.println("Nombre:"+rst.getString(3));
           }
        } catch (Exception e) {
            
            System.out.println("erroor " + e.toString());
        }
    }

}
