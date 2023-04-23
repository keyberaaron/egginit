/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra13;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.print("Ingrese la altura de la piramide: ");
        int altura = leer.nextInt();
        System.out.println("");
        
        for (int i = 1; i <= altura; i++){ 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            } System.out.println("");
        }
    }  
}
