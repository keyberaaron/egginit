/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra7;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      boolean continuar = false;
      
        System.out.println("Ingrese la Cantidad de numeros a tratar: ");
           int n = leer.nextInt();
           int numeros[]= new int[n];

        System.out.println("Ingrese los "+n+" numeros: ");
        int i=0;
//        while (i<n){
//            System.out.print("Numero "+(i+1)+" :");
//            numeros[i]=leer.nextInt();
//            i++;
//        }
        do{
            System.out.print("Numero "+(i+1)+" :");
            do {
                numeros[i]=leer.nextInt();
                if (numeros[i]<0) System.out.println("Error, debe ser un entero positivo.");
                else {continuar = true; i++;}
            }while (!continuar);    
        }while (i<n);
                
        int j=0;
        double prom=0;
        int max = numeros[0];
        int min = numeros[0];
        while (j<n){
            System.out.print(numeros[j]+" ");
            prom = prom + numeros[j];
            
            if (numeros[j]>max)
                max = numeros[j];
            
            if (numeros[j]<min)
                min = numeros[j];
            j++;
        }
        System.out.println("El Promedio es: "+prom/n);
        System.out.println("El Valor Max es "+max);
        System.out.println("El Valor Min es "+min);
    }
    
}
