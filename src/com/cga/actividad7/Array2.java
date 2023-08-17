/**
 * 
 */
package com.cga.actividad7;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Rafael Martin
 * Actividad 7 --> ejercicio 2: Trabajar con Arrays
 *
 */
public class Array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Definir array
		
		double [] array = new double[5];
		
		
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.UK);
		
		//Completa el array con el for
		for (int i = 0; i < array.length; i++) {
			System.out.println("introducir un número decimal: ");
			array[i] = sc.nextDouble(); //Agrera los valores al array
			
			 
		}
		
		//Muestra por pantalle el contenido del Array
		System.out.println("Este es el array: " + Arrays.toString(array));
		
		sc.close();
	}
	
	
}
