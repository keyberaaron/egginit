/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String opcion;
       boolean correcto = false;
       
       
           System.out.println("***************************************"); 
           System.out.println("*** Calculo de Tratamiento a Socios ***");
           System.out.println("***************************************"); 
           System.out.println("");
           System.out.println("Introduzca la Clase de Socio: (A), (B) ó (C) ");
           
           while (!correcto){
                opcion = leer.nextLine();
                
                switch(opcion.toUpperCase())
                {
                    case "A": { System.out.println("**Dcto de 50%** El Total a Pagar es: "+iMporte(opcion)); correcto=true; break; }
                    case "B": { System.out.println("**Dcto de 35%** El Total a Pagar es: "+iMporte(opcion)); correcto=true; break; }
                    case "C": { System.out.println("**Dcto de 00%** El Total a Pagar es: "+iMporte(opcion)); correcto=true; break; }
                    default: System.out.println("Debe introducir A, B ó C"); 
                }
            }
    }   
    public static double iMporte(String o) {   
        Scanner leer = new Scanner(System.in);
        
        double pagar=0, costo;
        
        System.out.println("Introduzca costo del Tratamiento: ");
        costo = leer.nextInt();
        
        if (o.equalsIgnoreCase("a"))
            pagar= (costo-((costo*50)/100));
        else 
            if (o.equalsIgnoreCase("b"))
               pagar= costo-((costo*35)/100);
            else 
               if (o.equalsIgnoreCase("c"))
                   pagar= costo;
        return pagar;
    }
}
