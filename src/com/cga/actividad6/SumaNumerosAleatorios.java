/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 4: Suma de dos numeros aleatorios.
 *
 */
public class SumaNumerosAleatorios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarar variables
		int aleatorio1, aleatorio2, suma, introducido, contar = -1;;
		
		
		// Obtener 2 numeros aleatorios entre 1 y 100
		aleatorio1 = (int) (Math.random()*100 + 1);
		aleatorio2 = (int) (Math.random()*100 + 1);
		
		// Crear el objeto para obtener el número por teclado
		Scanner sc = new Scanner(System.in);
		
		
		
		// Repetir mientras se introduzca el resultado correcto de la suma
		do{
			contar ++;
			
			// Obtener 2 numeros aleatorios entre 1 y 100
			aleatorio1 = (int) (Math.random()*100 + 1);
			aleatorio2 = (int) (Math.random()*100 + 1);
			
			//Realizar la suma de los 2 números aleatorios
			suma = aleatorio1 + aleatorio2;
			
			// Mostrar los 2 numeros para solicitar que se ingrese el resultado de la suma
			System.out.println("Introducir el resultado de la suma de estos dos número: " + aleatorio1 + " + " + aleatorio2);
			
			introducido = sc.nextInt();
			
			
			
			
		}while(introducido == suma);
		
		
		//Mensaje de resultado incorrecto y numero de operaciones acertadas
		System.out.println("Ha acertado: " + contar + " operaciones");
		System.out.println("Resultado no es correcto!!!");
		
			
		sc.close();	
		
	}

}
