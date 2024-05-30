package com.arrays;

import java.util.Scanner;

public class Arrays1_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 1 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Crea un array de 10 posiciones de números con valores pedidos por teclado. ");
		System.out.println("Muestra por consola el índice y el valor al que corresponde. ");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		int [] matriz = new int [10];
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Introduce el valor para la posicion " + i +": ");
			matriz[i]=entrada.nextInt();			
		}
		
		System.out.println("\nResultado:");	
		
		System.out.println("Posicion, valor");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(i +". -> " + matriz[i]);
		}
	
	}

}
