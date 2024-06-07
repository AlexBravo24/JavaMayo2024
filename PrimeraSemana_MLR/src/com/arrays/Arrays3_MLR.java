package com.arrays;

import java.util.Scanner;

public class Arrays3_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 3 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Pide al usuario por teclado una frase y pasa sus caracteres a un array de");
		System.out.println("caracteres.");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		String frase;
		int largo;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce una palabra o frase: ");
		frase=entrada.nextLine();
		largo = frase.length();
		System.out.println(largo);
		
		String [] matriz = new String [largo];

		for (int i = 0; i < largo; i++) {
			matriz[i] = frase.substring(i, i + 1);
			System.out.println(frase.substring(i, i + 1));
		}
		
		
		System.out.println("\nResultado:");	
		
		System.out.println("Posicion, valor");
		for (int i = 0; i < largo; i++) {
			System.out.println(i +". -> " + matriz[i]);
		}
	
	}

}
