package com.arrays;

import java.util.Scanner;

public class Arrays3_ACS {

	public static void main(String[] args) {

		// .3 Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		// caracteres.

		// Crear un objeto Scanner para leer la entrada del teclado
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese una frase
		System.out.print("Ingresa una frase: ");
		String frase = scanner.nextLine();

		// Convertir la frase a un array de caracteres
		char[] caracteres = frase.toCharArray();

		// Mostrar el array de caracteres por consola
		System.out.println("La frase convertida a un array de caracteres es:");
		for (char caracter : caracteres) {
			System.out.print(caracter + " ");
		}

		// Cerrar el Scanner para liberar recursos
		scanner.close();

	}

}
