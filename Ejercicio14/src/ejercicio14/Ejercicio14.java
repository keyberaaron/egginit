/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner lee = new Scanner(System.in);
        boolean correcto = false; 
        System.out.print("EUROS: ");
        double euros = lee.nextInt(); System.out.println("");
        
        while (!correcto)  
        {
            System.out.println("**********************");
            System.out.println("**** Convertir A: ****");
            System.out.println("**********************");
            System.out.println("*****(D) DOLARES *****");
            System.out.println("*****(Y) YENES   *****");
            System.out.println("*****(L) LIBRAS  *****");
            System.out.println("**********************");
            System.out.println("");
            System.out.println("Escriba la letra correspondiente: ");
            String moneda = leer.nextLine();
            
            if (moneda.equalsIgnoreCase("D") || moneda.equalsIgnoreCase("Y") || moneda.equalsIgnoreCase("L")) 
            {    correcto = true;  conversion(euros, moneda); }
            else  System.out.println("Error, debe seleccionar D, Y ó L. Intente de nuevo..."); 
        }  
    }
    
public static void conversion (double euros, String moneda) {
double valor = 0;

if (moneda.equalsIgnoreCase("D"))
    System.out.println("Valor: "+euros*0.86);
else if (moneda.equalsIgnoreCase("Y")) System.out.println("Valor: "+euros*1.28611);
     else if (moneda.equalsIgnoreCase("L")) System.out.println("Valor: "+euros*129.852);
}        
}
