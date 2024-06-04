package com.ciclos;

import java.util.Scanner;

public class Ciclos3_ACS {

	public static void main(String[] args) {

		// 3.Realiza un programa para determinar si un String es palíndromo

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Escriba una palabra para determinar si es palindromo");
//		String s = sc.nextLine();
//		System.out.println(s);
//
//		int fin = s.length() - 1;
//		int ini = 0;
//		boolean espalin = true;
//
//		while (ini < fin) {
//			if (s.charAt(ini) != s.charAt(fin)) {
//				espalin = false;
//			}
//			ini++;
//			fin--;
//		}
//		if (espalin)
//			System.out.println("Es palindromo");
//		else
//			System.out.println("No es palindromo");

		// 3. Realiza un programa para determinar si un
		// String es palíndromo.

		// Declaro una variable de tipo String para almacenar la
		// frase que solicitare mediante teclado
		String original; // ana
		// Despues declaro otro String para armar la cadena de texto
		// original pero en reversa //ana
		String reversa = " " + "";

		// Necesitamos un Scanner para introducir los valores por teclado
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una palabra o frase");
		original = entrada.nextLine();

		// Una vez tenemos guardado el String original
		// Necesitamos un ciclo que nos permita extraer caracter por caracter
		// Ahora iniciando por el ultimo caracter y que este se vuelva el primero
		// en y lo guardemos en el String reversa

		for (int i = original.length() - 1; i >= 0; i--) {
			// Armamos la reversa extrayendo caracter por caracter
			reversa = reversa + original.charAt(i); // a + n + a
		}
		System.out.println("Reversa: " + reversa);

		// Evaluamos si las cadenas son iguales, para ello debemos reemplazar
		// los espacios e ignorar el uso de mayusculas y minusculas
		// Anitalavalatina //anitalavalatinA
		if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");

		}

	}

}
