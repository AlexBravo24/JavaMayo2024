package com.arrays;

public class Arrays2_ACS {

	public static void main(String[] args) {

		// 2. Crea un array de números de 100 posiciones, que contendrá los números del
		// 1 al 100. Obtén la suma de todos ellos y la media
		// Crear un array de números del 1 al 100
		int[] numeros = new int[100];
		for (int i = 0; i < 100; i++) {
			numeros[i] = i + 1;
		}

		// Calcular la suma de todos los números en el array
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}

		// Calcular la media
		double media = (double) suma / numeros.length;

		// Mostrar la suma y la media
		System.out.println("La suma de los números del 1 al 100 es: " + suma);
		System.out.println("La media de los números del 1 al 100 es: " + media);

	}

}
