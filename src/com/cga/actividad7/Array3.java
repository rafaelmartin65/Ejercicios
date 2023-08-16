/**
 * 
 */
package com.cga.actividad7;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Rafael Martin
 * Actividad 7 --> ejercicio 3: Trabajar con Arrays
 *
 */
public class Array3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Definir variables
		
				float decimal;
				float [] array;
				
				int cantidadNumeros;
				
				// Locale localeUS = new Locale ("en", "US");
				
				Scanner sc = new Scanner(System.in);
				sc.useLocale(Locale.UK);
				
				System.out.println("Cuantos números desea introducir?");
				cantidadNumeros = sc.nextInt();
				array = new float[cantidadNumeros];
				
				for (int i = array.length - 1; i >= 0; i--) {
					System.out.println("introducir un número decimal: ");
					decimal = sc.nextFloat();
					
					array[i] = decimal;
				}

				System.out.println("\nEste es el array: " + Arrays.toString(array));
				
				sc.close();
	}

}
