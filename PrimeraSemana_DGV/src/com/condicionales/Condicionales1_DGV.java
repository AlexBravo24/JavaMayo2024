package com.condicionales;

import java.util.Scanner;

public class Condicionales1_DGV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el primer n�mero:");
		Integer numero1 = entrada.nextInt();
		System.out.println("Ingrese el segundo n�mero:");
		Integer numero2 = entrada.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("El primer n�mero (" + numero1 + ") es el mayor");
		} else if(numero2 > numero1) {
			System.out.println("El segundo n�mero (" + numero2 + ") es el mayor");
		} else {
			System.out.println("Los n�meros son iguales");
		}
		
	}

}
