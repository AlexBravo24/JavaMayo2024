package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JABR {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado 
		//y compruebe si contiene letras mayúsculas.
		
		System.out.println("=============================");
		System.out.println("========Ejercicio 4==========");
		System.out.println("=============================");
		
		Scanner entrada = new Scanner(System.in);
		String cadena;
		
		System.out.println("Introduce una cadena de texto");
		cadena=entrada.nextLine();
		
		String minusculas = cadena.toLowerCase();
		
		if (cadena.equals(minusculas)) {
			System.out.println("La cadena de texto solo tiene minusculas");
		}else {
			System.out.println("La cadena de texto contiene MAYÚSCULAS");
		}
		System.out.println("=============================");
		System.out.println("=======FIN DEL PROGRAMA======");
		System.out.println("=============================");
		

	}

}
