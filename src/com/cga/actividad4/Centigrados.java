/**
 * 
 */
package com.cga.actividad4;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 2: programa en Java convertir grados Fahrenheit a Centígrados.
 *
 */
public class Centigrados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declaración variables
		int gradosF, gradosC;
		
		// Asignar valores
		gradosF = 80;
		
		// cálculo grados Centigrados
		gradosC = ((gradosF - 32) * 5) / 9;
		
		System.out.println("introducimos la cantidad de: " + gradosF + "ºFahrenheit");
		
		// resultado por pantalla
				System.out.println("Converión ºFahrenheit a ºC ");
				System.out.println(gradosF + "ºFahrenheit corresponden a " + gradosC + "ºC");

	}

}
