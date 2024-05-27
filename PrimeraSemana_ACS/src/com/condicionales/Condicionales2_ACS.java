package com.condicionales;

import java.util.Scanner;

public class Condicionales2_ACS {

	public static void main(String[] args) {
				
		//2.Realiza un programa que pida un número por teclado y
		//nos indique si es par o impar.

//		System.out.println("===================================");
//		System.out.println("========= Ejercicio 2 =============");
//		System.out.println("===================================");
//		Scanner entrada = new Scanner(System.in);
//		
//		int a;
//		int b;
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Ingrese el numero a evaluar");
		n = teclado.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n+" Es un numero par ");
		}else {
			System.out.println(n+" Es un numero impar ");
		}


		
	}

}
