package com.condicionales;

import java.util.Scanner;

public class Condicional5 {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 5===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
//		Realiza un programa que calcule la aceptación de una solicitud en base a 
//		los siguientes parámetros: edad, nota y sexo.  
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE  
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA  
//		* Otros casos -> NO ACEPTADA 
		
		int edad;
		char sexo;
		int nota;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Favor de escribir la edad del solicitante");
		
		edad = input.nextInt();
		
		System.out.println("Favor de escribir el sexo del solicitante (M ó F)");
		
		sexo = input.next().charAt(0);
        
		System.out.println("Favor de escribir la nota del solicitante");
		
		nota = input.nextInt();
		
		if(sexo == 'M' || sexo == 'm' ) {
			if (nota >=5 && edad == 18) {
				System.out.println("Es posible aceptar al estudiante");
			}else if (nota >10) {
				System.out.println("ERROR: Nota no valida");
			}else {
				System.out.println("Estudiante NO ACEPTADO");
			}
			return;
		}else if (sexo == 'F' || sexo == 'f' ) {
			if (nota >=5 && edad == 18) {
				System.out.println("Estudiante ACEPTADA");
			}else if (nota >10) {
				System.out.println("ERROR: Nota no valida");
			}else {
				System.out.println("Estudiante NO ACEPTADO");
			}
			return;
		}else {
			System.out.println("ERROR: Favor de colocar el sexo del estudiante M o F");
		}

	}

}
