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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int num1,num2,sum;
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingrese un número");
           num1 = leer.nextInt();
           System.out.println("Ingrese otro número");
           num2 = leer.nextInt();
           sum = num1 + num2;
           System.out.println("El resultado de la suma es" + sum);
           
           
    }
    
}
