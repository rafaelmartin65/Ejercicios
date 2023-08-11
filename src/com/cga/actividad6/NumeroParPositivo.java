/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 2: Pedir numero por teclado decir si par y si es positivo su cuadrado.
 *
 */
public class NumeroParPositivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarar variables
		
		int numero, cuadrado;
		
		//declaramos el objeto scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedir número por teclado
		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();
		
		
		while (numero !=0 ) {
			
			
			
			
			//Averiguar si el número es par 
			
			if (numero % 2 == 0 ) {
				System.out.println("El número introducido es: " + numero);
				System.out.println("El numero es par");
				
				// Pregunta si es positivo
				if (numero > 0) {
					System.out.println("El número es positivo");
					
					//Calcula el cuadrado del numero
					cuadrado = (int) Math.pow(numero, 2);
					System.out.println("El cuadrado del número es: " + cuadrado);
					
					
				}
				
				
			}
			System.out.println("\n\nVuelve a introducir un numero, *** para terminar introduce '0' : ");
			numero = sc.nextInt();
			
		}
		
		System.out.println("Fin del programa! se ha introducido el número: " + numero);
		sc.close();
	}

}
