/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra12;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                   
                   if (i!=3 && j!=3 && k!=3)
                        System.out.println(i+"-"+j+"-"+k);
                   else 
                       if (i==3 && j!=3 && k!=3)  System.out.println("E"+"-"+j+"-"+k); 
                       else
                             if (i!=3 && j==3 && k!=3)  System.out.println(i+"-"+"E"+"-"+k); 
                             else
                                 if (i!=3 && j!=3 && k==3)  System.out.println(i+"-"+j+"-"+"E"); 
     
                }
            }
        }
       
    }

//public static void esperar(int segundos){
//        try {
//            Thread.sleep(segundos * 1000);
//         } catch (Exception e) {
//            System.out.println(e);
//         }
//    }       
}
