/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra11;

import java.util.Scanner;
/**
 *
 * @author spicast
 */
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int aux;
       int cont = 0;
       
       System.out.println("Introduzca un numero: ");
       int num = leer.nextInt();
       aux = num;
       
       if (num>=1) {
          while (num>=1) {
            num = num / 10;
            cont++;   
          } 
          System.out.println("El Numero "+aux+" tiene "+cont+" Digitos.");
       }
       else System.out.println("Error, debe introducir un numero mayor a cero.");
       
    }
}
