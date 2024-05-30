package com.condicionales;

import java.util.Scanner;

public class Condicionales3_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 3 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Crea un programa que pida al usuario dos números y muestre el resultado");
		System.out.println("de su división. Si el segundo número es 0, debe mostrar un mensaje de error. ");	
		System.out.println("=====================================================================================");
		System.out.println("");
		
		Scanner entrada = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("Introduce Numerador: ");
		a=entrada.nextInt();

		System.out.print("Introduce Denominador: ");
		b=entrada.nextInt();

		System.out.println("\nResultado:");	
		
		if (b == 0) {
			System.out.println(" El denominador no puede ser CERO");
		}else {
			System.out.println(" La division de A/B es : " + (a/b));
		}
		
	}

}