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
public class Ejercicio_video_cond_anid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("enter clasification among 1 to 5 star movie");
        Opinion = leer.nextInt();
        
        if (Opinion >= 1 && Opinion <= 5) {
            
            Switch (Opinion) {
            case1:
            case2:
                 System.out.println("We are sorry, you have not enjoyed the movie... ");
            break;
            case3:
                 System.out.println("Your clasification is GOOD");
            break;
            case4:
                 System.out.println("Your clasification is VERY GOOD");
            break;
            case5:
                 System.out.println("Fantastic, your clasification is Excelent");
            break;
            }
        } else if (Opinion < 0){
            System.out.println("A very bad opinion? Was it so bad? :( ");
        } else if (Opinion == 0){
            System.out.println("The value" + Opinion + "is not a valid one :(" );
        }else {
            System.out.println("Wow Amazing clasification :D");
        }
        System.out.println("Hasta la vista baby");
        
    }
    
}
