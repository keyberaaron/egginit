/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca la Longitud del Vector: ");
        int n = leer.nextInt();
        
        int [] vector = new int[n];
        int cont = 1; int cont1 = 0; int cont2 = 0; int cont3 = 0; int cont4 = 0; int cont5 = 0;
        int div;
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000); 
            System.out.print(vector[i]+" ");
            
            div = vector[i] / 10;
            
            while (div != 0) {
               cont++;
               div = div / 10;
            } System.out.print(cont); System.out.println(""); 
            
            switch (cont) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                default:
                    break;
            } cont=1; 
        } 
        System.out.println("cifras de 1 digito: "+cont1);
        System.out.println("cifras de 2 digitos: "+cont2);
        System.out.println("cifras de 3 digitos: "+cont3);
        System.out.println("cifras de 4 digitos: "+cont4);
        System.out.println("cifras de 5 digitos: "+cont5);
    } 
    
}
