/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio11 {
//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Scanner lee = new Scanner(System.in);
    
    System.out.println("Intruduzca 1er Numero: ");
    int num1 = leer.nextInt();
    
    System.out.println("Intruduzca 2do Numero: ");
    int num2 = leer.nextInt();
    int retorno;
    String res;
    
    boolean continuar = true;
   
    while (continuar) {
        retorno = menu (num1, num2); //Llamo a mi funcion menu
      if (retorno != 5)  
        switch (retorno)
        {
                case (1): { System.out.println("La Suma es: "+(num1+num2)); continuar = true; break; }    
                case (2): { System.out.println("La Resta es: "+(num1-num2)); continuar = true; break; }
                case (3): { System.out.println("La Multiplicacion es: "+(num1*num2)); continuar = true; break; }
                case (4): { System.out.println("La Division es: "+(num1/num2)); continuar = true; break; }
        } 
      else {
          System.out.println("Esta seguro que desea salir del programa? S / N"); 
          res = lee.nextLine();
          if (res.toUpperCase().equals("S")) continuar = false; 
          else  System.out.println("Para Salir introduzca S..."); 
      }
    } 
  } 
   
public static int menu (int num1, int num2) {
    Scanner leer = new Scanner(System.in);
    int opcion;
    //MENU
    do { 
        System.out.println("");
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("****|       MENU       |*******");
        System.out.println("****|  (1) SUMAR       |*******");
        System.out.println("****|  (2) RESTAR      |*******");
        System.out.println("****|  (3) MULTIPLICAR |*******");
        System.out.println("****|  (4) DIVIDIR     |*******");
        System.out.println("****|  (5) SALIR       |*******");
        System.out.println("*******************************");
        System.out.println("");
        System.out.println("Elija una Opcion Numerica del Menu: ");
        opcion = leer.nextInt();
    
        if (opcion <1 || opcion >5) System.out.println("Debe ingresar entre 1 y 5");
    } while (opcion <1 || opcion >5);
    return opcion;
  }
}

