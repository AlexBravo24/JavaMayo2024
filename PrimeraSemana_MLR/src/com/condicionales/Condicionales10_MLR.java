package com.condicionales;

import java.util.Scanner;

public class Condicionales10_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 10 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Realiza un programa que pida un número entero entre uno y doce e imprima");
		System.out.println("el número de días que tiene el mes correspondiente.");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		int mes;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un numero de mes: ");
		mes=entrada.nextInt();
		
		System.out.println("\nResultado:");	
		
		if (mes == 2) {
			System.out.println("El mes " + mes + " del año tiene 28 o 29 dias");
		}else if ((mes > 0 && mes <= 7 && mes%2 != 0) || (mes >= 8 && mes <= 12 && mes%2 == 0)) {
			System.out.println("El mes " + mes + " del año tiene 31 dias");
		}else if ((mes > 0 && mes <= 7 && mes%2 == 0) || (mes >= 8 && mes <= 12 && mes%2 != 0)){
			System.out.println("El mes " + mes + " del año tiene 30 dias");
		}else {
			System.out.println("Numero de mes erroneo");
		}
	
	}

}
