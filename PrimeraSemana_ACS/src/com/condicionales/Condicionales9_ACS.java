package com.condicionales;

import java.util.Scanner;

public class Condicionales9_ACS {

	public static void main(String[] args) {

		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		// día correspondiente. Si introducimos otro número nos da un error.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número del 1 al 7: ");
		int numero = scanner.nextInt();

		String dia = obtenerDia(numero);
		if (dia != null) {
			System.out.println("El día correspondiente al número " + numero + " es " + dia + ".");
		} else {
			System.out.println("Error: El número debe estar entre 1 y 7.");
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
			return "Miércoles";
		case 4:
			return "Jueves";
		case 5:
			return "Viernes";
		case 6:
			return "Sábado";
		case 7:
			return "Domingo";
		default:
			return null;
		}

	}

}
