/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo10;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejemplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num;
    int n = 4;
    
    //Leo los numeros
    for (int i = 0; i < n; i++) {
        System.out.println("Introduzca Numero "+i+" : ");
        
        do  {
            num = leer.nextInt();  
            if (num <1 || num >20) System.out.println("Error, debe estar entre 1 y 20. Introduce otro: ");
        } while (num <1 || num >20);
        
        System.out.print(num+" ");
        
        for (int j = 0; j < num; j++){
        System.out.print("*"); } System.out.println(" ");      
    }  
  } 
}
