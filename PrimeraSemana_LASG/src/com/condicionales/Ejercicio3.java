package com.condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Crea un programa que pida al usuario dos números y muestre el resultado
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error

		Scanner entrada = new Scanner(System.in);
		
		System.out.println(("Introduce el primer numero:"));
		double numero1 = entrada.nextDouble();
		
		System.out.println("Introduce el segundo numero:");
		double numero2 = entrada.nextDouble();
		
		if (numero2 == 0) {
			System.out.println("ERRO");
		}else {
			double resultado = numero1 / numero2;
			System.out.println("El resultado de la divicion es: " +resultado);
		}
					
		
		
		
		
	}

}
