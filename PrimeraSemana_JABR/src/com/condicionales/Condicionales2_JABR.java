package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JABR {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un n�mero por teclado 
		//y nos indique si es par o impar.
		
		System.out.println("=============================");
		System.out.println("========Ejercicio 2==========");
		System.out.println("=============================");
		
		Scanner entrada = new Scanner(System.in);
		int a;
		System.out.println("Introduce un n�mero");
		a=entrada.nextInt();
		
		int residuo = a%2;
		
		if (a%2 == 0) {
			System.out.println("El n�mero introducido es par");
		}else {
			System.out.println("El n�mero introducido es impar");
		}
		
		System.out.println("=============================");
		System.out.println("=======FIN DEL PROGRAMA======");
		System.out.println("=============================");

		
	}

}
