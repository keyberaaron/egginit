/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra15;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.print("Introduzca num1: ");
        int num1 = leer.nextInt();
        
        System.out.print("Introduzca num2: ");
        int num2 = leer.nextInt();
        int opcion;
        
        do {
            
            System.out.println("*****************************");
            System.out.println("***  MENU DE OPERACIONES  ***");
            System.out.println("*****************************");
            System.out.println("**** (1) SUMA           *****");
            System.out.println("**** (2) RESTA          *****");
            System.out.println("**** (3) MULTIPLICACION *****");
            System.out.println("**** (4) DIVISION       *****");
            System.out.println("**** (5) SALIR          *****");
            System.out.println("*****************************");
            System.out.println("");
            System.out.print("Ingrese una opcion del menu: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1: { System.out.println("La suma de "+num1+" + "+num2+" es: "+Suma(num1,num2)); break;  }
                case 2: { System.out.println("La resta de "+num1+" - "+num2+" es: "+Resta(num1,num2)); break; }
                case 3: { System.out.println("La multiplicacion de "+num1+" x "+num2+" es: "+Multi(num1,num2)); break; }
                case 4: { System.out.println("La division de "+num1+" % "+num2+" es: "+Div(num1,num2)); break; }
                case 5: { System.exit(0); break; }
                default: System.out.println("Error, debe ingresar (1), (2), (3), (4) ó (5). Intente de nuevo...");  
            }
            
        } while (opcion>=1 && opcion<=4);
        
    }
public static int Suma(int a, int b) {
    return a+b;   
}  

public static int Resta(int a, int b) {
    return a-b;   
} 

public static int Multi(int a, int b) {
    return a*b;   
} 

public static int Div(int a, int b) {
    return a/b;   
} 

}
