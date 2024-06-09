package com.condicionales;

import java.util.Scanner;

public class Condicionales4_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 4 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Realiza un programa que lea una cadena por teclado y compruebe si");
		System.out.println("contiene letras mayúsculas.");
		System.out.println("=====================================================================================");		
		System.out.println("");
		
		String cadena;
		String cadenaMin;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una cadena de texto: ");
		cadena=entrada.nextLine();
		cadenaMin = cadena.toLowerCase();

		System.out.println("\nResultado:");	

		if (cadena.equals(cadena.toLowerCase())) {
			System.out.println("La cadena NO contiene MAYUSCULAS");
		}else {
			System.out.println("La cadena SI contiene MAYUSCULAS");
		}
		
	}
	
}
