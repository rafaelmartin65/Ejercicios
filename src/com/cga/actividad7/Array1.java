/**
 * 
 */
package com.cga.actividad7;

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
		
		
		for (i = 0; i < array.length - 1; i++) {
			array[i] = (int) (Math.random()*100);
			suma += array[i];
			System.out.println(array[i]);
		}
		
		System.out.println("La suma de los valores es: " + suma);

	}

}
