package com.condiciones;

import java.util.Scanner;

public class Condicionales1_JCSA {

	public static void main(String[] args) {
		// 	1.Realiza un programa que reciba dos n�meros por teclado 
		//	e indique cu�l es mayor o si son iguales.
		int numero1, numero2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("***Introduce dos numeros para saber cual es mayor o si son iguales***");
		System.out.println();
		System.out.println("Introduce el primer n�mero:");
		numero1=entrada.nextInt();
		
		System.out.println("Introduce el segundo n�mero:");
		numero2=entrada.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("El n�mero "+numero1+ " es mayor que el n�mero "+numero2);
		} else if (numero1==numero2) {
			System.out.println("Son iguales los dos numeros");
		}else {
			System.out.println("El n�mero "+numero2+ " es mayor que el n�mero "+numero1);
		}
		
		entrada.close();
				
	}

}
