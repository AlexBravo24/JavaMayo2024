package com.Arrays;

import java.util.Scanner;

public class Arrasy1_YTA {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado. 
				//Muestra por consola el índice y el valor al que corresponde.

				 Scanner scanner = new Scanner(System.in);
			        int[] numeros = new int[10]; 

			        for (int i = 0; i < numeros.length; i++) {
			            System.out.print("Introduce el valor para la posición " + (i+1) + ": ");
			            numeros[i] = scanner.nextInt();
			        }

			        System.out.println("\nÍndice\tValor");
			        for (int i = 0; i < numeros.length; i++) {
			            System.out.println(i + "\t" + numeros[i]);
	}
	}
	

}
