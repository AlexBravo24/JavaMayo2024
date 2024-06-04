package com.ciclos;

import java.util.Scanner;

public class Ciclos3_DGV {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa una palabra u oraci�n");
		String palabra = in.nextLine();
		String inversa = "";
		
		for (int i = palabra.length() - 1; i >= 0; i--) {
			inversa += palabra.charAt(i);
		}
		String resultado = (inversa.equalsIgnoreCase(palabra)) == true ? "Es un pal�ndromo" : "No es pal�ndromo";
		System.out.println(resultado);
	}

}
