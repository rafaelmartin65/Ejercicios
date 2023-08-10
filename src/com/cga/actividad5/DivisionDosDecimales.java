/**
 * 
 */
package com.cga.actividad5;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #5 -> ejercicio 6: pide dos números dividelos y muestra por pantalla con formato de dos decimales
 *  
 */
public class DivisionDosDecimales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// define variables
				double numero1, numero2, resultado;
				
			

				Scanner sc = new Scanner(System.in);
				sc.useLocale(Locale.UK);
				
				// Pedir valores por teclado
				
				System.out.println("Muestra el resultado de la division con 2 decimales \n");
				System.out.println("Introduce el primer número: " );
				numero1 = sc.nextDouble();
				
				System.out.println("Introduce el segundo número diferente de cero: " );
				numero2 = sc.nextDouble();
				
				
				resultado = numero1 / numero2;
				
				// Imprime el resultado con 2 decimales
				System.out.printf("El resultado es: %.2f%n ", resultado);
				
				
				
				sc.close();
	}

}
