/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
 *
 * @author spicast
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrizM[][] = new int [10][10];
        int matrizP[][] = new int [3][3];

        llenarMatrizM(matrizM);
        llenarMatrizP(matrizP);
        ubicacionMatriz(matrizP, matrizM);

    }
    public static void llenarMatrizM(int matriz[][])
    {
        int aux = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = aux;
                aux++;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");  
        } 
        
    }

    public static void llenarMatrizP(int matriz[][])
    {
        System.out.println("Ingrese la matriz P:");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();           
            }
        } 
    }
    public static void ubicacionMatriz(int matrizA[][], int matrizB[][])
    {
        String posiciones[][] = new String [3][3];
        int posicionInicial = matrizB[0][0];
        int cont = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizA[0][0] == matrizB[i][j]){
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizA[k][l] == matrizB[i+k][j+l]){
//                                posiciones[k][l] = "["+valueOf(i+k)+", "+valueOf(j+l)+"]";
                                cont++; }}}
                        }}}
        
        System.out.println(cont);
        if (cont== 9){
            System.out.println("La matriz P se encuentra en las posiciones:");
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    System.out.print(posiciones[i][j]+" ");
//                }
                
            }
        }
        else {
            System.out.println("La matriz P no está dentro de la matriz M"); }

    }
}
}
