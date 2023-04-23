/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        int aux = 0;
        int A = r.nextInt(20)+1;
        int B = r.nextInt(20)+1;
        int C = r.nextInt(20)+1;
        int D = r.nextInt(20)+1;
        System.out.println("Valores Iniciales: (A)="+A+", (B)="+B+", (C)="+C+", (D)="+D);
        
        aux = B;
        B = C; 
        C = A; 
        A = D; 
        D = aux;
        
        System.out.println("Valores Finales: (A)="+A+", (B)="+B+", (C)="+C+", (D)="+D);
    }
}
