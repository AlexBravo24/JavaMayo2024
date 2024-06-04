package com.condicionales;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 2===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		//Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar.
	
		//PRIMERA FORMA
		int a;

		Scanner input = new Scanner (System.in);
		
		System.out.println("Favor de teclear un número");
		a = input.nextInt();
		
		// Al usar % se obtiene el residuo de la división al dividirlo entre 2
		if (a % 2 == 0) { // si divides a entre dos y el residuo es 0, estamos frente a un numero par
			System.out.println("El número es par");
		}else {
			System.out.println("El numero es impar");
		}
		
	}

}
