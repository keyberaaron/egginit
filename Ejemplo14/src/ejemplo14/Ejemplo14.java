/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo14;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejemplo14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo de manejo de CLases
        Scanner leer = new Scanner(System.in);
        
        String cadena1 = "1234";
        String cadena2 = "1234";
        String cadena3 = "5678";
        String cadena4 = "ABCD";
        
        if (cadena1.equals(cadena2)) //Validasi las dos cadenas son exactamente iguales
            System.out.println(cadena1.charAt(0));
        else
            System.out.println(cadena2.charAt(1));   
        
        if (cadena1.equalsIgnoreCase(cadena2))//valida si las dos cadenas tienen la misma longitud
            System.out.println(cadena1.charAt(2));
        else
            System.out.println(cadena2.charAt(3));
        
        System.out.println(cadena1.concat(cadena2));
        System.out.println("ingresa una cadena: "); String cadena = leer.nextLine();
        
        
        if (cadena.isEmpty()) System.out.println("la cadena esta vacia");
        else System.out.println("introdujo: "+cadena);
        
        String str = "Guru99 is a site providing free tutorials";
        //remove white spaces
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);
        
        if (cadena3.substring(0,1).equalsIgnoreCase("5"))
            System.out.println("si inicia con 5");
        
        if (cadena4.toLowerCase().equals("abcd"))
            System.out.println("si es el valor abcd minuscula");
        
        int numero = (int) (Math.random() * 10);  //genera un numero al azar entre 0 y 9 (no incluye el ultimo)
        System.out.println(numero);
        }   
    }
    
}
