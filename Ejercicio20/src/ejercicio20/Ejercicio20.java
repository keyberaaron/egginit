/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int [][] magica = new int [3][3];
       System.out.println("Introduzca los elementos de la matriz: ");
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Valor "+i+"-"+j+": ");
                    magica[i][j]= leer.nextInt();
                    if ((magica[i][j] < 1) || (magica[i][j]) > 9) 
                       System.out.println("Error. El Valor debe ser entre 1 y 9. Intente de nuevo...");
                } while ((magica[i][j] < 1) || (magica[i][j]) > 9);
           } System.out.println("");
       }
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) 
                System.out.print("["+magica[i][j]+"]");
           System.out.println("");     
       }
       boolean retorno = validarMagico(magica);
       if (retorno) System.out.println("La Matriz SI es Magica");
       else System.out.println("La Matriz NO es Magica");
       
}
public static boolean validarMagico(int[][] magica) {
  Scanner leer = new Scanner(System.in);
    
    int sumaf = 0; 
    int sumac = 0; 
    int sumad1 = 0; 
    int sumad2 = 0;
    boolean magic;
  
    for (int i = 0; i < 3; i++) 
        for (int j = 0; j < 3; j++) {
            sumaf = sumaf + magica[i][j];
	    sumac = sumac + magica[j][i];
            if (i == j) sumad1 = sumad1 + magica[i][j];
            if ((i + j) == 2) sumad2 = sumad2 + magica[i][j];
        }  
    System.out.println(sumaf+" "+sumac+" "+sumad1+" "+sumad2);
    
    if ((sumaf == sumac) && (sumad1 == sumad2)) return magic=true;
    else return magic=false;
}
}