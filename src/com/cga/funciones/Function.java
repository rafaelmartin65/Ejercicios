/**
 * 
 */
package com.cga.funciones;



/**
 * @author Rafael Martin
 * 
 * Actividad funciones: --> Funcion Eco: pasa un parametro "n" he imprime n veces el menaje Eco.
 *
 */
public class Function {

	//Funcion Eco impresion
	public void ecoPrint (int n) {
		System.out.println("/////////////////////////////////////////");
		for (int i = 1; i <= n ; i++) {
			System.out.println("Eco..");
		}
		
		
	}
	
	
	//Funcion numeros enteros entre 2 numeros
	public void numeros (int n1, int n2) {
		
		int menor, mayor, i;
		
		if (n1 < n2) {
			menor = n1;
			mayor = n2;
		}else {
			menor = n2;
			mayor = n1;
			
		}
		System.out.println("/////////////////////////////////////////");
		for (i = menor + 1; i < mayor ; i++) {
			System.out.println(i);
		}
		
		
	}

	//*******************************
	public void cilindro (int option, double radio, double altura) {
		
		final double PI = 3.141516;
		double areaCilindro, volumenCilindro;
		
		System.out.println("/////////////////////////////////////////");
		if(option == 1) {
			//calcular el area del cilindro A= 2*PI*radio(altura + radio)
			areaCilindro = 2 * PI * radio * ( altura + radio);
			System.out.println("El área del cilindro es: " + areaCilindro + " mts 2");
			
		}else {
			//calcular el volumen
			volumenCilindro = PI * radio * radio * altura;
			System.out.println("El volumen del cilindro es: " + volumenCilindro + " mts 3");
		}
		
		
		
		
	}
	
	//Ejercico 4
	public void mayorDosNumeros (int num1, int num2) {
		
	
		
		System.out.println("/////////////////////////////////////////");
		if(num1 > num2) {
			//calcular el area del cilindro A= 2*PI*radio(altura + radio)
			System.out.println("El mayor de los dos es el número 1: " + num1);
			
		}else {
			//calcular el volumen
			System.out.println("El mayor de los dos es el número 2: " + num2);
		}
		
		
		
		
	}
	
	//****************************************************
	public void correspondeVocal (String caracter) {
		boolean verdadero;
	
		
		System.out.println("/////////////////////////////////////////");
		switch (caracter){
			case "a":
				verdadero = true;
				break;
			case "e":
				verdadero = true;
				break;
			case "i":
				verdadero = true;
				break;
			case "o":
				verdadero = true;
				break;
			case "u":
				verdadero = true;
				break;
			default:
				verdadero = false;
				
				
			}
		
		if (verdadero) {
			System.out.println("el parametro es una vocal");
		
		}
		
		
		
		
	}
	
	
	public boolean esNumeroPrimo (int num) {
		
		boolean prime = true;
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				prime = false;
				
			}
		}
		
		// System.out.println("El número: " + num + " Es número primo? " + prime);
		return prime;
		
	}

	
	public int divisoresPrimos (int num) {
		
		
		int j, count = 0;
		
		System.out.println("Divisores primos: ****************\n");
		
		for (j = 1; j <= num; j++) {
			if (num % j == 0 && esNumeroPrimo(j) ) {
				
				count++;
			}
			
		}
		
		System.out.println("El número de divisores primos de " + num + " son: " + count);
		
		return count;
		
		
	}
	
	
	//Funcion calculadora
	public int calculadora (double num1, double num2, int operacion) {
		
		double resultado = 0;
		switch (operacion) {
			case 1:
				resultado = num1 + num2;
				
				break;
			case 2:
				resultado = num1 - num2;
				
				break;
			case 3:
				resultado = num1 * num2;
				
				break;
			case 4:
				if (num2 != 0) {
					resultado = num1 / num2;
				}else {
					System.out.println("no se puede dividir por cero");
				}
				
				break;
		}
		
		System.out.println("El resultado es: " + resultado);
		return (int) resultado;
		
		
	}//Fin calculadora
	
	
	
	//Ejercico 4
		public void mayorDosNumeros (int num1, int num2, int num3) {
			
		
			
			System.out.println("/////////////////////////////////////////");
			if(num1 > num2) {
				if (num1 > num3) {
					System.out.println("El mayor de los tres es el número 1: " + num1);
				}else{
					System.out.println("El mayor de los tres es el número 3: " + num3);
				}

			}else{
				if (num2 > num3) {
					System.out.println("El mayor de los tres es el número 2: " + num2);
				}else{
					System.out.println("El mayor de los tres es el número 3: " + num3);
				}
				
				
			}
			
			
			
			
		}
	

	
	
}
