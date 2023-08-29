/**
 * 
 */
package com.cga.cliente;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Rafael Martín
 * 
 * Método que recibe un ArrayList String y lo modifica invirtiendo su contenido
 *
 */
public class InvertirArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declara el ArrayList
		
		ArrayList<String> palabras = new ArrayList<>();
		palabras.add("tal?");
		palabras.add("que");
		palabras.add("Hola");
		
		System.out.println("Lista original: " + palabras);
		
		invertirArrayList(palabras);
		
		System.out.println("Lista palabras invertidas: " + palabras);
		
	}
	
	public static void invertirArrayList(ArrayList<String> lista) {
		
		// Podemos invertir usando el collection
		Collections.reverse(lista);
		
		
//		int izq = 0;
//		int der = lista.size() - 1;
//		
//		while (izq < der) {
//			String temp = lista.get(izq);
//			lista.set(izq, lista.get(der));
//			lista.set(der, temp);
//			izq++;
//			der--;
		}
	
	
	

}
