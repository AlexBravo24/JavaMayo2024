package com.ciclos;

public class Ciclos1_MLR {

	public static void main(String[] args) {

		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 1 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Programa un algoritmo que realice la tabla de multiplicar del 12");
		System.out.println("=====================================================================================");
		System.out.println("");
	

		System.out.println("\nResultado:");

		for (int i = 1; i <= 12; i++) {
			//Inicio de tabla
			System.out.println("\n");
			System.out.println("Tabla del " + i + "\n============");
			for (int j = 1; j <= 10; j++) {
				//Se hace la multiplicacion y se imprime
				System.out.println(i + " x " + j + " = " + (i * j));		
			}
		}
		
	}

}
