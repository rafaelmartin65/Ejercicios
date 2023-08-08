/**
 * 
 */
package com.cga.actividad4;

import java.util.Scanner;

/**
 * @author Rafael Martin
 * 
 *  Actividad número #4 -> ejercicio 8: Calcular hora despues de sumarle h horas.
 *
 */
public class CalculaHora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración variables
		
				int horaActual, cantidadHoras, resultado, temp, suma;
				
				
				

				Scanner sc = new Scanner(System.in);
				
				// Pedir valores por teclado
				
				System.out.println("Introduce la hora actual: " );
				horaActual = sc.nextInt();
				
				System.out.println("Introduce la cantidad de horas a sumar: " );
				cantidadHoras = sc.nextInt();
				
				suma = horaActual + cantidadHoras;
				
				
				//calculo de hora futura
				temp = 0;
				if (suma > 24) {
					temp = 24 - horaActual;
					
					resultado = cantidadHoras - temp;
					
					while (resultado >= 24) {
						resultado = resultado - 24;
					}
				}else {
					resultado = suma;
				}
				
				
				
				
				//Salida por pantalla
				System.out.println("En " + cantidadHoras + " horas, el reloj macara las " + resultado);
				
				
				
				
				
				
				sc.close();


	}

}
