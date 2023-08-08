/**
 * 
 */
package com.cga.actividad4;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 10: Ingresar numero decimal y devolver el entero redondeado.
 *
 */
public class RedondeoNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//definir variables
		double numero;
		int entero;
		
		Scanner sc = new Scanner(System.in);
		
		// Pedir valores por teclado
		
		System.out.println("Introduce un número decimal: " );
		String data = sc.next();

		numero = Double.parseDouble(data);
		
		double redondeado = Math.round(numero);
		
		
		System.out.println("El número entero sin decimales es: " + redondeado);
		
		sc.close();

	}

}
