/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra20;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra20 {
//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
//parámetro. Después haremos otra función o procedimiento que imprima el vector.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int dim = (int) (Math.random() *4+1);
        System.out.println(dim);
    int vector[] = new int[dim];
    
    llenarVector(vector, dim);   
    mostrarVector(vector, dim);
    }
    
    
    
public static int[] llenarVector(int [] a, int dim) {
 Scanner leer = new Scanner(System.in);
 
    for (int i = 0; i < dim; i++) 
        a[i] = (int) (Math.random() *4+1);
   return(a); 
}

public static void mostrarVector(int [] a, int dim) {
 Scanner leer = new Scanner(System.in);
 
    for (int i = 0; i < dim; i++) 
        System.out.println("[ "+a[i]+" ]");
}
}
