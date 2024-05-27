package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JCSA {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.
		System.out.println("*************************************************************");
		System.out.println("***Este programa te determina si una palabra es palindromo***"); 
		System.out.println("*************************************************************\n");
		
		String palabra;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese una palabra ");
		palabra = entrada.nextLine();
		palabra = palabra.replace(" ", "").toLowerCase();
		
//		
		
//		
//		boolean  esPalindromo = true;
//		for (int i = 0, j=palabra.length()-1; i<=j ; i++, j--) {
//			if(palabra.charAt(i) != palabra.charAt(j)) {
//			esPalindromo = false;	
//			break;
//		}
//		
//		if (esPalindromo) {
//		    System.out.println("La palabra es palíndromo");
//		    } else {
//		    System.out.println("La palabra NO es palíndromo");
//		    }
		
		
		
	for (int i = 0, j=palabra.length()-1; i<=j ; i++, j--) {
				if(palabra.charAt(i) != palabra.charAt(j)) {
				System.out.println("La palabra NO palindromo");		
				return;
		}
			
			else {
				System.out.println("La palabra es palindromo");
				return;
				}
				
		}
		
		entrada.close();
		
	}

}
