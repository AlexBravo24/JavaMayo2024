package com.arrays;

import java.util.Scanner;

public class Arrays3_VIJL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pide al usuario por teclado una frase y pasa sus caracteres a un array de
//		caracteres.
		
		String frase;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa una palabra o frase");
		frase = entrada.nextLine();
		
		char cadena [] = new char [frase.length()];
		
		for (int i = 0 ; i<= frase.length()-1 ; i++) {
			cadena[i] = frase.charAt(i);
		}
		
		for (int i = 0 ; i<= frase.length()-1 ; i++) {
			System.out.println(cadena[i]);
		}
		
	}

}
