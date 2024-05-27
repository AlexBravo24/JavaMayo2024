package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JABR {

	public static void main(String[] args) {
		
		//1.Realiza un programa que reciba dos números por 
		//teclado e indique cuál es mayor o si son iguales.
		System.out.println("=============================");
		System.out.println("========Ejercicio 1==========");
		System.out.println("=============================");
		Scanner entrada = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Introduce un primer número");
		a=entrada.nextInt();
		System.out.println("Introduce un segundo número");
		b=entrada.nextInt();
		
		if(a>b) {
			System.out.println("El primer número: " + a + " es mayor");
		}else if(b>a) {
			System.out.println("El segundo número: " + b + " es mayor");
		}else {
			System.out.println("Los números son iguales");
		}
		
		System.out.println("=============================");
		System.out.println("=======FIN DEL PROGRAMA======");
		System.out.println("=============================");
		
		
		

	}

}
