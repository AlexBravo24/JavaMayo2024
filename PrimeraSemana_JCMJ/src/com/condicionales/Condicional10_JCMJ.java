package com.condicionales;

import java.util.Scanner;

public class Condicional10_JCMJ {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno y doce e imprima 
		//el número de días que tiene el mes correspondiente.
		
		Scanner scanner = new Scanner(System.in);

        // Leer el número de mes desde teclado
        System.out.println("Introduce un número de mes (1-12):");
        int numeroMes = scanner.nextInt();

        // Determinar el número de días del mes correspondiente
        int diasMes;
        if (numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes == 7 || numeroMes == 8 || numeroMes == 10 || numeroMes == 12) {
            diasMes = 31;
        } else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
            diasMes = 30;
        } else if (numeroMes == 2) {
            diasMes = 28; // Considerando un año no bisiesto
        } else {
            System.out.println("ERROR: Número de mes incorrecto.");
            return; // Salir del programa si el número de mes no está en el rango válido
        }

        // Mostrar el número de días del mes correspondiente
        System.out.println("El mes " + numeroMes + " tiene " + diasMes + " días.");

       
    }

		

	}
