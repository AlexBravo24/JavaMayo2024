package com.condicionales;

import java.util.Scanner;

public class Condicionales1_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 1 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Realiza un programa que reciba dos números por teclado ");
		System.out.println("e indique cuál es mayor o si son iguales. ");	
		System.out.println("=====================================================================================");
		System.out.println("");
		
		Scanner entrada = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("Introduce Numero A: ");
		a=entrada.nextInt();

		System.out.print("Introduce Numero B: ");
		b=entrada.nextInt();

		System.out.println("\nResultado:");	
		
		if (a == b) {
			System.out.println(a + " Es Igual a " + b);
		}else if (a > b) {
			System.out.println(a + " Es Mayor a " + b);
		}else {
			System.out.println(a + " Es Menor a " + b);
		}
		
	}

}
