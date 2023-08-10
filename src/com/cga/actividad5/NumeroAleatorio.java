/**
 * 
 */
package com.cga.actividad5;

import java.lang.Math;

/**
 *  @author Rafael Martín
 * 
 *  Actividad número #5 -> ejercicio 5: Calcula numero aleatorio entre 1 y 10, muestralo en pantalla.
 *
 *
 */
public class NumeroAleatorio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// define variable
		double aleatorio;
		int numero;
		
		
		// aplica funcion random para número aleatorio entre 1 y 10
		
		aleatorio = Math.random();
		numero = (int) (aleatorio * 10);
		
		if (numero < 0 || numero > 10 ) {
			aleatorio = Math.random();
			numero = (int) (aleatorio * 10);
		}
		
		System.out.println(numero);
		

	}

}
