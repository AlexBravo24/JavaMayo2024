package com.ciclos;

import java.util.Scanner;

public class Ciclos3_YTA {

	public static void main(String[] args) {
		
		//3. Realiza un programa para determinar si un 
		//String es palindromo.
		
		//Declaro una variable de tipo String para almacenar la
		//frase que solicitare mediante teclado
		String original; 
		//Despues declaro otro String para armas la cadena de texto
		//original pero en reversa.
		String reversa =""; 
		
		//Necesitamos un Scanner para introducir los valores por teclado
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una palabra o frase");
		original = entrada.nextLine();
		
		//Una vez tenemos guardado el String original 
		//necesitamos un ciclo que nos permita extraer caracter por caracter
		//ahora inici9ando por el ultim caracter y este se vuelva el primero
		//en y lo guardemos en el String reversa
		
		for (int i = original.length()-1; i>=0; i--) {
			//Armamos la reversa extrayendo caracter por caracter
			reversa = reversa + original.charAt(i);//a+n+a
		}
		System.out.println("Reversa: " + reversa);
		
		//Evaluamos si las cadenas osn iguales, para ello debemos reemplazar
		//los espacios e ignorar el uso de mayusculas y minusculas
		if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
				System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
			
		}
		
	}

}
