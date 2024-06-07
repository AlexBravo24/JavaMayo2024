package com.condicionales;

import java.util.Scanner;

public class Condicionales5_JCMJ {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptaci�n de una solicitud en 
		//base a los siguientes par�metros: 
		//edad, nota y sexo.
		//M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
		
		  // Leer los par�metros desde el teclado
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota:");
        double nota = scanner.nextDouble();

        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();

        System.out.println("Introduce el sexo (M/F):");
        char sexo = scanner.next().charAt(0);

        // Convertir el sexo a may�scula para evitar problemas con min�sculas
        sexo = Character.toUpperCase(sexo);

        // Calcular la aceptaci�n de la solicitud usando if-else
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


