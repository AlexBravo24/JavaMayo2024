package com.arrays;

import java.util.Scanner;

public class Arrays1_VIJL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
//		Muestra por consola el �ndice y el valor al que corresponde.
		
		int cadena [] = new int [10];
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0 ; i <= 9 ; i ++) {
			
			System.out.println("Ingresa un n�mero");	
			cadena[i] = entrada.nextInt();

		}
		
		System.out.printf("Cadena:    [ ");
		
		for(int i = 0 ; i <= 9 ; i ++) {
			
	
			System.out.printf(cadena[i] + " ");

		}
		
		System.out.println("]");
		
		System.out.printf("Posici�n:  [ ");
		
		for(int i = 0 ; i <= 9 ; i ++) {
			
			
			System.out.printf(i + " ");

		}
		
		System.out.println("]");
		
	}

}
