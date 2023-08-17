/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 13: Leer número e indicar si es positivo o negativo
 */
public class NumeroPositivoNegativo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Si desae terminar debe introducir 0 ***");
		do {
			System.out.println("Ingresar un número entero: ");
			numero = sc.nextInt();
		
			if (numero == 0) {
				System.out.println("Fin del programa");
				
			}else if (numero < 0){
				System.out.println("El número es negativo: " + numero);
			}else {
				System.out.println("El número es positivo: " + numero);
			}
			
		}while (numero != 0);
		
		sc.close();
	}

}
