package com.condicionales;

import java.util.Scanner;

public class Condicionales_AEBN {
	public static void main(String[] args) { 
	Scanner input = new Scanner(System.in);

	System.out.println("Introdusca el primer número");
	int A = input.nextInt();
	System.out.println("Introdusca el segundon numero");
	 int B = input.nextInt();
	 if (A > B) {
		 System.out.println("El primer número (" + A + ") es mayor que el segundo número (" + B + ").");
	 }else if (A < B) {
		 System.out.println("El segundo número(" + B + ") es mayor que el primer numero(" + A +").");
	 }else {
		 System.out.println("ambos numeros son iguales");
	 }
	}
}