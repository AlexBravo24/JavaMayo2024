package com.condicionales;

import java.util.Scanner;

public class Condicionales4_VBM {

	public static void main(String[] args) {
		
		//Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas 
		System.out.println("==================================");
		System.out.println("============Ejercicio 4===========");
		System.out.println("==================================");
		
		Scanner entrada = new Scanner(System.in);
		String cadena;
		
		System.out.println("Introduce una cadena de texto");
		cadena=entrada.nextLine();
		
		String minuscula =cadena.toLowerCase();
		
		if (cadena.equals(minuscula)) {
			System.out.println("La cadena de texto solo tiene minusculas");
		}else {
			System.out.println("La cadena de texto contiene MAYUSCULAS");
		}
		System.out.println("=================================");
		System.out.println("======Fin del programa===========");
		System.out.println("=================================");
		
	}

}
