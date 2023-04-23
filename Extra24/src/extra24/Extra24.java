/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra24;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Introduzca un Numero para validar si es un Tèrmino Fibonacci:");
	int num = leer.nextInt();
	
        switch (num) {
            case 0:
                System.out.println("El Numero 0 es el Primer Termino de la Secuencia Fibonacci.");
                break;
            case 1:
                System.out.println("El Numero 1 es el Segundo Termino de la Secuencia Fibonacci.");
                break;
            case 2:
                System.out.println("El Numero 2 es el 3cer Termino, y su Secuencia Fibonacci es 1 + 1.");
                break;
            default:
                break;
        }
        System.out.println("");
	if (num > 2) 
            if (fiBonacci(num)) {
                //Escribir 'La Serie Fibonacci de ' num ' es:'
                System.out.println("El Numero "+num+" SI ES Fibonacci, y su secuencia es: ");
                sEcuencia(num);
    }        
            else
                System.out.println("El Numero "+num+" NO ES un Tèrmino Fibonacci");
   
    }
    
    
    public static boolean fiBonacci(int n) {
        
       int serie, c1, c2;
       boolean esFibo=false;
       c1 = 1; c2 = 0;
       
       //Validar si es un termino Fibonacci 
	for (int j = 2; j <= n; j++) {
            serie = c1 + c2;             
            c2 = c1;
            c1 = serie;
            
            if (serie ==n)  esFibo = true;
        }    
        return esFibo;
    }
    
    public static void sEcuencia(int n) {
    int secuencia, c1, c2;
    c1 = 1; c2 = 0;
              
       //Validar si es un termino Fibonacci 
	for (int j = 2; j <= n; j++) {
            secuencia = c1 + c2;             
            c2 = c1;
            c1 = secuencia;
            if (secuencia <= n)
            System.out.print(secuencia+" ");
        }    
    }
}
