/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio5 {

//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un Numero: ");
        double num = leer.nextDouble();
        
        System.out.println("El Doble del Numero es: "+num*num);
        System.out.println("El Triple del Numero es: "+num*num*num);
        System.out.println("La Raiz Cuad. del Numero es: "+sqrt(num));
    }
    
}
