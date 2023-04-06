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
    Scanner lee = new Scanner(System.in);
    
    System.out.println("Intruduzca 1er Numero: ");
    int num1 = lee.nextInt();
    
    System.out.println("Intruduzca 2do Numero: ");
    int num2 = lee.nextInt();
    int retorno;
    String res;
    
    boolean terminar = true;
   
    while (terminar) {
        retorno = menu (num1, num2); //Llamo a mi funcion menu
        switch (retorno)
        {
                case (1): { System.out.println("La Suma es: "+(num1+num2)); terminar = false; break; }    
                case (2): { System.out.println("La Resta es: "+(num1-num2)); terminar = false; break; }
                case (3): { System.out.println("La Multiplicacion es: "+(num1*num2)); terminar = false; break; }
                case (4): { System.out.println("La Division es: "+(num1/num2)); terminar = false; break; }
                case (5): { System.out.println("Esta seguro que desea salir del programa? S / N"); 
                            res = lee.nextLine();
                            if (res == "S"){ System.out.println(res); terminar = true; break;}
                          }
        }                       
    }   
}    
    
public static int menu (int num1, int num2) {
    Scanner leer = new Scanner(System.in);
    int opcion;
    
    //MENU
    do { 
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

