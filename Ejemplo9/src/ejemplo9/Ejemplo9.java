/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo9;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejemplo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int n, p, sum;
    sum = 0;
    p=1;
    n=5;
    
    System.out.println("Escriba "+n+" Numeros:");
    
    do 
    {   System.out.println("Numero "+p+" :");
        int num = leer.nextInt();
        
        if (num == 0) { System.out.println("Se capturo el numero cero"); break;}
        if (num < 0) continue;
        if (num > 0) { sum = sum + num; p++;}
    } while (p<=n);
     
    System.out.println("La Suma de los Numeros Ingresados es: "+sum);  
    }
}
    
      

    
