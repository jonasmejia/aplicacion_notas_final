/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.isam.matrices;

/**
 *
 * @author jonas
 */
public class Matrices {

    public static void main(String[] args) {
        System.out.println("Nuestra primera matriz!");
        //Creando una matriz
        int[][] numeros = {
            {4,8,9},
            {7,1},
            {0,1,2,3,4}
        };
        
        //Recorrido -> recorrido de filas
        for (int fila = 0; fila < numeros.length; fila++) {
            
            //Recorrido de columnas
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                //Mostramos el valor o datos registrado en ese indice
                System.out.print(numeros[fila][columna]+ " \t");
            }
            System.out.println("");
        }
    
    }
}
