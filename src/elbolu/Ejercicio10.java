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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un límite de la numeración");
        int num = leer.nextInt();
        int suma = 0, num1;
        while(suma<num){
            System.out.println("ingrese el valor a sumar");
            num1= leer.nextInt();
            suma = suma + num1;
            System.out.println("la suma es " + suma);
            
        }
        System.out.println("superó el límite de numeración"); 
    }
    
}
