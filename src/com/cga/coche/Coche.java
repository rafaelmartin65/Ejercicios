/**
 * 
 */
package com.cga.coche;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rafael Martín
 *
 */
public class Coche {
	// Definir atributos
	private String matricula;
	private String marca;
	private String modelo;
	private int Km;
	
	
	//Crear un ArrayList
	static ArrayList<Coche> coches = new ArrayList<Coche>();
	static Scanner sc = new Scanner(System.in);
	
	// comentario
//	public static void main(String[] args) {
//		LeerCoches();
//		System.out.println("\nCoches introducidos: ");
//		mostrarCoches();
//		mostrarPorMarca();
//		mostrarPorKm();
//		System.out.println("\nCoches con mayor número de km: ");
//		mostrarMayorKm();
//		System.out.println("\nCoches ordenados de menor a mayor número de km: ");
//		mostrarOrdenadosPorKm();
//		System.out.println("\nIntroduce matricula a eliminar: ");
//		eliminarCoche();
//		
//	}// Fin metodo main
	
	
	public static void eliminarCoche() {
		//Declara variable
		String matricula;
		System.out.print("Introduce matricula: ");
		matricula = sc.nextLine();
		
		//System.out.println("Coches de la matricula " + matricula);
		
		for (int i = 0;i < coches.size(); i++) {
			if (coches.get(i).getMatricula().equalsIgnoreCase(matricula)) {
				//System.out.println(coches.get(i));
				coches.remove(i);
				System.out.println("matricula eliminada: " + matricula);
			}
		}
		System.out.println("Mostrar coches despues de eliminar, el: " + matricula );
		mostrarCoches();
	}


	public static void mostrarOrdenadosPorKm() {
		// Declara variables
		int i, j;
		Coche aux;
		for (i = 0; i < coches.size() - 1; i++) {
			for (j = 0; j < coches.size() - i - 1; j++) {
				if (coches.get(j + 1).getKm() < coches.get(j).getKm()) {
					aux = coches.get(j + 1);
					coches.set(j + 1, coches.get(j));
					coches.set(j, aux);
				}
				mostrarCoches();
			}
		}
		
	}// fin mostrar coches


	public static Coche mostrarMayorKm() {
		// declarar objeto
		
		Coche mayor = coches.get(0);
		for (int i = 0; i < coches.size(); i++) {
			if (coches.get(i).getKm() > mayor.getKm()) {
				mayor = coches.get(i);
			}
			
		}
		return mayor;
		
	}


	public static void mostrarPorKm() {
		//declara variables
		int Km;
		System.out.print("Introduce numero de kilómetros: ");
		Km = sc.nextInt();
		System.out.println("Coches con menos de " + Km + " Km");
		for (int i = 0; i < coches.size(); i++) {
			if (coches.get(i).getKm() < Km);
			System.out.println(coches.get(i));
		}
		
	}// fin metodo mostrarPorKm


	public static void mostrarPorMarca() {
		String marca;
		System.out.print("Introduce marca: ");
		marca = sc.nextLine();
		System.out.println("Coches de la marca " + marca);
		for (int i = 0;i < coches.size(); i++) {
			if (coches.get(i).getMarca().equalsIgnoreCase(marca)) {
				System.out.println(coches.get(i));
			}
		}
		
	}


	public static void mostrarCoches() {
		for (int i = 0; i < coches.size(); i++) {
			System.out.println(coches.get(i));
		}
		
	}// fin metodo mostrar coches

	
	
	public static void LeerCoches() {
		// Declaracion de variables
		String matricula;
		String marca;
		String modelo;
		int Km;
		
		//Variable auxiliar que contendrá la referencia a cada coche nuevo
		Coche aux;
		int i, N;
		// Se pide por teclado elnúmero de coches a leer
		do {
			System.out.print("Número de coches?: ");
			N = sc.nextInt();
		}while (N < 0);
		sc.nextLine(); // limpiar el intro
		
		//Lectura de coches
		for(i = 1; i <= N; i++) {
			// Leer datos de cada coche
			System.out.println("Coche " + i);
			System.out.println("Matrícula: ");
			matricula = sc.nextLine();
			System.out.println("Marca: ");
			marca = sc.nextLine();
			System.out.println("Modelo: ");
			modelo = sc.nextLine();
			System.out.println("Número de kilómetros: ");
			Km = sc.nextInt();
			sc.nextLine(); //limpiar intro
			
			aux = new Coche(); // Se crea el objeto Coche
			 // Se asignan valores
			aux.setMatricula(matricula);
			aux.setMarca(marca);
			aux.setModelo(modelo);
			aux.setKm(Km);
			
			// se añade el objeto al final del
			coches.add(aux);
			
		}// fin bucle for
		
	}// Fin metodo leerCoche

	
	
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", Km=" + Km + "]";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKm() {
		return Km;
	}
	public void setKm(int km) {
		Km = km;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
