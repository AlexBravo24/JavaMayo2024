package com.ciclos;

import java.util.Scanner;

public class Ciclos2_ACS {

	public static void main(String[] args) {

		// Programa un algoritmo que realice la tabla de multiplicar de un numero
		// introducido desde teclado, hasta la iteración deseada por el usuario.
		// Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

		Scanner scanner = new Scanner(System.in);

		int num1;
		int num2;
		int resultado;

		System.out.println("ingrese su primer numero");
		num1 = scanner.nextInt();
		System.out.println("ingrese su segundo numero");
		num2 = scanner.nextInt();

		resultado = num1 * num2;
		System.out.println("La multiplicacion es: " + num1 + " * " + num2 + " = " + resultado);

		System.out.println("Gracias");

	}

}
