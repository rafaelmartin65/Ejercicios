/**
 * 
 */
package com.cga.cliente;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rafael Martín
 * Introducir numeros enteros hasta que se ingrese un 0. Mostrar la suma, la media y los números introducidos.
 *
 */
public class Enteros {

	/**
	 * @param args
	 */
	
	
	

	static ArrayList<Integer> enteros = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Ejecutar procedimientos
		leerNumerosEnteros ();
		mostrarResultados();
	}
	
	private static void mostrarResultados() {
		int suma = 0;
		
		//Mostrar números introducidos
		System.out.println("Números introducidos: ");
		for (int num : enteros) {
			System.out.println(num +" ");
			suma += num;
		}
		
		double media = (double) suma / enteros.size();
		
		System.out.println("\nSuma: " + suma);
		System.out.println("Media: " + media);
	}

	private static void leerNumerosEnteros() {
		// Decalara variable y bucle para leer números desde teclado
		
		int num;
		do {
			System.out.println("Introduce un numero entero ( 0 para salir): ");
			num = sc.nextInt();
			enteros.add(num);
			
			
		} while (num != 0);
		
		enteros.remove(enteros.size() - 1);
		
	}

	
	
	
	
	

	

	
	
	
	

}
