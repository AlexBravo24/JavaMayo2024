package com.condicionales;

import java.util.Scanner;

public class Condicionales1_VBM {

	public static void main(String[] args) {
		
		// Realiza un programa que reciba dos numeros por
		//teclado e indique cual es mayor o si son iguales
		System.out.println("====================");
		System.out.println("====Ejercicio 1=====");
		System.out.println("====================");
		Scanner entrada = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Introduce el primer numero");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		b=entrada.nextInt();
		
		if (a > b) {
			System.out.println("El primer numero es mayor que el segundo numero");
		}else if (a < b) {
			System.out.println( "El segundo numero es mayor que el primer numero");
		}else {
		System.out.println("Ambos numeros son iguales" + a);
		}
		System.out.println("=============================");
		System.out.println("========FIN DEL PROGRAMA=====");
		System.out.println("=============================");
		
		
	
	}//cierre del main
		
		
}//cierre de clase		
