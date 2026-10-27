/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.isam.matrices;
import java.util.Scanner;

/**
 *
 * @author jonas
 */
public class Ejercicio01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Ejercicio 1 Registrar y mostrar una matriz
         * Crea una matriz de 2 filas y 3 columnas. 
         * Solicita sus seis números y muéstralos organizados por filas. 
         * Completa esta base:
         */
        
        int[][] numeros = new int[2][3];
        
        System.out.println("Ingrese los numeros de matriz: ");
        Scanner teclado = new Scanner(System.in);
        
        //capturamos los datos
        //recorrido para filas
        for (int fila = 0; fila < numeros.length; fila++) {
            
            //Recorrido por fila por columna
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                //indicar donde almacenaremos los datos
                System.out.print("Posicion ["+fila+"]["+columna+"]");
                numeros[fila][columna] = teclado.nextInt();
            }
        }
        
        //mostrarlos
        for (int fila = 0; fila < numeros.length; fila++) {
            
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                System.out.print(numeros[fila][columna]+" \t");
            }
            System.out.println("");
        }
    }
    
}
