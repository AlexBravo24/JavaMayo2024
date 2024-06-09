package com.condiciones;

import java.util.Scanner;

public class Condicionales1_JCSA {

	public static void main(String[] args) {
		// 	1.Realiza un programa que reciba dos números por teclado 
		//	e indique cuál es mayor o si son iguales.
		int numero1, numero2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("***Introduce dos numeros para saber cual es mayor o si son iguales***");
		System.out.println();
		System.out.println("Introduce el primer número:");
		numero1=entrada.nextInt();
		
		System.out.println("Introduce el segundo número:");
		numero2=entrada.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("El número "+numero1+ " es mayor que el número "+numero2);
		} else if (numero1==numero2) {
			System.out.println("Son iguales los dos numeros");
		}else {
			System.out.println("El número "+numero2+ " es mayor que el número "+numero1);
		}
		
		entrada.close();
				
	}

}
