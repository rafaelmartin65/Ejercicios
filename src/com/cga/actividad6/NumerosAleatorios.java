/**
 * 
 */
package com.cga.actividad6;



/**
 * @author Rafael Martin
 * 
 * Actividad #6 --> ejercicio 15: Generar 100 números aleatorios y conocer cuál es el mayor 
 *
 */
public class NumerosAleatorios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Definir vairables
		int aleatorio, mayor = 0, menor = 100, suma = 0, media, i = 0;
		
		
		
		
		// Generar 100 números aleatorio
		for (i = 0; i < 101 ; i++) {
			aleatorio = (int) (Math.random()*100 + 1);
			suma += aleatorio;
			System.out.println(aleatorio);
			if (mayor < aleatorio) {
				mayor = aleatorio;
			}
			
			if (menor > aleatorio){
				menor = aleatorio;
			}
		}
		media = suma / 100;
		System.out.println("El número mayor generado es: " + mayor);
		System.out.println("El número menor generado es: " + menor);
		System.out.println("La suma de todos los números es: " + suma);
		System.out.println("La media de todos los números es: " + media);
	}

}
