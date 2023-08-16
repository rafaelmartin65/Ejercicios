/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 10: Clasificación notas según rangos.
 *
 * 
 */
public class ClasificacionNotas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
		int nota;
		
		Scanner sc = new Scanner (System.in);
		
		
			System.out.println("Introducir una nota entre 0 y 10: ");
			nota = sc.nextInt();
			
			if (nota >= 0 && nota <=10) {
				if (nota >= 9 && nota <= 10) {
					System.out.println("Sobresaliente (9 y 10)");
					
				}else if (nota > 6 && nota < 9) {
					System.out.println("Notable (7 y 8)");
				}else if (nota == 6) {
					System.out.println("Bien (6)");
				}else if (nota == 5) {
					System.out.println("Suficiente (5)");
				}else if (nota >= 0 && nota < 5) {
					System.out.println("Insuficiente de (0 a 4)");
				}
				
			}else{
				System.out.println("Nota fuera del rango");
			}
		
	
		
		
		sc.close();
	}

}
