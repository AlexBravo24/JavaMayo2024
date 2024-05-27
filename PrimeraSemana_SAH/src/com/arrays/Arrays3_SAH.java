package com.arrays;

import java.util.Scanner;

public class Arrays3_SAH {

	public static void main(String[] args) {
		
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        char[] caracteres = frase.toCharArray();

        System.out.println("Caracteres de la frase:");
        for (char caracter : caracteres) {
            System.out.println(caracter);
        }

	}//Main

}//Final
