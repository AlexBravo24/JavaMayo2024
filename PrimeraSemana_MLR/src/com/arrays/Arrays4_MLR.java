package com.arrays;

public class Arrays4_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 4 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Dado un array de números de 5 posiciones con los siguientes valores: ");
		System.out.println("{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con");
		System.out.println("los valores invertidos, es decir, que el segundo array deberá tener los valores");
		System.out.println("{5,4,3,2,1}. ");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		//Delcaracion de variables
		int [] original = {1,2,3,4,5};
		int [] reversa = new int [5];

			
		System.out.println("\nResultado:");
		System.out.println("");
		
		for (int i = original.length - 1; i >= 0; i--) {
			//Armamos la reversa extrayendo caracter por caracter
			reversa[4 - i] = original[i];
			System.out.print("Original[" + (4 - i) + "] " + original[4 - i]);
			System.out.println(" Reversa[" + (4 - i) + "] " + reversa[4 - i]);
		}
		
	}

}
