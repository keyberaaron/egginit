/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo7;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Introduzca Tipo de Motor/Bomba: (1)Agua, (2)Gasolina, (3)Hormigon, (4)Pasta ");  
    int tipoMotor;
    do {
        tipoMotor = leer.nextInt();
        if (tipoMotor < 1 || tipoMotor > 4)
           System.out.println("Error. Debe introducir un valor entre 1 y 4. Intente de nuevo! ");
       } while (tipoMotor < 1 || tipoMotor > 4);
    
    switch (tipoMotor){
        case 1:
            System.out.println("La Bomba es una Bomba de Agua.");
            break;
        case 2:
            System.out.println("La Bomba es una Bomba de Gasolina.");
            break;
        case 3:
            System.out.println("La Bomba es una Bomba de Hormigon.");
            break;
        case 4:
            System.out.println("La Bomba es una Bomba de Pasta Alimenticia.");
            break;
        default:
            System.out.println("No existe valor para el tipo de bomba.");
    }
        
    
    
            
    
    
    
    
    
    
    }
   
}

