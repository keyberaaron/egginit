/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class holamundo {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       int aux=0;
       int aux2=0;
        do  {
              System.out.println("ingrese un numero ");
                int num = read.nextInt();
            if ( num== 0) {   break;}
            if (num<0){ num=0;}
            aux=aux+num;
            aux2++;
        } while (aux2<20);
    System.out.println("la suma es  " + aux);
    }
    
        
 }
