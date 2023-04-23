/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra8;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra8 {

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
        boolean salgo = false;
        int par=0, impar=0, todos=0;

        do{
            System.out.print("Numero "+(i+1)+" :");
            do {
                numeros[i]=leer.nextInt();
                
                if (numeros[i]<0) System.out.println("Error, debe ser un entero positivo.");
                else 
                    {
                        continuar = true; 
                        todos++;
                        if (numeros[i] % 2 == 0) par++;
                        if (numeros[i] % 2 != 0) impar++;
                        if ((numeros[i])%5 ==0 ) salgo=true;

                        i++;
                     }
            }while (!continuar && !salgo); 
        }while (i<n && !salgo);
        
        System.out.println("Total Numeros Procesados: "+todos);
        System.out.println("Total Impares: "+impar);
        System.out.println("Total Pares: "+par);
    } 
}
