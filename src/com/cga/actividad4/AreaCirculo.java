/**
 * 
 */
package com.cga.actividad4;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 5: programa que pida el radio de un círculo y calcule
 * su área mediante la siguiente fórmula:
 *
 */
public class AreaCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
		
		double area;
		float radio;
		final double PI = 3.1416;
		

		Scanner sc = new Scanner(System.in);
		
		// Pedir valores por teclado
		
		System.out.println("Introduce el radio del Círculo: " );
		radio = sc.nextFloat();
		
		
		// cálculo del area
		area = PI * (radio * radio);
		
		
		System.out.println("El área del círculo es: " + area);
		//Asignación del valor del diámetro
		
		
		sc.close();
	

	}

}
