package com.condicionales;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que pida un número por teclado y nos indique si es par
		//o impar.
		
		Scanner entrada = new Scanner(System.in);
		
		//Solicita el numero
		System.out.println("Introduce un numero");
		int numero = entrada.nextInt();
				
		if (numero % 2 == 0) {
			System.out.println("El "+numero+" es par");
		}else {
			System.out.println("El "+numero+" es impar");
		}
		
	
		
		
		

	}

}
