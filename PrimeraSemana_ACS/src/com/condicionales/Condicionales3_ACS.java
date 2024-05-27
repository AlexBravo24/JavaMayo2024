package com.condicionales;

import java.util.Scanner;

public class Condicionales3_ACS {

	public static void main(String[] args) {

		
		//3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error

		Scanner scanner = new Scanner(System.in);
		int numerador;
		int denominador;
		// Solicitud de datos al usuario
		System.out.println("Tiene que introducir dos numeros para hcaer su division:");
		System.out.print("Introduce el primer número: ");
		numerador = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		denominador = scanner.nextInt();

		// Realizamos Cálculos y mostramos en pantalla
		if (denominador != 0) {
			System.out.println((double) numerador / (double) denominador);
		} else {
			System.out.println(
					"El segundo número introducido es 0. " + "Reinicie el programa e introduzca un valor válido.");

		}

	}

}
