package com.condicionales;

import java.util.Scanner;

public class Condicionales2_DGV {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un primer número");
		int numero1 = entrada.nextInt();

		
		double cociente = numero1 % 2;
		if(cociente == 0.0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}

}
