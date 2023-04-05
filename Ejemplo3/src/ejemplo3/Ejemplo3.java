/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
 * @author spicast
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num1 = 4;
    int num2 = 120;
    int i,j = 0;
    String comm = "eeeeeeeee";
    boolean sera = num1<num2;
    double division = num2 / num1;
    double resto = division % 5; //resto
    
    for (i=0;i<=num1+1;i++)  
    {
     j++;   
    }
    System.out.println("  "+num1+"  "+num2+"  "+comm+"  "+sera+"  "+division+"  "+resto+"  "+j);
    } 
}
