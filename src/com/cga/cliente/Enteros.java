/**
 * 
 */
package com.cga.cliente;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alumno
 *
 */
public class Enteros {

	/**
	 * @param args
	 */
	
	static ArrayList<Enteros> enteros = new ArrayList<Enteros>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerNumerosEnteros ();
	}

	private static void leerNumerosEnteros() {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero entero");
		int entero = sc.nextInt();
		int suma = 0, cont = 0;
		Enteros aux = new Enteros();
		
		while (entero != 0) {
			
			aux.
			suma = suma + entero;
			cont = cont + 1 ;
			System.out.println("Introduce un numero entero");
			entero = sc.nextInt();
			
		}
		
		double media = suma / cont;
		System.out.println("Esta es la media: " + media);
		System.out.println("Esta es la suma: " + suma);
		System.out.println("Estos son los números: " + enteros.toString());
		
	}
	
	
	

}
