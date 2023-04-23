/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Ejercicio21 {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
     Scanner leer = new Scanner(System.in);
     int [][] matrizm = new int [10][10];
     int [][] matrizp = new int [3][3];
    
        matrizm = leerMatriz10(matrizm);
        
        System.out.println("*** Matriz 10 x 10 ***");
        for (int i = 0; i < 10; i++) {
               for (int j = 0; j < 10; j++) {
                   System.out.print(matrizm[i][j]+" "); 
            } System.out.println("");
        }
        
        matrizp = leerMatriz3(matrizp);
        System.out.println("*** Matriz 3 x 3 ***");
        for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                   System.out.print(matrizp[i][j]+" "); 
            } System.out.println("");
        } 
        
        validarsubmatriz(matrizm, matrizp);
    }
    
    public static int [][] leerMatriz10(int[][] x){
    Scanner leer = new Scanner(System.in);
        //System.out.println("Introduzca Valores Matriz M 10x10 : ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){ 
          //    System.out.print("Valor "+i+"-"+j+": "); 
          //    matrizm[i][j] = leer.nextInt();
                x[i][j]= (int) (Math.random() * 10); 
            }//System.out.println("");
        }
        return(x);    
    }   
    
    public static int[][] leerMatriz3(int[][] y){
    Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("Introduzca Valores Matriz P 3x3 : ");
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor "+i+"-"+j+": "); 
                y[i][j] = leer.nextInt();
        }System.out.println("");
        return(y);
    }   
    
public static void validarsubmatriz(int[][] matrizm, int [][]matrizp){
    
    String[][] posis = new String[3][3];
    
    //matrizp 3x3, matrizm 10x10
    int correcto=0; 
    int pos1;
    int pos2;
    for (int i = 0; i < 8; i++) { 
        for (int j = 0; j < 8; j++) {
            if (matrizp[0][0] == matrizm[i][j]) {
                for (int k = 0; k < 3; k++){ 
                    for (int l = 0; l < 3; l++){
                       if (correcto==9) break;
                       else
                        if (matrizp[k][l] == matrizm[i+k][j+l]){
                            
                                pos1=i+k;
                                pos2=j+l;
                                posis[k][l]=pos1+","+pos2;
                                correcto++;
                        }
                        else 
                            if ((matrizp[k][l] != matrizm[i+k][j+l]) && correcto == 3) correcto++; 
                            else
                                if ((matrizp[k][l] != matrizm[i+k][j+l]) && correcto == 6) correcto++;
                                else
                                    if ((matrizp[k][l] != matrizm[i+k][j+l]) && correcto != 3) correcto=0;   
                                    else 
                                        if ((matrizp[k][l] != matrizm[i+k][j+l]) && correcto != 6) correcto=0; 
                    }
                }
            } 
        }
    }
    System.out.println(correcto);
    
    if (correcto == 9) {
        System.out.println("La Matriz de 3x3 esta ubicada en las posiciones: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 8 && j==8)
                    System.out.print(posis[i][j]+" .");
                else
                    System.out.print(" "+posis[i][j]+" -");
            } 
        }
    }
    else System.out.println("La Matriz de 3x3 no fue localizada.");           
}
}
