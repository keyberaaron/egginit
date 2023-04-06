/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
//Realizar un programa que solo permita introducir frases o palabras de 8 de largo. Si
//el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje

import java.util.Scanner;

//por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
//“INCORRECTO”. Nota: investigar la función Lenght() en Java.
/**
 *
 * @author spicast
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase de 8 caracteres: ");
        String frase = leer.nextLine();
        
        if (frase.length()==8) System.out.println("Correcto! Tiene 8 Caracteres.");
        else System.out.println("INCorrecto! No Tiene 8 Caracteres.");
        
    }
    
}
