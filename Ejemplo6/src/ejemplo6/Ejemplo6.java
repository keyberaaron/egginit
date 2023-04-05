/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo6;

import java.util.Scanner;

/**Implementar un programa que le pida dos números enteros al usuario y determine si ambos o
alguno de ellos es mayor a 25.
 *
 * @author spicast
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Introduzca 1er numero: ");
        int num1 = leer.nextInt();
        System.out.println("Introduzca 2do numero: ");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25){ System.out.println("Ambos Numeros son mayores a 25"); }
        if (num1 <= 25 && num2 <= 25){ System.out.println("Ninguno de los Numeros es mayor a 25"); }
        if (num1 > 25 && num2 <=25){ System.out.println("Solo el 1er Numero es mayor a 25"); }
        if (num2 > 25 && num1 <=25){ System.out.println("Solo el 2do Numero es mayor a 25"); }
    }
}
    