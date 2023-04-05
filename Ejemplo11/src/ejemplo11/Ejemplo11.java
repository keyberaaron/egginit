/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo11;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String cadena;
    
    do {
        System.out.println("Introduzca una Cadena de Texto: ");
        cadena = leer.nextLine();
        if (!cadena.endsWith(".")){System.out.println("Debe terminar con punto! Hagalo de nuevo...");}
    } while (!cadena.endsWith("."));
    
    String retorno = cripto(cadena);
    System.out.println("La cadena Encriptada es: "+retorno);
    }    

    private static String cripto(String cadena) {
        String cadenacodi = new String(); //creamos otra cadena con las letras transformadas
        String aux; //uso una variable de texto para ir tomando letra por letra de la cadena
    
        for (int i = 0; i < cadena.length(); i++) {
           aux = cadena.substring(i,i+1);
            
            switch (aux.toLowerCase()){
                case "a":
                    aux= "@";
                    break;
                case "e":
                    aux = "#";
                    break;
                case "i":
                    aux = "$";
                    break;
                case "o":
                    aux = "%";
                    break;
                case "u":
                    aux = "*";
                    break;
                default:
                    aux = cadena.substring(i,i+1);
            }   cadenacodi += aux;          
        } return cadenacodi;
    }
}
