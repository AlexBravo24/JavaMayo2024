package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JCMJ {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa un numero para inidacar si es par o impar");
		numero=entrada.nextInt();
		if(numero % 2 == 0) {
		System.out.println("Es par");
		}
		else
		{
		System.out.println("Es impar");
		}
	}
}

