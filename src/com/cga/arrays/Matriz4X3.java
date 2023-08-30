/**
 * 
 */
package com.cga.arrays;

import java.util.Scanner;

/**
 * @author Rafael Martín
 * Carga una matriz de 4 x 3 tipo String y mostrarla en el orden inverso
 */
public class Matriz4X3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declara la matriz
		
		Scanner sc = new Scanner(System.in);
		String [][] matriz = new String[4][3];
		
		
		
		for (int i = 0; i < matriz.length; ++i) {
			for (int j = 0; j < matriz[i].length; ++j) {
				System.out.printf("Introducir una palabra: ");
				String palabra = sc.nextLine();
				matriz[i][j] = palabra;
			}
		}
		//Mostrar orden inverso del introducido
		System.out.println("Mostrar el contenido en el orden inverso ");
		for (int i = matriz.length - 1; i >= 0 ; i--) {
			for (int j = matriz[i].length - 1; j >= 0 ; j--) {
				System.out.printf(matriz[i][j] +" ");
				
			}
			System.out.println();
		}
		
	}
}
