package com.condiciones;

import java.util.Scanner;

public class Condicionales4_JCSA {

	public static void main(String[] args) {
		//4. Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.

		String cadena, cadenaMinusculas;
		Scanner entrada = new Scanner (System.in);
		System.out.println("***Este programa determinara si el texto que escribas contiene letras mayusculas***");
		System.out.println();
		System.out.println("Introduce un texto:");
		cadena=entrada.nextLine();
		cadenaMinusculas = cadena.toLowerCase();
		
		if(cadena.equals(cadenaMinusculas)) {
			System.out.println("Toda el texto contine letras minusculas");
		}
		else {
			System.out.println("Este texto contiene por lo menos una letra mayuscula");
		}
				
		entrada.close();
	}

}
