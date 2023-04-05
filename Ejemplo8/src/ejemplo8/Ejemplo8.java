/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo8;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejemplo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int nota;
    nota = 11;
    
    System.out.println("Introduzca una Nota entre 0 y 10: ");
    
    while (nota<0 || nota>10){
        nota = leer.nextInt();
    
        if (nota<0 || nota>10) System.out.println("Error! Nota Invalida. Intente de nuevo: ");        
    }
        System.out.println("listo!");
    }  
}
