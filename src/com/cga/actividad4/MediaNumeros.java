/**
 * 
 */
package com.cga.actividad4;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 7: Calcular el cambio de Euros a Dolares.
 *
 */
public class MediaNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
		
		int valor1, valor2, valor3, media;
		
		
		

		Scanner sc = new Scanner(System.in);
		
		// Pedir valores por teclado
		
		System.out.println("Introduce el valor 1 " );
		valor1 = sc.nextInt();
		
		System.out.println("Introduce el valor 2 " );
		valor2 = sc.nextInt();
		
		System.out.println("Introduce el valor 3 " );
		valor3 = sc.nextInt();
		
		
		// Cálculo la media
		media = (valor1 + valor2 + valor3)/3;
		
		
		// Salida por pantalla
		System.out.println("La media es: " +media);
		
		
		
		sc.close();


	}

}
