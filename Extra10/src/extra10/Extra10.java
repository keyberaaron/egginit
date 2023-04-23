/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      Random r = new Random();
      int a, b, c; 
      boolean salir = false;
      a = r.nextInt(10)+0;
      b = r.nextInt(10)+0 ;
      do {
         
          System.out.println("***********************");
          System.out.println("*** MULTIPLICACION **** ");
          System.out.println("***********************");
          
          System.out.print(a+" x "+b+" = ");
          c = leer.nextInt();
          System.out.println("");
          if ((a*b)==c) { System.out.println("Respuesta Correcta!"); salir = true; }
          else System.out.println("Error! Intente de nuevo!");
          
          
      } while (!salir);
      
    }
    
}
