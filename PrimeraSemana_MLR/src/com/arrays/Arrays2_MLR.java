package com.arrays;

import java.util.Scanner;

public class Arrays2_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 2 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Crea un array de números de 100 posiciones, que contendrá los números del ");
		System.out.println("1 al 100. Obtén la suma de todos ellos y la media.");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		int [] matriz = new int [100];
		int suma = 0;
		float media = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i]=i + 1;			
		}
		
		System.out.println("\nResultado:");	
		
		System.out.println("Posicion, valor");
		for (int i = 0; i < matriz.length; i++) {
			suma = suma + matriz[i];
			System.out.println(i +". -> " + matriz[i] + "-> " + suma);
		}
			media = suma / 100;
			
			System.out.println();
			System.out.println("La suma de los numeros del 1-100 es: " + suma);
			System.out.println("La media de los numeros del 1-100 es: " + String.format("%.2f", media));
	}

}
