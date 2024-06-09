package com.condiciones;

import java.util.Scanner;

public class Condicionales2_JCSA {

	public static void main(String[] args) {
		// 	2.Realiza un programa que pida un número por teclado 
		//	y nos indique si es par o impar.
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("***Este programa te indicara si un número es par o inpar***");
		System.out.println();
		System.out.println("Introduce un número:");
		numero=entrada.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("El número "+numero+" es par");
		}else {
			System.out.println("El número "+numero+" es inpar");
		}
		
		entrada.close();
		
	}

}
