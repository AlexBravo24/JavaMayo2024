package com.condiciones;

import java.util.Scanner;

public class Condicionales3_JCSA {

	public static void main(String[] args) {
		// 	3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		//	Si el segundo número es 0, debe mostrar un mensaje de error.
		
		//int numero1, numero2;
		double numero1, numero2, resultado;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("***Este programa te dira el resultado de una división***");
		System.out.println();
		System.out.println("Introduce el primer número:");
		numero1=entrada.nextDouble();
		System.out.println("Introduce el segundo número:");
		numero2=entrada.nextDouble();
		resultado = numero1/numero2;
		
		if(numero2 == 0) {
			System.out.println("Error!!!\nNo se puede dividir "+numero1+ " entre 0");
		}
		else {
			System.out.println("El resultado de dividir "+numero1+ " entre " +numero2+ " es: "+resultado);
		}
		
		entrada.close();
	}

}
