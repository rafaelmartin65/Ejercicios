/**
 * 
 */
package com.cga.actividad7;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Rafael Martin
 * Actividad 7 --> ejercicio 4: Trabajar con Arrays
 *
 */
public class Array4 {

	/**
	 * @param args
	 */
	
	public int maximo (int [] t) {
		
		for (int i = 0; i < t.length - 1; i++) {
			
			for (int j = 1; j < t.length; j++) {
				
				if (t[i] < t[j]) {
					int temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		//Definir variables
		
		int valor, cantidadNumeros;
		int [] array; 
		
		
		
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.UK);
		
		System.out.println("Cuantos números desea introducir?");
		cantidadNumeros = sc.nextInt();
		array = new int[cantidadNumeros];
		
		for (int i = cantidadNumeros - 1; i >=0; i--) {
			System.out.println("introducir un número: ");
			valor = sc.nextInt();
			
			array[i] = valor;
		}
		
		

		System.out.println("\nEste es el array: " + Arrays.toString(array));
		
		sc.close();

	}

}
