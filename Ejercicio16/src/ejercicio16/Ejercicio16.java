/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca la Longitud del Vector: ");
        int n = leer.nextInt();
        
        int [] vector = new int[n];
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
           vector[i] = (int) (Math.random() * 10); 
            System.out.println(vector[i]);
        } 
        System.out.println("");
        System.out.println("Introduzca el N° a Buscar: ");
        int num = leer.nextInt();
        int cont = 0; 
        for (int i = 0; i < n; i++) {
           if (vector[i] == num) 
              cont++;
        } 
        
        if (cont == 0) 
                System.out.println("No hay Coincidencias.");
           else if (cont == 1)
                     System.out.println("Hay 1 Coincidencia."); 
                else if (cont > 1) System.out.println("Hay "+cont+" Coincidencias."); 
        
        for (int j = 0; j < n; j++) 
           if (vector[j] == num)
                System.out.println("Posición: "+(j+1)); 
        System.out.println(""); 
    }
    
}
