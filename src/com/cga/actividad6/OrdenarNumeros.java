/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 9: Pedir 3 numeros diferentes por teclado y mostrarlos ordenados de mayor a menor.
 *
 */
public class OrdenarNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numeros = new int[3];
		
		int i, j, n, temp;
		
		
		
		
		try (Scanner sc = new Scanner(System.in)) {
			for (i = 0; i < numeros.length; i++) {
				System.out.println("Ingresa el número " + (i + 1) + ": ");
				numeros[i] = sc.nextInt();
			}
			
			
			n = numeros.length;
			
			// Recorrer el array comprobar y ordenar de mayor a menor
			for (i = 0; i < n - 1; i++ ) {
				for (j = 0; j < n -i -1; j++) {
					if (numeros[j] < numeros[j + 1]) {
						// intercambiar elementos
						temp = numeros[j];
						numeros[j] = numeros [j + 1];
						numeros[j + 1] = temp;
					}
				}
				
			}
			
			sc.close();
		}
		
		System.out.println("Números ordenados de mayor a menor: ");
			
			for (int numero : numeros) {
				System.out.println(numero + " ");
			}
		
		
		
		
			
	}
		
			

}


