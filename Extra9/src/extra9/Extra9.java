/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra9;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int retorno1, retorno2;
     int cont =0;
     
        System.out.println("Algoritmo de restas sucesivas!");
        System.out.println("Introduce un numero entero positivo mayor a 1: ");
        retorno1 = validarNum();
        System.out.println("Introduce otro entero positivo mayor a 1: ");
        retorno2 = validarNum(); 
        
       do {
         retorno1 = retorno1 - retorno2; 
         cont++;
       } while (retorno1 >retorno2);  
       
        System.out.println("El Residuo es "+retorno1+" y el cociente es "+cont);
    }

public static int validarNum() {
  Scanner leer = new Scanner(System.in);
  int num;
  boolean continuar = false;
    do {
        num=leer.nextInt();
        if (num<1) System.out.println("Error, debe ser un entero positivo mayor a 1.");
        else continuar = true; 
    }while (!continuar);    
  return num; 
}    
}
