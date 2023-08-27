/**
 * 
 */
package com.cga.funciones;

import java.util.Scanner;

/**
 * @author Alumno
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// definir variables
		
		
		
		
		// Funcion 1 
		
		Function obj = new Function();
		obj.ecoPrint(5);
		
		
		// Funcion 2
		
		Function num = new Function();
		num.numeros(2, 6);
		
		
		// Funcion 3 
		
		Function cil = new Function();
		cil.cilindro(2, 2, 4);
		
		// Funcion 4
		Function may = new Function();
		may.mayorDosNumeros(3, 4);
		
		// Funcion 5
		Function voc = new Function();
		voc.correspondeVocal("f");
		
		// Funcion 6
		Function vocal = new Function();
		Scanner parametro = new Scanner(System.in);
		System.out.println("Introduce un caracter vocal o no: ");
		String variable = parametro.next();
		vocal.correspondeVocal(variable);
		
		
		// Funcion 7
		Function primo = new Function();
		primo.esNumeroPrimo(1000000);
		
		// Funcion 8
		Function numPrimos = new Function();
		numPrimos.divisoresPrimos(5);
		
		// Funcion 9
		Function calc = new Function();
		Scanner op = new Scanner(System.in);
		System.out.println("Introduce la opcion a realizar:\n 1.suma\n 2.resta\n 3.multiplicación\n 4.division: ");
		int operacion = op.nextInt();
		int result = calc.calculadora(10.8, 5, operacion);
		System.out.println("Valor devuelto " + result);
		
		// Funcion 10
		Function mayor3 = new Function();
		mayor3.mayorDosNumeros(1, 7, 8);
		
		
	}
	
	
	

}
