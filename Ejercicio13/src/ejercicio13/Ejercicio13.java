/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el lado del cuadrado: ");
        int lado = leer.nextInt();
        
        for (int i = 0; i < lado; i++) 
            System.out.print("* ");
        
        System.out.println(""); 
        for (int j = 0; j < lado-2; j++) {
          for (int i = 0; i < lado; i++) {
            if (i == 0) System.out.print("* ");
            else if ((i > 0) && (i < lado-1)) System.out.print("  ");
            else if (i == lado-1) System.out.print("*");
          }     System.out.println("");
        }
        
        for (int j = 0; j < lado; j++) 
            System.out.print("* ");
    }
}
