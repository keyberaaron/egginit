/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 *
 * @author spicast
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leyendo = new Scanner(System.in);
        Scanner nota = new Scanner(System.in);
        
        System.out.println("Introduce un Numero: ");
        double num = leyendo.nextDouble();
        System.out.println("Nota: ");
        String obs = nota.nextLine();
        boolean espar = (num % 2 == 0);
        double resultado = 0;
        double div = num / 5;
        char yes = 'P';
        resultado = Math.sqrt(num); //Raiz Cuadrada
        
        // Reducimos el número de decimales a 2 con la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
         
        // Mostramos el resultado con dos decimales
        System.out.println("La Afirmacion de que el Numero "+num+" es "+yes+" es "+espar+" y la division es "+df.format(div));
        System.out.println("Raiz: "+df.format(resultado)+" Observacion: "+obs);
    }
    
}
