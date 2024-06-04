package com.condicionales;

import java.util.Scanner;

public class Condicionales3_VBM {

	public static void main(String[] args) {
		
		//Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error. 
		System.out.println("==============================");
		System.out.println("========Ejercicio 3===========");
		System.out.println("==============================");
		Scanner entrada = new Scanner(System.in);
		int numerador;
		int denominador;
		
		System.out.println("Introduce el primer numero");
		numerador=entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		denominador=entrada.nextInt();
		
		if (denominador != 0) {
			System.out.println((double) numerador / (double) denominador);
		}else {
			System.out.println("El segundo numero introducido es O." + "Error");	
		}
		System.out.println("==============================");
		System.out.println("=======Fin del programa=======");
		System.out.println("==============================");	

	}

}
