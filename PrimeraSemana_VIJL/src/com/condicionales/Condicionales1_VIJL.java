package com.condicionales;

import java.util.Scanner;

public class Condicionales1_VIJL {

	public static void main(String[] args) {
		
		// Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.
		
		int a;
		int b;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero:");	
		a = entrada.nextInt();
		
		System.out.println("Ingresa el seguno numero:");	
		b = entrada.nextInt();

		if(a == b) {
			
			System.out.printf("Los numeros : " + a + " y " + b + " son iguales !");
		}
		
		else {
			if(a > b) {
				
				System.out.printf("El mayor es : " + a);
			}
			
			else
				System.out.printf("El mayor es : " + b);
		}
			
	}

}
