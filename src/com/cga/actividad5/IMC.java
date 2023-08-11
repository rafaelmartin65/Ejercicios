/**
 * 
 */
package com.cga.actividad5;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author Rafael Martín
 * 
 *  Actividad número #5 -> ejercicio 1: Calcular el IMC a partir de su peso y estatura.
 *
 */
public class IMC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definir variables
		
		Double IMC, peso, estatura;
		
		Scanner sc = new Scanner(System.in);
		
		sc.useLocale(Locale.UK);  // instrucción para aceptar puntuación en los datos por teclado
		
		
		System.out.println("Introducir el peso: " );
		peso = sc.nextDouble();
		
		//String data = sc.next();
		// peso = Double.parseDouble(data);
				
		
		System.out.println("El peso introducido es: " + peso);
		
		System.out.println("Introducir la estatura: ");
		estatura = sc.nextDouble();
		// String data1 = sc.next();
		// estatura =  Double.parseDouble(data1);
		
		System.out.println("La estatura introducida es: " + estatura + "\n");

		
		// Calculo del IMC
		
		IMC = peso / Math.pow(estatura, 2);
		
		System.out.println("El Indice de Masa Corporal es: " + IMC);
		
		
		
		sc.close();
		
	}

}
