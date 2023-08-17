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
public class Array3Copy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Definir variables
		
				float decimal;
				float [] array; 
				float [] array2 = null;
				int cantidadNumeros;
				
				// Locale localeUS = new Locale ("en", "US");
				
				Scanner sc = new Scanner(System.in);
				sc.useLocale(Locale.UK);
				
				System.out.println("Cuantos números desea introducir?");
				cantidadNumeros = sc.nextInt();
				array = new float[cantidadNumeros];
				
				// Introducir los valores
				
				for (int i = 0; i < cantidadNumeros; i++) {
					System.out.println("introducir un número decimal: ");
					decimal = sc.nextFloat();
					
					array[i] = decimal;
				}
			
				
				// Mostrar el contenido
				
				for (int i = array.length - 1; i >= 0; i--) {
					// Muestra el contenido del array a la inversa
					System.out.print("\n arrray[" + i + "] " + array[i] + "   ");
					array2 = new float[cantidadNumeros];
					array2[i] = array[i];
				}

				System.out.println("\n\nEste es el array: " + Arrays.toString(array2));
				
				sc.close();
	}

}
