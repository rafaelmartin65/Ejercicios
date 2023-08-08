/**
 * 
 */
package com.cga.actividad4;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 9: Calcular parte decimal de un número real.
 *
 */
public class ParteDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//definir variables
		double numero;
		float decimal;
		int entero;
		
		Scanner sc = new Scanner(System.in);
		
		// Pedir valores por teclado
		
		System.out.println("Introduce un número: " );
		String data = sc.next();

		// convertir a double
		numero = Double.parseDouble(data);
		
		//sacar el entero
		entero = (int) numero;
		
		//Obtener la parte decimal
		decimal = (float) (numero - entero);
		
		// Salida por pantalla del resultado
		System.out.println("La parte decimal del número introducido es: " + decimal);
		
		sc.close();
	}
	
	

}
