package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JABR {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números 
		//y muestre el resultado de su división. Si el segundo número 
		//es 0, debe mostrar un mensaje de error.
		
		System.out.println("=============================");
		System.out.println("========Ejercicio 3==========");
		System.out.println("=============================");
		
		Scanner entrada = new Scanner(System.in);
		double a;
		double b;
		System.out.println("Introduce un primer número para la división");
		a=entrada.nextDouble();
		System.out.println("Introduce un segundo número para la división");
		b=entrada.nextDouble();
		
		if (b==0) {
			System.out.println("Error, incia de nuevo el programa");
		}else {
			System.out.println("El resultado de la división es: " + (a/b));
		}
		
		System.out.println("=============================");
		System.out.println("=======FIN DEL PROGRAMA======");
		System.out.println("=============================");
		
		

	}

}
