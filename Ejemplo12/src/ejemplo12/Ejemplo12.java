/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo12;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejemplo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Introduzca 1er numero: ");
    int num1 = leer.nextInt();
    
    System.out.println("Introduzca 2do numero: ");
    int num2 = leer.nextInt();
    
    EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo (int num1, int num2){

    if ((num1 % num2) == 0)
        System.out.println("El Primer Numero es Multiplo del 2do");
    else
        System.out.println("No es Multiplo");     
    }
}

