/**
 * 
 */
package com.cga.actividad6;

import java.util.ArrayList;
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
		int x, temp;
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		// Cargara los numero en un array
		for (x = 0 ; x < 3 ; x++) {
			
			System.out.println("introducir un numero");
			numero = sc.nextInt();
			numeros[x] = numero;	
			
		}
		
		sc.close();
		for (x = 0 ; x < 3 ; ++x) {
			
			System.out.print("   " + numeros[x]);
			
			if (x < 3) {
				if (numeros[x] > numeros[x+1]) {
					temp = numeros[x+1];
					numeros[x+1] = numeros[x];
					numeros[x] = temp;
					
				}
			}
			
		}
		
		
		
		

	}

}
