/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra23;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        Random r = new Random();
        String sopa;
        String matriz[][] = new String [20][20];
        
         //(1ero) hago un vector con las filas aleatorias donde incluire las frases
        int filas[] = new int [5]; 
        int k=0, n;
        while (k<5){
             n = r.nextInt(20)+1;
        
             //llamo a una funcion que me valida que no se repitan los valores aleatorios
             if (!Busqueda(filas, n, k)) {
                 filas[k] = n;
                 System.out.print(filas[k]+" ");
                 k++;    
             }     
        }  System.out.println("");
        
        //leo las 5 frases
        System.out.println("Introduzca 5 palabras entre 3 y 5 caracteres: ");
        for (int g = 0; g < 5; g++) {
           
            System.out.print("frase "+(g+1)+": "); 
            sopa = leer.nextLine();
            
            if (sopa.length()<3 || sopa.length()>5) 
                while (sopa.length()<3 || sopa.length()>5) {
                    System.out.println("Error, palabra " +(g+1)+" debe tener entre 3 y 5 letras");
                    sopa = leer.nextLine(); 
                } 
            //matriz20x20 
            //incrusto el vector sopa con las frases introducidas por el usuario
            //en la matriz 20 x 20 con las filas aleatorias ya validadas
            if  (sopa.length()>=3 && sopa.length()<=5){
                for (int m = 0; m < 20; m++) { 
                    if (filas[g] == m){  
                        for (int j = 0; j < sopa.length(); j++) {
                            matriz[filas[g]][j] = sopa.substring(j,j+1);
                        }
                    } 
                }
            }
        }
          
        //relleno las posiciones vacias con valores aleatorios entre 0 y 9
        // y finalmente muestro la matriz llena (la sopa de letras)
        int relleno;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == null){
                    relleno = r.nextInt(9)+0;
                    matriz[i][j] = relleno+"";
                    System.out.print("["+matriz[i][j]+"] ");
                }
                else System.out.print("["+matriz[i][j]+"] ");
            }   System.out.println("");
        }    
        
    }
    //funcion para validar que el vector con la posicion de las filas no se repita
    public static boolean Busqueda (int[] a, int n, int k){
      
        for (int j = 0; j < 5; j++) {
            if (n == a[j]) return (true);
        }
        return (false);
    }
}   
      