/**
 * 
 */
package com.cga.actividad3;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #3 -> ejercicio 3: programa en Java llamado Aritmetica que realiza y muestra por pantalla diferentes operaciones artiméticas.
 *
 */
public class CAritmetica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// define variables
		int dato1, dato2, dato3, resultado;
	
		
		// Asignamos valores
		dato1 = 20;
		dato2 = 10;
		dato3 = 2;
		
		// Salida por pantalla Suma
		resultado = dato1 + dato2 + dato3;
		System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " =  " + resultado);
		
		// Salida por pantalla Resta
		resultado = dato1 - dato2 - dato3;
		System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " =  " + resultado);
		
		// Salida por pantalla Producto
		resultado = dato1 * dato2 * dato3;
		System.out.println(dato1 + " * " + dato2 + " * " + dato2 + " =  " + resultado);
				
		
		// Salida por pantalla Cociente
		resultado = (dato1 / dato2) / dato3;
		System.out.println("(" + dato1 + " / " + dato2 + ") /  " + dato3 + " =  " + resultado);
		
		
		
	}

}
