package com.condicionales;

import java.util.Scanner;

public class Condicionales2_VIJL {

	public static void main(String[] args) {
		
		// Realiza un programa que pida un número por teclado y nos indique si es par
		// o impar.
		
		int a;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un numero:");	
		a = entrada.nextInt();	

		if(a % 2 == 0) {
			
			System.out.printf("El numero : " + a + " es par");
		}
		
		else {
			
			System.out.printf("El numero : " + a + " es impar");			
			
		}
			
	}

}
