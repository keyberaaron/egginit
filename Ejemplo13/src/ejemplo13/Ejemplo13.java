/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo13;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejemplo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Cuantos miembros son?");
        int k = leer.nextInt();
        
        String[] equipo = new String[k];
        
        llenarequipo(equipo, k);  
    }
    
public static void llenarequipo (String[] equipo, int k){
    Scanner leer = new Scanner(System.in);
    
    for (int i = 0; i < k; i++) {
        System.out.println("Ingrese Nombre del Compañero "+i);
        equipo[i] = leer.nextLine();
    }
     System.out.println("Los "+k+" Integrantes del Equipo son: ");
     for (int i = 0; i < k; i++) {
         System.out.println(equipo[i]);
    }
    
}
}
