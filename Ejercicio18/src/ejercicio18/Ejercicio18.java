/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio18 {

    /**Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    /**traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
    /**obtiene cambiando sus filas por columnas (o viceversa).
    
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int[4][4];
        
        System.out.println("La Matriz [A] es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int) (Math.random() * (-30)+20); 
                System.out.print("["+matriz[i][j]+"]");
            }System.out.println("");
        } 
        System.out.println("");
        System.out.println("La Traspuesta [B] de la Matriz es: ");
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[j][i]+"]");
            }System.out.println("");
        }
    }
    
}
