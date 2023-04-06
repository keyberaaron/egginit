/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio10 {
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un valor limite positivo: ");
        int valor = leer.nextInt();
        
        int limite = 0;
       
        while (limite<=valor) 
        { System.out.println("Ingrese un Numero: ");      
          int numero = leer.nextInt();
          
          limite = limite + numero;
          System.out.println("lasuma va en: "+limite);
        } System.out.println("La Suma: "+limite+" supero al limite inicial: "+valor);
    }
}
