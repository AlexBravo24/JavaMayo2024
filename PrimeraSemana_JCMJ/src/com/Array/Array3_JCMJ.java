package com.Array;

import java.util.Scanner;

public class Array3_JCMJ {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		
		 Scanner scanner = new Scanner(System.in);
	        
	        // Pedir al usuario que introduzca una frase
	        System.out.println("Por favor, introduce una frase:");
	        String frase = scanner.nextLine();
	        
	        // Convertir la frase en un array de caracteres
	        char[] arrayDeCaracteres = frase.toCharArray();
	        
	        // Imprimir el array de caracteres
	        System.out.println("El array de caracteres es:");
	        for (char c : arrayDeCaracteres) {
	            System.out.print(c + " ");
	        }
	    }
	}


