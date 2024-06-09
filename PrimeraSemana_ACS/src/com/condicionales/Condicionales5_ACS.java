package com.condicionales;

import java.util.Scanner;

public class Condicionales5_ACS {

	public static void main(String[] args) {

		/*
		 * 5. Realiza un programa que calcule la aceptación de una solicitud en base a
		 * los siguientes parámetros: edad, nota y sexo. 
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		 * Otros casos -> NO ACEPTADA
		 */

		Scanner scanner = new Scanner(System.in);
		int edad;
		int nota;
		String sexo;
		
		System.out.println("Ingrese edad: ");
		edad = scanner.nextInt();
		System.out.println("Ingrese Nota: "); 
		nota = scanner.nextInt(); scanner.nextLine();
		System.out.println("Ingrese sexo: ");
		sexo = scanner.nextLine() ;
		
		if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
	     
	    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
	      System.out.println("POSIBLE");
	    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
	       System.out.println("ACEPTADA");
	    }else {
	        System.out.println("NO ACEPTADA");
		
		

	    }
	}

}
