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
		
		
		int aleatorio, numIntro = 0, intentos = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		// Obtener número aleatorio
		aleatorio = (int) (Math.random()*100 + 1);
		
		
		
		// Pedir el numero por pantalla
		
			
			// comprobar si el número introducido es mayor o menor que el número secreto
		System.out.println("introducir un número entre 1 y 100: ");
		System.out.println("aleatorio: " + aleatorio);
		while (true){
			
			try {
				System.out.println("introducir un número: ");
				
				numIntro = sc.nextInt();
				
				intentos++;
				
				if (numIntro < 1 || numIntro > 100 ) {
					System.out.println("el número debe estar entre 1 y 100");
					
				}else if(numIntro == aleatorio){
					System.out.println("adivinaste el numero en " + intentos +" intentos" );
					break;
				}else{
					System.out.println("no adivinaste sigue intentando");
					if(numIntro > aleatorio) {
						System.out.println("El número ingresado es mayor");
					}else{
						System.out.println("El número ingresado es menor");
					}
				}
				
				
			}
			
			
			catch (InputMismatchException e){
				System.out.println("debes ingresar un numero válido InputMismatchException " + e.getMessage());
				sc.next();
			}
			
			catch (NumberFormatException ex){
				System.out.println("debe introducir un número entre 1 y 100 NumberFormatException " + ex.getMessage());
				sc.next();
			}
			
		
		}
		
		sc.close();
		System.out.println("fin del programa!");
	}
	

}
