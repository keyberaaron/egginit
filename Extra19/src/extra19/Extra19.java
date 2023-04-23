/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra19;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra19 {
//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos).
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la Dimension del Vector: ");
        int n = leer.nextInt();
        int cont = 0;
        
        int vector1[] = new int [n];
        int vector2[] = new int [n];
        
        leerVector1(vector1, n);
        leerVector2(vector2, n);
        
        for (int i = 0; i < n; i++) 
            if (vector1[i] != vector2[i]) {
                System.out.println("En la posicion "+(i+1)+" los vectores son diferentes.");
                break; }
            else System.out.println("Vector 1."+i+": "+vector1[i]+" y "+"Vector 2."+i+": "+vector2[i]+" son iguales");cont++;
        if (cont == n) System.out.println("los vectores son iguales");
    } 
    
public static int[] leerVector1(int[] a, int n){
    Scanner leer = new Scanner(System.in);
    System.out.println("Introduzca Valores del Vector 1: ");
    for (int i = 0; i < n; i++) {
    
        System.out.print("Valor "+(i+1)+": ");
        a[i] = leer.nextInt();   
    }
    return(a);
}
    
public static int[] leerVector2(int[] b, int n){
    Scanner leer = new Scanner(System.in);
    System.out.println("Introduzca Valores del Vector 2: ");
    for (int i = 0; i < n; i++) {
    
        System.out.print("Valor "+(i+1)+": ");
        b[i] = leer.nextInt();
    }
    return(b);
}    
}
