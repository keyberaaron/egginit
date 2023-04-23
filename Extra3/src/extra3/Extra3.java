/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una Letra: ");
        String letra = leer.nextLine();
        
        if (letra.toLowerCase().equals("a") || letra.toLowerCase().equals("e") || letra.toLowerCase().equals("i") || letra.toLowerCase().equals("o") || letra.toLowerCase().equals("u"))
            System.out.println("La letra "+letra+" Si es Vocal");
        else System.out.println("La letra "+letra+" NO es Vocal");
    }
    
}
