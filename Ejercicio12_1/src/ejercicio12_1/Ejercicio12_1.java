/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12_1;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int i = 0;
    boolean fin = false;
    int correcto = 0;
    int incorrecto = 0;
    
    System.out.println("Introduzca las cadenas RS232");
    System.out.println("");
    do {
      System.out.print("cadena "+i+": ");
      String cadena = leer.nextLine();
      
      if (cadena.length() == 5) {
       
        if(cadena.equals("&&&&&")) { fin = true; break; }
        else {
            if(cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(4, 5).equalsIgnoreCase("O")) 
               correcto = correcto + 1; 
            else
               incorrecto = incorrecto + 1;
        } i++;  
      } else System.out.println("Error, RS232 contempla unicamente 5 caracteres. Intente de nuevo...");
    } while (!fin);
    System.out.println("");
    System.out.println("**** Informe: ****");
    System.out.println("Secuencias Correctas: "+correcto);
    System.out.println("Secuencias Incorrectas: "+incorrecto);
    System.out.println("Secuencia FDE &&&&&: 1");
    }
}
