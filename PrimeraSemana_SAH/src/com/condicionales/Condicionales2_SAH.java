package com.condicionales;

import java.util.Scanner;

public class Condicionales2_SAH {

	public static void main(String[] args) {
		//Realiza un programa que pida un número por teclado 
		//y nos indique si es par o impar.

		int numero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero");
		numero=entrada.nextInt();
		
		if (numero %2==0) {
			System.out.println("El numero(" + numero +")es par");
		}else {
			System.out.println("El numero(" + numero +")es impar");
		}
	}//Main

}//Final
