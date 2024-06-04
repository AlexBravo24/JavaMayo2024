package com.ciclos;

import java.util.Scanner;

public class Ciclos2_MLR {

	public static void main(String[] args) {

		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 2 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Programa un algoritmo que realice la tabla de multiplicar del 12");
		System.out.println("=====================================================================================");
		System.out.println("");
	
		int num1;
		int num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la tabla a Multiplicar: ");
		num1 = entrada.nextInt();
		System.out.print("Introduce numero de Multiplos: ");
		num2 = entrada.nextInt();
		
		System.out.println("\nResultado:");
		//Inicio de tabla
		System.out.println("");
		System.out.println("Tabla del " + num1 + "\n============");

		for (int i = 1; i <= num2; i++) {
			//Se hace la multiplicacion y se imprime
			System.out.println(num1 + " x " + i + " = " + (num1 * i));		
		}
		
	}

}
