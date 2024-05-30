package com.condicionales;

import java.util.Scanner;

public class Condicionales5_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 5 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Realiza un programa que calcule la aceptación de una solicitud en base a");
		System.out.println("los siguientes parámetros: edad, nota y sexo.");	
		System.out.println("");
		System.out.println("  * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE ");
		System.out.println("  * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA");
		System.out.println("  * Otros casos -> NO ACEPTADA ");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		Scanner entrada = new Scanner(System.in);
		int nota;
		int edad;
		String sexo; 
		
		// Validacion de nota
		do {
			System.out.print("Introduce Nota (0-10): ");
			nota=entrada.nextInt();			
		} while (nota > 10);
		
		// Validacion de edad
		do {
			System.out.print("Introduce Edad (0-100): ");
			edad=entrada.nextInt();	
		} while (edad > 100);
		
		// Validacion de datos M/F
		do {
			System.out.print("Introduce Sexo (M/F): ");
			sexo=entrada.next();
			sexo=sexo.toUpperCase();
		} while ((sexo.equals("M") == false) && (sexo.equals("F") == false));
			
		System.out.println("\nResultado:");	
		
		if (nota >= 5 && edad >= 18 && sexo.equals("F")) {
			System.out.println("✅ SOLICITUD ACEPTADA");
		}else if (nota >= 5 && edad >= 18 && sexo.equals("M")) {
			System.out.println("⚠️ POSIBLE ACEPTACION");
		}else {
			System.out.println("🚫 NO ACEPTADA");
		}

		System.out.println("Nota (" + nota + "), Edad (" + edad + "), Sexo " + sexo);	
	}

}
