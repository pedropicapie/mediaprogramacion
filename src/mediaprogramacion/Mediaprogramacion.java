/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaprogramacion;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Mediaprogramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int Intermedio=0;
        int total=0;
        Scanner cantidad =new Scanner (System.in);
        System.out.println("¿cuantos Alumnos son?");
                 
        int numero =cantidad.nextInt();
        for (int i = 0; i<numero; i++){
        System.out.println("¿Cual es el promedio del "+i+"n");
        Intermedio=cantidad.nextInt();                                                    
        total=total+Intermedio;                 
} 
        int media =(int) (total/numero);
        System.out.println("La media es "+media);
    }
    
}
