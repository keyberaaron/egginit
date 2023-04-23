/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int t = 10; //cantidad de cadenas RS232 a leer
    String[] RS232 = new String[t];
    int i = 0;
    boolean fin = false;
    int correcto = 0;
    int incorrecto = 0;
    
    System.out.println("Introduzca las cadenas RS232");
    System.out.println("");
    do {
      System.out.print("cadena "+i+": ");
      RS232[i] = leer.nextLine();
      
      if (RS232[i].length() == 5) {
       
        if(RS232[i].equals("&&&&&")) { fin = true; break; }
        else {
            if(RS232[i].substring(0, 1).equals("X") && RS232[i].substring(4, 5).equals("O")) 
               correcto = correcto + 1; 
            else
               incorrecto = incorrecto + 1;
        } i++;  
      } else System.out.println("Error, RS232 contempla unicamente 5 caracteres. Intente de nuevo...");
    } while (!fin && i<t);
    System.out.println("");
    System.out.println("**** Informe: ****");
    
    for (int j = 0; j < t ; j++) {
        System.out.println("cadena "+j+": "+RS232[j]); }
    System.out.println("Secuencias Correctas: "+correcto);
    System.out.println("Secuencias Incorrectas: "+incorrecto);
    System.out.println("Secuencia FDE &&&&&: 1");
    }
}
