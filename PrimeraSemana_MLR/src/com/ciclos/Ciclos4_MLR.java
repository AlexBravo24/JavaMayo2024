package com.ciclos;

public class Ciclos4_MLR {

	public static void main(String[] args) {

		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 4 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Simular el comportamiento de un reloj digital, imprimiendo la hora,");
		System.out.println("minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59");
		System.out.println("horas");
		System.out.println("=====================================================================================");
		System.out.println("");
	

		System.out.println("\nResultado:");

		for (int i = 0; i <= 23; i++) {
			//Incremento de Horas
			for (int j = 0; j <= 59; j++) {
				//Incremento de minutos
				for (int k = 0; k <= 59; k++) {
					//Incremeneto de segundos
				System.out.println(String.format("%02d", i) + ":" + String.format("%02d", j) + ":" + String.format("%02d", k));							
				}
			}
		}
		
	}

	
}
