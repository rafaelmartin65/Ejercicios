/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 5: Mostrar numeros de 1 a la n(numero introducido por teclado.
 */
public class Numeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarar variables
		int n, i;
		
		// Crear el objeto para obtener el número por teclado
		Scanner sc = new Scanner(System.in);
		
		
		//Pedir un numero por pantalla
		System.out.println("Introduce un numero por teclado: ");
		n = sc.nextInt();
		
		System.out.println("Números del 1 al " + n +"\n" );
		sc.close();
		// mostrar los numeros del 1 al n
		for (i= 1 ; i <= n; i++ ) {
			System.out.println(i);
		}
				
		

	}

}
