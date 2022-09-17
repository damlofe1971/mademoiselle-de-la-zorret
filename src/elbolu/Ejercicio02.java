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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Enter your name");
        String name = leer.next();
        System.out.println("the name is " + name);
    }
    
}
