package com.condicionales;

import java.util.Scanner;

public class Condicionales1_DGV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el primer número:");
		Integer numero1 = entrada.nextInt();
		System.out.println("Ingrese el segundo número:");
		Integer numero2 = entrada.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("El primer número (" + numero1 + ") es el mayor");
		} else if(numero2 > numero1) {
			System.out.println("El segundo número (" + numero2 + ") es el mayor");
		} else {
			System.out.println("Los números son iguales");
		}
		
	}

}
