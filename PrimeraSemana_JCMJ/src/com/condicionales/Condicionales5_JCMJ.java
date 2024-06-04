package com.condicionales;

import java.util.Scanner;

public class Condicionales5_JCMJ {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud en 
		//base a los siguientes parámetros: 
		//edad, nota y sexo.
		//Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
		
		  // Leer los parámetros desde el teclado
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota:");
        double nota = scanner.nextDouble();

        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();

        System.out.println("Introduce el sexo (M/F):");
        char sexo = scanner.next().charAt(0);

        // Convertir el sexo a mayúscula para evitar problemas con minúsculas
        sexo = Character.toUpperCase(sexo);

        // Calcular la aceptación de la solicitud usando if-else
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }

           }


	}


