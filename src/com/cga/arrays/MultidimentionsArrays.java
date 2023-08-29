/**
 * 
 */
package com.cga.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * 
 */
public class MultidimentionsArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarar matriz

		
		int[][] matriz;
		matriz = new int [2][4];
		
		Random random = new Random();
		
		System.out.println("Longitud de la 1ra dimensión del Array es --> " + matriz.length);
		System.out.println("Longitud de la 2da dimensión del Array es --> " + matriz[0].length);
		for (int j = 0; j < matriz.length; j++) {
			
			for (int i = 0; i < matriz[0].length; i++) {
				
				matriz [j][i] = random.nextInt(101);
				
				
			}
			
		}
		
		//Imprimir contenido de la matriz
		int j, i = 0;
		System.out.print("\nmatriz original: ");
		for (j = 0; j < matriz.length; j++) {
			System.out.println("");
			for (i = 0; i < matriz[0].length; i++) {
				System.out.print(matriz[j][i] + " ");
			}
			
		}
		
		//Ordenar de mayor a menor la primera fila
		
		ArrayList<Integer> primeraFila = new ArrayList<>(); 
		
		for (int num : matriz[0]) {
			
			primeraFila.add(num);
		}
		
		Collections.sort(primeraFila);
		
		for (int k = 0; k < matriz[0].length; k++) {
			matriz[0][k] = primeraFila.get(k);
		}
		
		
		//Imprimir contenido de la matriz ordenada la primera fila
		
		System.out.println("\n\nImprime el contenido de la matriz ordenada de menor a mayor la primera fila");
		for (int[] fila: matriz) {
			
			System.out.println(Arrays.toString(fila));
		}
		
		
		// Ordenar de menor a mayor la segunda fila
		ArrayList<Integer> segundaFila = new ArrayList<>(); 
		
		for (int num : matriz[1]) {
			
			segundaFila.add(num);
		}
		
		
		Collections.sort(segundaFila, Collections.reverseOrder());
		
		
		for (int k = 0; k < matriz[1].length; k++) {
			matriz[1][k] = segundaFila.get(k);
		}
		
		//Imprimir contenido de la matriz ordenada la segunda fila
		
		System.out.println("\n\nImprime el contenido de la matriz ordenada mayor a menor la segunda fila");
		for (int[] fila: matriz) {
			
			System.out.println(Arrays.toString(fila));
		}
		
		// Calcular el máximo de la suma de los valores de cada fila
		System.out.println("\n Suma de las filas de la matriz");
		int suma1 = 0;
		for (int k = 0; k < primeraFila.size(); k++) {
			System.out.print(primeraFila.get(k) + " ");
			suma1 = suma1 + primeraFila.get(k);
		}
		System.out.println("--> " + suma1);
		int suma2 = 0;
		for (int k = 0; k < segundaFila.size(); k++) {
			System.out.print(segundaFila.get(k) + " ");
			suma2 = suma2 + segundaFila.get(k);
		}
		System.out.println("--> " + suma2);
		
		if (suma1 < suma2) {
			System.out.println("El máximo de los dos valores es la segunda fila");
		}else {
			System.out.println("El máximo de los dos valores es la primera fila");
		}
	}

}
