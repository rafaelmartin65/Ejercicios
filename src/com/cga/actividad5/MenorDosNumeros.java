/**
 * 
 */
package com.cga.actividad5;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #5 -> ejercicio 4: pide dos números e imprime el menor
 *
 */
public class MenorDosNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// define variables
				int numero1, numero2;
				
				

				Scanner sc = new Scanner(System.in);
				
				
				// Pedir valores por teclado
				
				System.out.println("Imprime el menor de dos números enteros \n");
				System.out.println("Introduce el primer número: " );
				numero1 = sc.nextInt();
				
				System.out.println("Introduce el segundo número: " );
				numero2 = sc.nextInt();
				
				
				// Imprime el menor de dos números
				System.out.println("El menor de los dos es:  " + Math.min(numero1, numero2));
				
				
				
				sc.close();
	}

}
