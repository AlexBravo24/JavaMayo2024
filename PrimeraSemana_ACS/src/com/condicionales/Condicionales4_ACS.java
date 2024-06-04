package com.condicionales;

import java.util.Scanner;

public class Condicionales4_ACS {

	public static void main(String[] args) {

		// 4.Realiza un programa que lea una cadena por teclado y compruebe si
		// contiene letras mayúsculas

		Scanner entrada = new Scanner(System.in);
		String cadena;

		System.out.print("Introduce la cadena: ");
		cadena = entrada.nextLine();

		String minusculas = cadena.toLowerCase();

		if (cadena.equals(minusculas)) {
			System.out.println("La cadena solo contiene minusculas.");

		} else {
			System.out.println("La cadena contiene letra MAYUSCULAS.");

		}
	}

}
