package com.arrays;

import java.util.Scanner;

public class arrays1_AEBR {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 1===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		// Crea un array de 10 posiciones de n�meros con valores pedidos por teclado. 
		//Muestra por consola el �ndice y el valor al que corresponde. 
		Scanner input = new Scanner(System.in);
		
		int [] numeros2 = new int [5];
		for (int i=0; i<numeros2.length; i++) {
			System.out.println("Ingresa un numero en la pisci�n " + i);
			numeros2 [i]=input.nextInt();
		}
		for (int i=0; i<numeros2.length; i++) {
			System.out.println("En la posici�n "+ i + "esta el n�mero" + numeros2[i]+ "," );
		   }
		
	}

}
