/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
//    una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
//    de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

      Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese Dimensión de la Matriz: ");
        int din = leer.nextInt(); int dim = Math.abs(din);
       // if (dim <1) { System.out.println("la dimension debe ser positiva."); System.exit(0);}
            
        int matriz [][] = new int[dim][dim];
        int tras [][] = new int[dim][dim];
        int asimet = 0;
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("Valor: "+i+"-"+j+": "); 
                matriz[i][j] = leer.nextInt();
            }
        }System.out.println("");
        
        System.out.println("La Matriz [A] es: ");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) 
                System.out.print("["+matriz[i][j]+"]");
            System.out.println("");
        } 
        System.out.println("");
        System.out.println("La Traspuesta [B] de la Matriz es: ");
         for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                tras[i][j]= matriz[j][i];
                System.out.print("["+matriz[j][i]+"]");
                if (tras[i][j]== -matriz[i][j]) asimet = asimet + 1;
                
            }System.out.println("");
        } 
        System.out.println(""); System.out.println(asimet);
        if (asimet == dim*dim) System.out.println("La Matriz es Antisimétrica");
        else System.out.println("La Matriz NO es Antisimétrica");
    }
    
}
