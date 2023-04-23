/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de minutos a convertir: "); 
        int tiempo = leer.nextInt();
       
        int contdia=0; 
        int conthora=0;
        int contminuto=0;
        int aux=0;
        int aux1=0;
        aux = tiempo;
       
        if (tiempo > 1) {
          while (tiempo >=1) {
            if (tiempo>=1440) {
                tiempo = tiempo-1440;
                contdia++; 
            }
            else
               if (tiempo >= 60 && tiempo < 1440) {
                   tiempo = tiempo-60;
                   conthora++; 
               }
               else
                    if (tiempo >= 1 && tiempo < 60) {
                        tiempo = tiempo-1;
                        contminuto++; 
                    }      
          } System.out.println(aux+" minutos equivalen a "+contdia+" dias, "+conthora    +" horas y "+contminuto+" minutos!.");
        } else System.out.println("Debe ingresar una cantidad mayor a 1");
   }
}
