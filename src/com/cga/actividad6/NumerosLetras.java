/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 14: Pedir notas de 0 a 10 y convertirlas en palabras.
 */
public class NumerosLetras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
				int nota;
				
				Scanner sc = new Scanner (System.in);
				
				
				System.out.println("Introducir una nota entre 0 y 10: ");
				nota = sc.nextInt();
				
				switch (nota) {
					case 0:
						System.out.println("cero");
						break;
					case 1:
						System.out.println("uno");
						break;
					case 2:
						System.out.println("dos");
						break;
					case 3:
						System.out.println("tres");
						break;
					case 4:
						System.out.println("cuatro");
						break;
					case 5:
						System.out.println("cinco");
						break;
					case 6:
						System.out.println("seis");
						break;
					case 7:
						System.out.println("siete");
						break;
					case 8:
						System.out.println("ocho");
						break;
					case 9:
						System.out.println("nueve");
						break;
					case 10:
						System.out.println("diez");
						break;
					default:
						System.out.println("fuera de rango");
						
				}
					
			sc.close();	

	}

}
