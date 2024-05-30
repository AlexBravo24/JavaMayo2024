package com.condicionales;

import java.util.Scanner;

public class Condicionales2_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 2 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Realiza un programa que pida un número por teclado y nos indique si es par o impar.");
		System.out.println("=====================================================================================");
		System.out.println("");	
		
		Scanner entrada = new Scanner(System.in);
		int a;
		
		System.out.print("Introduce un numero: ");
		a=entrada.nextInt();

		System.out.println("\nResultado:");	
		
		if ((a % 2) == 0) {
			System.out.println(a + " Es un numero PAR");
		}else {
			System.out.println(a + " Es un numero IMPAR");
		}
		
	}

}
