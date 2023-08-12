/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 *@author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 6: Pedir numero por teclado y mostrar si es par o impar.
 *
 */
public class MuestraParImpar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarar variables
		int numero;
		
		// Crear el objeto para obtener el número por teclado
		Scanner sc = new Scanner(System.in);
		
		//Pedir numero por teclado
		System.out.println("introduce un numero: ");
		numero = sc.nextInt();
		
		//Validamos si es par o impar
		if (numero % 2 == 0) {
			System.out.println("El número introducido es par");
		}else {
			System.out.println("El número introducido es impar");
		}
		
		sc.close();

	}

}
