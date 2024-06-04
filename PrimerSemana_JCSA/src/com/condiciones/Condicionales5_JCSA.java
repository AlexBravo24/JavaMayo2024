package com.condiciones;

import java.util.Scanner;

public class Condicionales5_JCSA {

	public static void main(String[] args) {
//		// 5. Realiza un programa que calcule la aceptación de una solicitud en
//		base a los siguientes parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		int edad, nota;
		char sexo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("***Este programa determinara la aceptacion de una solicitud ***");
		System.out.println("***En base a los siguientes parámetros: edad, nota y sexo***");
		System.out.println();
		System.out.println("Ingrese la edad:");
		edad = entrada.nextInt();
		System.out.println("Ingrese la nota:");
		nota = entrada.nextInt();
		System.out.println("Ingrese la nota (Femenino 'F' o Masculino 'M'):");
		sexo = entrada.next().toUpperCase().charAt(0);
		
		if(edad>= 18 && nota>5 && sexo == 'M') {	
			System.out.println("POSIBLE");
		}else if (edad>= 18 && nota>5 && sexo == 'F') {
			System.out.println("ACEPTADA");
		}else {
				System.out.println("NO ACEPTADA");
			} 
				entrada.close();
		}
	
		

	}


