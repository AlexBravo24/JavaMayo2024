package com.Array;

import java.util.Scanner;

public class Array1_JCMJ {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de n�meros con valores pedidos por teclado. 
		//Muestra por consola el �ndice y el valor al que corresponde.
		
		 int[] numeros = new int[10];

	        // Solicitar valores por teclado
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Introduce un n�mero para la posici�n " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Mostrar �ndice y valor
	        System.out.println("�ndice\tValor");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println(i + "\t" + numeros[i]);
	        }
	    }
	}


