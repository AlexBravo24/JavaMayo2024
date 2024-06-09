package com.ciclos;

import java.util.Scanner;

public class Ciclos3_VIJL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		String reversa = "";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una palabra o frase");
		frase = entrada.nextLine();
		
		for (int i = frase.length()-1 ; i>=0 ; i--) {
			
			reversa = reversa + frase.charAt(i); 
		}

		System.out.println("Reversa: " + reversa);
		
		if (frase.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
	}

}
