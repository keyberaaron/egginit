/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra21;

import java.util.Scanner;

/**
 *
 * @author spicast
 */
public class Extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
      double promedio[] = new double[10];
      int aprobados=0;
      int desaprobados=0;
      
      leerNotas(promedio);
      
        for (int i = 0; i < 10; i++) {
            if (promedio[i]>= 7) aprobados++;
            else desaprobados++;
        }
        System.out.println("");
        System.out.println("De los 10 Alumnos, hay "+aprobados+" Aprobados y "+desaprobados+" Desaprobados.");
    }
    
public static double[] leerNotas(double[] p) {

        Scanner leer = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
    
        System.out.println("Ingrese las Notas de los 10 Alumnos: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.println("Alumno "+(i+1)+": ");
            
            System.out.print("Nota1 (1er Trabajo 10%): ");
            nota1 = leer.nextDouble();
            
            System.out.print("Nota2 (2do Trabajo 15%): ");
            nota2 = leer.nextDouble();
            
            System.out.print("Nota3 (1er Integrador 25%): ");
            nota3 = leer.nextDouble();
            
            System.out.print("Nota4 (2do Integrador 50%): ");
            nota4 = leer.nextDouble();
            
            p[i]=((nota1*0.10)+(nota2*0.15)+(nota3*0.25)+(nota4*0.50));   
        } 
        return (p);
    }
}
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       