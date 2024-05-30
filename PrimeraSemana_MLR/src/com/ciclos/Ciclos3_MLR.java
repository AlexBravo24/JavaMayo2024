package com.ciclos;

import java.util.Scanner;

public class Ciclos3_MLR {

	public static void main(String[] args) {

		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 3 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Realiza un programa para determinar si un String es palíndromo. ");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		//Declaro una variable de tipo String para almacenas la
		//frase que solicitare mediante el teclado
		
		String original;
		
		//Despues declaro otro string para armar la cadena de texto
		//original pero en reversa
		
		String reversa = "";
		
		//Necesitamos un Scanner para introducir los valores por teclado
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una palabra o frase");
		original = entrada.nextLine();
		
		//Una vez guadado el String Original
		//Necesiamos un ciclo que nos permita extraercaracter por caracter
		//AHora iniciando por el ultimo caracter y que este se vuelva el primero
		//en y lo guardemos en el string reversa
		
		for (int i = original.length() - 1; i >= 0; i--) {
			//Armamos la reversa extrayendo caracter por caracter
			reversa = reversa + original.charAt(i);
		}
		
		System.out.println("\nResultado:");
		
		System.out.println("Frase Original: " + original);
		System.out.println("Frase Reversa : " + reversa);
		System.out.println("");
		
		//Evaluamos si las cadenas son iguales, para ello debemos reemplazar
		//los espacio e ignorar el uso de mayusculas y minusculas
		if (original.replace(" ",  "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("La palabra o frase ES PALINDROMO");
		} else {
			System.out.println("La palabra o frase NO ES PALINDROMO");
		}
		
	}

}
