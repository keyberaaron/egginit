/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra22;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int filas, colum;
      
        System.out.print("ingrese cantidad de filas: ");
        filas = leer.nextInt();
        
        System.out.print("ingrese cantidad de columnas: ");
        colum = leer.nextInt();
        
    int vector[][] = new int[filas][colum];
    
    llenarVector(vector, filas, colum);   
    mostrarVector(vector, filas, colum);
    }
    
  
public static int[][] llenarVector(int [][] a, int f, int c) {
 Scanner leer = new Scanner(System.in);
 
    for (int i = 0; i < f; i++) 
        for (int j = 0; j < c; j++) {
           a[i][j]= (int) (Math.random() *9+1); 
        }  
   return(a); 
}

public static void mostrarVector(int [][] a, int f, int c) {
 Scanner leer = new Scanner(System.in);
 int sum = 0;
 
    for (int i = 0; i < f; i++) 
        for (int j = 0; j < c; j++) sum = sum + a[i][j];
 
    for (int i = 0; i < f; i++) {
        for (int j = 0; j < c; j++) 
        { System.out.print("[ "+a[i][j]+" ]"); }
        System.out.println("");     
    } 
    System.out.println("La suma de los elementos dela matrizes: "+sum);
}   
}
