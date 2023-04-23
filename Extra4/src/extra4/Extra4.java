/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      boolean correcto = false;
      int num=0;
      
        System.out.println("Ingrese un Numero entre 1 y 10: ");
        
        while (!correcto){
            num = leer.nextInt();
            if (num <1 || num>10)
                System.out.println("Error, debe ser entre 1 y 10."); 
            else correcto=true;     
        }
        if (correcto){
            switch (num)
            {
                case (1):  { System.out.println("En Romanos, "+num+" es: I"); break; }    
                case (2):  { System.out.println("En Romanos, "+num+" es: II"); break; } 
                case (3):  { System.out.println("En Romanos, "+num+" es: III"); break; } 
                case (4):  { System.out.println("En Romanos, "+num+" es: IV"); break; } 
                case (5):  { System.out.println("En Romanos, "+num+" es: V"); break; }     
                case (6):  { System.out.println("En Romanos, "+num+" es: VI"); break; } 
                case (7):  { System.out.println("En Romanos, "+num+" es: VII"); break; } 
                case (8):  { System.out.println("En Romanos, "+num+" es: VIII"); break; } 
                case (9):  { System.out.println("En Romanos, "+num+" es: IX"); break; } 
                case (10): { System.out.println("En Romanos, "+num+" es: X"); break; } 
            } 
        }    
    }      
}
