/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra17;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra17 {
    //Un numero es primo si tiene unicamente dos divisores, el 1 y el mismo. Ejm; el 17.
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num; boolean retorno; String res;
        System.out.println("*** Validar si es un Numero Primo");
        
      do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            
            retorno = esPrimo(num);
            
            if (retorno) System.out.println("El Numero es Primo");
            else System.out.println("El Numero NO es Primo");

          System.out.println("Desea consultar otro numero? si / no");
          res = leer.next();
          
      } while (!res.equalsIgnoreCase("no"));
    }
      
public static boolean esPrimo(int a){
   int resto=0;
   
    if (a == 0 || a == 1 || a == 4) return false;
  
    for (int x = 2; x < a+2 ; x++){if (a % x == 0) resto++; }
   
    if (resto==1) return true;
    else return false;
}

}