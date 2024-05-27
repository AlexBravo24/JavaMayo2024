package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Declarar un array 
		//int [] numeros = new int [5];
		
//		//guardar o asignar valores a cada posicon del array
//		numeros[0] = 1;
//		numeros[1] = 10;
//		numeros[2] = 20;
//		numeros[3] = 30;
//		numeros[4] = 40;
//		
//		
//		//Imprimir en consola la determinada posicion del array 
//		System.out.println(numeros[4]);
		
////		Scanner entrada = new Scanner(System.in);
////		
////		int [] numeros = new int [5];
////		
////		for (int i = 0; i < numeros.length; i++) {
////			System.out.println("Ingresa un numero en la posicion " + i);
////			numeros[i] = entrada.nextInt();
//		}
		// Si ya no utilizo mi scanner para introducir datos,
		// lo correcto seria cerrarlo para ahorrar recursos en memoria 
		//entrada.close();
		
//		//Vamos a imprimir un valor guardado una vez teniendo los numeros en el array
//		System.out.println("En el indice 3 se encuentra el numero "+numeros[3]);
//		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.print(numeros[i]+", ");
			
			
			//Otra manera de declarar un array 
			//Es con sus valores definidos desde un inicio 
//		int []  numeros3 = {1,2,3,4,5};	
//		
//		char [] nombre = {'A', 'l', 'e', 'x'};
		
		String [] nombres = {"Abrham", "Rafael", "Jafet", "marcos ", "Juan"};
 			
		// Otra forma de imprimir todos los valores de un array 
		// es con un ciclo for each
		
		for(String i:nombres) {
			System.out.println(i);
		}
		}
	}


