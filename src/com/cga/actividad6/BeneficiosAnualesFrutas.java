/**
 * 
 */
package com.cga.actividad6;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 12: Beneficios anuales en al venta de mazanas y peras según los kilos vendidos 
 */
public class BeneficiosAnualesFrutas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
		double kilosManzanas = 0, kilosPeras = 0, ventasAnualesManzanas, ventasAnualesPeras;
		final double PRECIOS_MANZANAS = 2.35;
		final double PRECIOS_PERAS = 1.95;
		int cont;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// Solicitar los kilos vendidos por teclado
		
		for (cont = 1; cont <= 2; cont++ ) {
			System.out.println("Introducir los kilos vendidos de manzanas (semestre " + cont + " ): ");
			kilosManzanas = kilosManzanas + sc.nextDouble();
			
			System.out.println("Introducir los kilos vendidos de peras (semestre " + cont + " ): ");
			kilosPeras = kilosPeras + sc.nextDouble();
		}
		//Calcular el importe de las ventas anuales
		
		ventasAnualesManzanas = (kilosManzanas * PRECIOS_MANZANAS) * 2;
		ventasAnualesPeras = (kilosPeras * PRECIOS_PERAS) * 2;
		
		System.out.printf("Las ventas anuales de Manzanas fué:  %,.2f€%n", +ventasAnualesManzanas);
		System.out.printf("Las ventas anuales de Peras fué:  %,.2f€%n", +ventasAnualesPeras);
		
		sc.close();
	}

}
