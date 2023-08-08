/**
 * 
 */
package com.cga.actividad4;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 1: programa en Java convertir grados centígrados a fahrenheit.
 *
 */
public class Fahrenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declaración variables
		
		int gradosF, gradosC;
		
		// asignar valores grados 
		
		gradosC = 25;
		System.out.println("introducimos la cantidad de: " + gradosC + "ºC");
		
		// cálculo grados fahrenheit
		
		gradosF = (gradosC * 9/5) + 32;
		
		// resultado por pantalla
		System.out.println("Converión ºC a Fahrenheit");
		System.out.println(gradosC + "ºC corresponden a " + gradosF + "ºFahrenheit");
		
		
		
		

	}

}
