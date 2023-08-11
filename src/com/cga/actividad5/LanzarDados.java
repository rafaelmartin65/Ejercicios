/**
 * 
 */
package com.cga.actividad5;

/**
 * @author Rafael Martín
 * 
 * Actividad número #5 -> ejercicio 7: Dos jugadores lanzan 2 dados, mostrar la jugada mas alta de las 2.
 * 										Mostrar la media de los 4 redondeada	
 *
 */
public class LanzarDados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definir variables
		double aleatorio, media1, media2, media;
		int dado1, dado2, resultado1, resultado2, aleatorioInt;
		
		// Lanza el dado 1 el juegador 1
		aleatorio = Math.random()*10;
		aleatorioInt = (int) aleatorio;
		
		
		
		// comprueba rango numero del dado
		if (aleatorioInt > 6 ) {
			aleatorioInt -= 3;
		}else if (aleatorioInt == 0){
			aleatorioInt ++;
			
		}
		
		// Asignar valor al dado 1
		dado1 = aleatorioInt;
		
		
		
		// Lanza el dado 2 el juegador 1
		aleatorio = Math.random()*10;
		aleatorioInt = (int) aleatorio;
		
		
		
		// comprueba rango numero del dado
		if (aleatorioInt > 6 ) {
			aleatorioInt -= 3;
		}else if (aleatorioInt == 0){
			aleatorioInt ++;
			
		}
		
		// Asignar valor al dado 2
		dado2 = aleatorioInt;
		
		System.out.println("El Primer jugador hace su lanzamiento \n");
		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		
		resultado1 = dado1 + dado2;
		
		// Cáculo media Primer jugador
		media1 = resultado1/2;
		
		
		System.out.println("Resultado del primer jugador es: " + resultado1);
		
		// Lanza el dado 1 el juegador 2
		aleatorio = Math.random()*10;
		aleatorioInt = (int) aleatorio;
		
		// comprueba rango numero del dado
		if (aleatorioInt > 6 ) {
			aleatorioInt -= 3;
		}else if (aleatorioInt == 0){
			aleatorioInt ++;
			
		}
		
		// Asignar valor al dado 1
		dado1 = aleatorioInt;
		
		// Lanza el dado 2 el juegador 2
		aleatorio = Math.random()*10;
		aleatorioInt = (int) aleatorio;
		
		// comprueba rango numero del dado
		if (aleatorioInt > 6 ) {
			aleatorioInt -= 3;
		}else if (aleatorioInt == 0){
			aleatorioInt ++;
			
		}
		
		// Asignar valor al dado 1
		dado2 = aleatorioInt;
		
		System.out.println("\nEl Segundo jugador hace su lanzamiento \n");
		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		
		resultado2 = dado1 + dado2;
		
		
		// Cáculo media Segundo jugador
		media2 = resultado2/2;
		
		// Cáculo media total
		
		media = Math.round((media1 + media2)/2);
		
		
		
		System.out.println("Resultado del segundo jugador es: " + resultado2);
		
		System.out.println("\nLa tirada mas alta es: " + Math.max(resultado1, resultado2));
		
		if (resultado1 > resultado2) {
			System.out.println("\nEl Primner jugador ha hecho la mayor tirada");
		}else {
			System.out.println("\nEl Segundo jugador ha hecho la mayor tirada");
		}

		System.out.printf("La media total es: %.0f%n", media);
	}

}
