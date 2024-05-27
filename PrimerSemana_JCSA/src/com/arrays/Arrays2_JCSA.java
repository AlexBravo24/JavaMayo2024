package com.arrays;

import java.util.Scanner;

public class Arrays2_JCSA {

	public static void main(String[] args) {
//		// Crea un array de números de 100 posiciones, 
//		que contendrá los números del 1 al 100. 
//		Obtén la suma de todos ellos y la media.
		
		System.out.println("********************************************************************");
		System.out.println("***Este programa realiza la suma del 1 al 100 y obtiene su media ***"); 
		System.out.println("********************************************************************\n");
		

		int [] numero = new int[100];
		for (int i = 0; i < numero.length; i++) {
			numero [i] = i+1;
			
			
	}
			//Se realiza la suma de todos los numeros 
		int suma = 0;
		for (int i = 0; i < 100; i++) {
			suma += numero[i];
			//System.out.println(suma);
		}
		
		//Se calcula la media 
		double media; 
		media = (double)suma/100;
		
		 System.out.println("La suma de los números del 1 al 100 es: " + suma);
	     System.out.println("La media de la suma es: " + media);
}
}
