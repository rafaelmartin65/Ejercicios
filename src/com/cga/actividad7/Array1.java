/**
 * 
 */
package com.cga.actividad7;

import java.util.Arrays;

/**
 * @author Rafael Martin
 * Actividad 7 --> ejercicio 1: Trabajar con Arrays
 *
 */
public class Array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarar variables
		
		int [] array = new int [10];
		int i, suma = 0;
		
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100);
			suma += array[i];
			System.out.printf("%4d", +array[i]);
			
		}
		//Muestra la suma del contenido del array
		System.out.println("\nLa suma de los valores es: " + suma);
		
		//Muestra el array completo
		
		System.out.println("Este es el array: " + Arrays.toString(array));
		
		

	}

}
