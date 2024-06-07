package com.ciclos;

import java.util.Scanner;

public class Ciclos3_VBM {

	public static void main(String[] args) {
		
		// Realizar un programa para determinar si un 
		//String es palindromo
		
		
		//Declaro una variable de tipo String para almacenar la
		//frase que solicitare mediante teclado
		String original; //ana
		//Despues declaro otro String para armar la cadena de tecto
		//original pero en reversa //ana
		String reversa = ""; 
		
		//Necesitamos un scanner para introducir los valores por teclado
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una palabra o frase");
		original = entrada.nextLine();
		
		//Una vez que tenemos guardado el String Original
		//Necesitamos un ciclo que nos permita extraer caracter por caracter
		//Ahora iniciando por el ultimo caracter y que este se vuelva el primero
		//y lo guardemos en el string reversa
		
		for (int i = original.length()-1; i>=0; i--) {
			//armamos la reversa extrayendo caracter por caracter
			reversa = reversa + original.charAt(i); // a + n + a
		}
		System.out.println("Reversa: " + reversa);
		
		//Evaluamos si las cadenas son iguales, para ello debemos reemplazar
		//los espacios e ignorar el uso de mausculas y minusculas
		if (original.replace("", "").equalsIgnoreCase(reversa.replace(" ", " "))) {
			System.out.println("Es un palindromo");
		}else {
			System.out.println("No es palindromo");
		}

	}

}
