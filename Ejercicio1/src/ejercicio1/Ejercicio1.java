/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        //dos. El programa deberá después mostrar el resultado de la suma
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca num1");
        int num1 = leer.nextInt();
        
        System.out.println("Introduzca num2");
        int num2 = leer.nextInt();
        
        int suma = num1+num2;
        
        System.out.println("La suma de num1 + num2 es: "+suma);    
        
    }
    
}
