/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra16;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
        
       int n;
       System.out.print("Ingrese la cantidad de personas: "); 
       n = leer.nextInt();
       String nombre[] = new String[n];
       String datos[] = new String[n];
       int edad[] = new int[n];
       
       pedirDatos(nombre, edad, datos, n);
       
        for (int i = 0; i < n; i++) {
            if (datos[i] != null)
                System.out.println(datos[i]); 
        }

    }

public static String[] pedirDatos(String[] nombre, int[] edad, String[] datos, int n) {
   Scanner leer = new Scanner(System.in);
   
        String respu=" ";
        int i=0; 
           
        System.out.println("Ingrese los nombres y edad de cada persona: ");
        
        while (!respu.equalsIgnoreCase("no") && (i<=n))   {
            System.out.print("Nombre "+(i+1)+": "); 
            nombre[i] = leer.next();
        
            System.out.print("Edad "+(i+1)+": "); 
            edad[i] = leer.nextInt();
          
            if (edad[i]>=18)  datos[i]=nombre[i]+" "+edad[i]+" es Mayor de edad.";
            else  datos[i]=nombre[i]+" "+edad[i]+" es Menor de edad.";
        
         System.out.println("Desea continuar? si / no");
         respu = leer.next();
            
         if (respu.equalsIgnoreCase("no")) break;
         else { System.out.println(""); i++; }   
        } 
    System.out.println("");
    return datos;   
}   
}  

