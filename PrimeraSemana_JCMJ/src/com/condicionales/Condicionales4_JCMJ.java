package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JCMJ {

	public static void main(String[] args) {
		//Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		
		String letra;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digita una letra");
		letra=entrada.nextLine();
		String minusculas = letra.toLowerCase();
		if(letra.equals(minusculas)) {
			System.out.println("Solo contiene minusculas");
		}else {
			System.out.println("Solo tiene Mayusculas");
		}
		
		  }
}