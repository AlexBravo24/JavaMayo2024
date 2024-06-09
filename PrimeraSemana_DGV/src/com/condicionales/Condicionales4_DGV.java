package com.condicionales;

import java.util.Scanner;

public class Condicionales4_DGV {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese texto:");
		String text = in.nextLine();
		char[] characters = text.toCharArray();
		String hasUppercase = "NO";
		for(int i = 0; i < text.length();i++) {
			if(Character.isUpperCase(characters[i])) {
				hasUppercase = "Sí";
			}
		}
		System.out.println("La cadena " + hasUppercase + " tiene mayúsculas.");
	}

}
