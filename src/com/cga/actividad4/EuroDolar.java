/**
 * 
 */
package com.cga.actividad4;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 6: Calcular el cambio de Euros a Dolares.
 *
 */
public class EuroDolar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
		
				double euro, dolar;
				final float TASA_DE_CAMBIO = 1.12f;
				
				

				Scanner sc = new Scanner(System.in);
				
				// Pedir valores por teclado
				
				System.out.println("Introduce la cantidad de Euros a convertir: " );
				euro = sc.nextFloat();
				
				// Cálculo del cambio
				dolar = euro * TASA_DE_CAMBIO;
				
				
				// Salida por pantalla
				System.out.println("Por la cantidad de: " + euro + "€ corresponden " + dolar + " Dólares");
				
				
				
				sc.close();

	}

}
