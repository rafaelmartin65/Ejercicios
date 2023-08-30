/**
 * 
 */
package com.cga.coche;

/**
 * @author Alumno
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Coche obj = new Coche();
			
		Coche.LeerCoches();
		System.out.println("\nCoches introducidos: ");
		Coche.mostrarCoches();
		Coche.mostrarPorMarca();
		Coche.mostrarPorKm();
		System.out.println("\nCoches con mayor número de km: ");
		Coche.mostrarMayorKm();
		System.out.println("\nCoches ordenados de menor a mayor número de km: ");
		Coche.mostrarOrdenadosPorKm();
		System.out.println("\nIntroduce matricula a eliminar: ");
		Coche.eliminarCoche();
		System.out.println("Fin...");
	}

}
