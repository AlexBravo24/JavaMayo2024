package com.condicionales;

import java.util.Scanner;

public class Condicionales9_ACS {

	public static void main(String[] args) {

		// 9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el
		// d�a correspondiente. Si introducimos otro n�mero nos da un error.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un n�mero del 1 al 7: ");
		int numero = scanner.nextInt();

		String dia = obtenerDia(numero);
		if (dia != null) {
			System.out.println("El d�a correspondiente al n�mero " + numero + " es " + dia + ".");
		} else {
			System.out.println("Error: El n�mero debe estar entre 1 y 7.");
		}

		scanner.close();
	}

	public static String obtenerDia(int numero) {
		switch (numero) {
		case 1:
			return "Lunes";
		case 2:
			return "Martes";
		case 3:
			return "Mi�rcoles";
		case 4:
			return "Jueves";
		case 5:
			return "Viernes";
		case 6:
			return "S�bado";
		case 7:
			return "Domingo";
		default:
			return null;
		}

	}

}
