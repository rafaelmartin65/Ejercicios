/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 8: Pedir 2 numeros diferentes por teclado y mostrar cual es mayor.
 *
 */
public class NumeroMayor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numero1, numero2;
		
		// Crear el objeto para obtener el número por teclado
		Scanner sc = new Scanner(System.in);
		
		//Solicitar los numeros por teclado
		System.out.println("Introduce 2 números distintos");
		
		// comprueba que no sean iguales los números
		do {
			System.out.println("Introduce el primer número: ");
			numero1 = sc.nextInt();
			
			System.out.println("Introduce el segundo número: ");
			numero2 = sc.nextInt();
			
			if (numero1 == numero2) {
				System.out.println("Los núemros deben ser distintos, vuelva a introducirlos \n");
			}
		}while(numero1 == numero2);
		
		// Comparar a ver si son iguales
		if (numero1 > numero2) {
			System.out.println("El primer  número introducido es mayor!");
		}else {
			System.out.println("El segundo  número introducido es mayor!");
		}
		
		
		sc.close();

	}

}
