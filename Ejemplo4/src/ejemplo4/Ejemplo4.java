/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo4;

/**
 *
 * @author spicast
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int matriz[][] = new int[4][4];
    String nombre = "Keyber Serrano";
    int edad = 42;
    String especialidad = "Ing.";
    int i,j,k = 0;
    
    System.out.println("El Nominado es el "+especialidad+" "+nombre+" de "+edad+" Años");
    
    for (i=0;i<=3;i++){
       for (j=0;j<=3;j++){
         matriz[i][j] = k;
         k++;
         if (matriz[i][j] >= 10)
         {
          System.out.print("[ "+matriz[i][j]+" ]");
         } else if (matriz[j][i] < 10)
         {
          System.out.print("[ 0"+matriz[i][j]+" ]");
         }
       }  System.out.println(" ");
    }
    }
}
