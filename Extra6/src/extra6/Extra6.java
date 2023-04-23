/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Indique la cantidad de personas a estudiar: ");
        int personas = leer.nextInt();
        
        double estaturas[] = new double [personas];
        double acum=0, aux = 0, cont = 0;

        System.out.println("Ingrese las Estaturas de cada una: ");
        for (int i = 0; i < personas; i++) {
            System.out.print("Estatura "+(i+1)+": ");
            estaturas[i] = leer.nextDouble();
            acum = acum + estaturas[i];
            if (estaturas[i]<1.60) {
                aux = aux + estaturas[i]; 
                cont++;
            }    
        }
        System.out.println("El Promedio de Estaturas generales es: "+acum/personas);
        System.out.println("El Promedio de Enanos es: "+aux/cont);
    }
}
