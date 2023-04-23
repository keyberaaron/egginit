/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra18;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.print("ingrese tamaño del vector de numeros: ");
        int vector = leer.nextInt();
        
        int numero[] = new int[vector];
        int sum = 0;
        
        for (int i = 0; i < vector; i++) {
            System.out.print("ingrese numero "+1+": ");
            numero[i] = leer.nextInt();
            sum = sum + numero[i];
        }
        System.out.println("");
        System.out.println("La suma de todos los valores ingresados es: "+sum);
    }
    
}
