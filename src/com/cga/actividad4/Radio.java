/**
 * 
 */
package com.cga.actividad4;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 3:Calcular el radio de una esfera a partir de su diámetro.
 *
 */
public class Radio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
		
		float diametro, radio;
		
		Scanner sc = new Scanner(System.in);
		
		// Obtener el radio por teclado
		
		System.out.println("Introduce el diámetro de la circumferencia: " );
		diametro = sc.nextFloat();
		
		
		
		//Cálculo del radio de la esfera
		
		radio = diametro / 2;
		
		System.out.println("El valor introducido del diámetro es: "+ diametro + " por lo tanto el radio es: " + radio);
		
		sc.close();

	}

}
