/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra14;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
 
        System.out.println("Ingrese la cantidad de familias: ");
        int n = leer.nextInt();
        int m[] = new int[n];
        int sum = 0;
        
        System.out.println("Ingrese la cantidad de hijos por cada familia: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Familia "+(i+1)+": ");
            m[i]= leer.nextInt();
            sum = sum + m[i];
        }
        System.out.println("La Media de Hijos de todas las familias es: "+sum/n);
    } 
}
