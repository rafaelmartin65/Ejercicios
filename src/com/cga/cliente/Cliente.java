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
public class Cliente {

	//Definir atributos
	String nombre;
	String apellidos;
	String dni;
	int edad;
	String calle;
	int numero;
	int cp;
	String provincia;
	
	
	//Crear un ArrayList
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	static Scanner sc = new Scanner(System.in);
		
	
	public static void main(String[] args) {
		
		leerCliente();
		mostrarClientes();
		
	}
	
	private static void mostrarClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));
		}
		
	}// fin metodo mostrar clientes
	
	private static void leerCliente() {
		// Declaracion de variables
		String nombre;
		String apellidos;
		String dni;
		int edad;
		String calle;
		int numero;
		int cp;
		String provincia;
		
		//Variable auxiliar que contendrá la referencia a cada cliente nuevo
		Cliente aux;
		int i, N;
		// Se pide por teclado el número de clientes a leer
		do {
			System.out.print("Número de clientes?: ");
			N = sc.nextInt();
		}while (N < 0);
		sc.nextLine(); // limpiar el intro
		
		//Lectura de clientes
		for(i = 1; i <= N; i++) {
			// Leer datos de cada cliente
			System.out.println("Clientes " + i);
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Apellidos: ");
			apellidos = sc.nextLine();
			System.out.println("DNI: ");
			dni = sc.nextLine();
			System.out.println("Edad: ");
			edad = sc.nextInt();
			System.out.println("Calle: ");
			calle = sc.next();
			System.out.println("Número: ");
			numero = sc.nextInt();
			System.out.println("CP: ");
			cp = sc.nextInt();
			System.out.println("Provincia: ");
			provincia = sc.next();
			
			
			
			aux = new Cliente(); // Se crea el objeto Cliente
			 // Se asignan valores
			aux.setNombre(nombre);
			aux.setApellidos(apellidos);
			aux.setDni(dni);
			aux.setEdad(edad);
			aux.setCalle(calle);
			aux.setNumero(numero);
			aux.setCp(cp);
			aux.setProvincia(provincia);
			
			
			// se añade el objeto
			clientes.add(aux);
			
			
			sc.nextLine(); //limpiar intro
		}// fin bucle for
		
	}// Fin metodo leerClientes
	
	//definir toString
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", edad=" + edad + ", calle="
				+ calle + ", numero=" + numero + ", cp=" + cp + ", provincia=" + provincia + "]";
	}
	
	//Definir getters and setters

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
