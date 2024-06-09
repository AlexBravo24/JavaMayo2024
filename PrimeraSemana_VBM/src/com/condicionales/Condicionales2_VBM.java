package com.condicionales;

import java.util.Scanner;

public class Condicionales2_VBM {

	public static void main(String[] args) {
		
		
		//Realiza un programa que pida un número por teclado y 
		//nos indique si es par o impar.
		
		System.out.println("==============================");
		System.out.println("==========Ejercicio 2=========");
		System.out.println("==============================");
		
		Scanner entrada = new Scanner(System.in);
		int a;
		System.out.println("Introduce un numero");
		a=entrada.nextInt();
		
		if (a%2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		System.out.println("==================================");
		System.out.println("========FIN DEL PROGRAMA==========");
		System.out.println("==================================");
		
	}

}
