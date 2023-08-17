/**
 * 
 */
package com.cga.actividad6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 1: Juego Adivinar un número 
 *
 */
public class AdivinarNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declarar variables
		
		boolean verdadero = true;
		int aleatorio, numIntro = 0, intentos = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		// Obtener número aleatorio
		aleatorio = (int) (Math.random()*100 + 1);
		
		
		
		// Pedir el numero por pantalla
		
		try {
			System.out.println("introducir un número entre 1 y 100: ");
		
			numIntro = sc.nextInt();
			
			intentos++;
			
			// comprobar si el número introducido es mayor o menor que el número secreto
			while (numIntro != aleatorio) {
				if (numIntro < aleatorio) {
					System.out.println("el número generado es mayor que: " + numIntro);
					numIntro = sc.nextInt();
					intentos++;
				}else if (numIntro > aleatorio){
					System.out.println("el número generado es menor que: " + numIntro);
					numIntro = sc.nextInt();
					intentos++;
				}
				
			}
				
		}
		
		catch (InputMismatchException e){
			System.err.println("Error mismatch exception " + e.getMessage());
		}
				
		
			
		// Mostrar por pantalla que ha acertado el número secreto e indicar cuantos intentos se hicieron
		System.out.println("Felicidades ha adivinado el número secreto!");
		System.out.println("El número de intentos para adivinar el número secreto ha sido de: " + intentos);
		
		
		sc.close();
		
	}

}
