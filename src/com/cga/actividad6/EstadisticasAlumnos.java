/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 3: Estadisticas alumnos de un centro educativo.
 *
 */
public class EstadisticasAlumnos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definir variables
		
		int contadorAlumnos = 0, sumaEdades, edad, contarMayor18 = 0;
		double media;
		
		// Definir scanner
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir edad del alumno: ");
		edad = sc.nextInt();
		
		sumaEdades = 0;
		while (edad >= 0) {
			if (edad != 0) {
				System.out.println("La edad es: " + edad);
				contadorAlumnos = contadorAlumnos + 1;
				if (edad > 17) {
					contarMayor18 ++;
					System.out.println("Contador mayores de edad " + contarMayor18);
				}
				sumaEdades = sumaEdades + edad;
				System.out.println("Seguir con el programa " + sumaEdades);
			}else {
			
				System.out.println("La edad no puede ser 0");
				
			}
			
			System.out.println("Introducir edad del alumno: ");
			edad = sc.nextInt();
			
		}
		
		media = sumaEdades / contadorAlumnos; 
		
		
		System.out.println("Suma total de edades: " + sumaEdades);
		System.out.println("La media es: " + media);
		System.out.println("Número de alumnos:  " + contadorAlumnos);
		System.out.println("Mayores de edad son: " + contarMayor18 );
		
		System.out.println("Fin del programa");
		
		sc.close();

	}

}
