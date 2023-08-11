/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 7: Pedir 2 numeros por teclado y decir si son iguales.
 *
 */
public class EnterosIguales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarar variables
				int numero1, numero2;
				
				// Crear el objeto para obtener el número por teclado
				Scanner sc = new Scanner(System.in);
				
				//Solicitar los numeros por teclado
				System.out.println("Introduce el primer número: ");
				numero1 = sc.nextInt();
				
				System.out.println("Introduce el segundo número: ");
				numero2 = sc.nextInt();
				
				
				// Comparar a ver si son iguales
				if (numero1 == numero2) {
					System.out.println("Los numeros son iguales!");
				}else {
					System.out.println("Los numeros son distintos!");
				}
				
				
				sc.close();
	}

}
