package com.arrays;

import java.util.Scanner;

public class Arrays1_ACS {

	public static void main(String[] args) {

		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por consola el índice y el valor al que corresponde.

		// Crear un array de 10 posiciones
		int[] array = new int[10];

		// Crear un objeto Scanner para leer la entrada del teclado
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese los valores y almacenarlos en el array
		for (int i = 0; i < array.length; i++) {
			System.out.print("Ingrese el valor para la posición " + i + ": ");
			array[i] = scanner.nextInt();
		}

		// Mostrar por consola el índice y el valor correspondiente
		System.out.println("Índice\tValor");
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "\t" + array[i]);
		}

		// Cerrar el Scanner para liberar recursos
		scanner.close();

	}

}
