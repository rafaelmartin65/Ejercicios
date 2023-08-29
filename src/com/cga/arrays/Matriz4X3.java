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
		
		String [][] matriz = new String[4][3];
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < matriz.length; ++i) {
			for (int j = 0; j < matriz[i].length; ++j) {
				System.out.printf("Introducir una palabra: ");
				String palabra = sc.nextLine();
				matriz[i][j] = palabra;
			}
		}
		//Mostrar orden inverso del introducido
		System.out.println("Mostrar en el orden inverso del introducido");
		for (int i = matriz.length - 1; i  == 0 ; --i) {
			for (int j = matriz[i].length - 1; j == 0 ; --j) {
				System.out.printf(matriz[i][j]);
				
			}
		}
		
	}
}
