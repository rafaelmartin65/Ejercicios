/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 1: Juego Adivinar un número 
 * 
 */
public class NumeroDiaSemana {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaracion variables
		int numero;
		String diaSemana;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa un número de 1  al 7: ");
		numero = sc.nextInt();
		
		switch (numero) {
		
			case 1: 
				diaSemana = "Lunes";
				break;
			case 2:
				diaSemana = "Martes";
				break;
			case 3:
				diaSemana = "Miércoles";
				break;
			case 4: 
				diaSemana = "Jueves";
				break;
			case 5:
				diaSemana = "Viernes";
				break;
			case 6:
				diaSemana = "Sábado";
				break;
			case 7:
				diaSemana = "Domingo";
				break;
			default:
				diaSemana = "Número inválido";
		}
		
		System.out.println("El día de la semana correspondiente el número " + numero + " es: " + diaSemana);
		sc.close();

	}

}
