/**
 * 
 */
package com.cga.arrays;

import java.util.Random;

/**
 * 
 */
public class MultidimentionsArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] arregloBidimensional;
		arregloBidimensional = new int [2][4];
		
		Random random = new Random();
		
		System.out.println("Longitud de la 1ra dimensión del Array es --> " + arregloBidimensional.length);
		System.out.println("Longitud de la 2da dimensión del Array es --> " + arregloBidimensional[0].length);
		for (int j = 0; j < arregloBidimensional.length; j++) {
			System.out.println("Valor de j: " + j + " \n *****************");
			for (int i = 0; i < arregloBidimensional[0].length; i++) {
				System.out.print("valor de i: " + i + "\n");
				arregloBidimensional [j][i] = random.nextInt(101);
				int valor = arregloBidimensional [j][i];
				System.out.println("El contenido del array en la posición: " + j + " , " + i + " es: \n" + valor);
			}
			
		}
		
		//Imprimir contenido de la matriz
		int j, i = 0;
		for (j = 0; j < arregloBidimensional.length; j++) {
			System.out.println("\n");
			for (i = 0; i < arregloBidimensional[0].length; i++) {
				System.out.print(arregloBidimensional[j][i] + " ");
			}
			
		}
		
		//Ordenar de mayor a menor la primera fila
		
		for (j = 0; j < 1; j++) {
			System.out.println("\n");
			for (i = 0; i < arregloBidimensional[0].length - 1; i++) {
				for (int k = 1; k < arregloBidimensional[0].length; k++) {
					if (arregloBidimensional[0][i] < arregloBidimensional[0][k]) {
						int temp = arregloBidimensional[0][i];
						arregloBidimensional[0][i] = arregloBidimensional[0][k];
						arregloBidimensional[0][k] = temp;
					}
				}
				
				
			}
			
		}
		
		//Imprimir contenido de la matriz ordenada la primera fila
//		int m, n = 0;
		for (j = 0; j < arregloBidimensional.length; j++) {
			System.out.println("\n");
			for (i = 0; i < arregloBidimensional[0].length; i++) {
				System.out.print(arregloBidimensional[j][i] + " ");
			}
			
		}
		
	}

}
