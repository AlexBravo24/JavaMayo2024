package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JABR {

	public static void main(String[] args) {
		
		//1.Realiza un programa que reciba dos n�meros por 
		//teclado e indique cu�l es mayor o si son iguales.
		System.out.println("=============================");
		System.out.println("========Ejercicio 1==========");
		System.out.println("=============================");
		Scanner entrada = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Introduce un primer n�mero");
		a=entrada.nextInt();
		System.out.println("Introduce un segundo n�mero");
		b=entrada.nextInt();
		
		if(a>b) {
			System.out.println("El primer n�mero: " + a + " es mayor");
		}else if(b>a) {
			System.out.println("El segundo n�mero: " + b + " es mayor");
		}else {
			System.out.println("Los n�meros son iguales");
		}
		
		System.out.println("=============================");
		System.out.println("=======FIN DEL PROGRAMA======");
		System.out.println("=============================");
		
		
		

	}

}
