/**
 * 
 */
package com.cga.actividad4;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 4: Calcular el IMC a partir de su peso y estatura.
 *
 */
public class IMC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
		
				float peso, estatura, IMC;
				

				
				//Asignación del valor del diámetro
				
				peso = 90;
				estatura = 1.75f;
				
				//Cálculo del IMC 
				
				IMC = peso / (estatura * estatura);
				
				System.out.println("El peso introducido es de: "+ peso + " y la estatura es: " + estatura + " el resultado del IMC es: " + IMC);
				System.out.println("Se suele establecer un intervalo de 18 a 25 como saludable en personas adultas.");

	}

}
