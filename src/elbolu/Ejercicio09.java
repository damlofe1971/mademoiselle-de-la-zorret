/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbolu;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        String palabra2 = palabra.toUpperCase();
        //para pasar a mayúscula
        if (palabra2.substring(0,1).equals("A")){
            System.out.println("palabra correcta");
        }else
            System.out.println("Incorrecto");
    }

    private static void uppercase(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
