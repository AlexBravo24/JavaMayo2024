package com.condicionales;

import java.util.Scanner;

public class Condicionales3_VIJL {

	public static void main(String[] args) {
		
		// Crea un programa que pida al usuario dos números y muestre el resultado
		// de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		int a;
		int b;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero:");	
		a = entrada.nextInt();
		
		System.out.println("Ingresa el seguno numero:");	
		b = entrada.nextInt();

		if(b == 0) {
			
			System.out.println("Error!!! imposible dividir entre 0");
		}
		
		else {
			
			float res = (float) a/b;
			String resultado = String.format("%.3f", res);
			System.out.println("El resultado de dividir: " + a + " y " + b + " Es: ");
			System.out.println(resultado);
		}
			
	}

}
