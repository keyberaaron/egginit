/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = new int[100];
        int t = 100;
        
        System.out.println("Los 100 1eros N° Enteros son: ");
        for (int i = 0; i < 100; i++) {
            vector[i] = t;
            System.out.println(vector[i]);
            t--;
        }
    }
}
