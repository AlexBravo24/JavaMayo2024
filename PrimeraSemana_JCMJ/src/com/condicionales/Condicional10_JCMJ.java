package com.condicionales;

import java.util.Scanner;

public class Condicional10_JCMJ {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero entero entre uno y doce e imprima 
		//el n�mero de d�as que tiene el mes correspondiente.
		
		Scanner scanner = new Scanner(System.in);

        // Leer el n�mero de mes desde teclado
        System.out.println("Introduce un n�mero de mes (1-12):");
        int numeroMes = scanner.nextInt();

        // Determinar el n�mero de d�as del mes correspondiente
        int diasMes;
        if (numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes == 7 || numeroMes == 8 || numeroMes == 10 || numeroMes == 12) {
            diasMes = 31;
        } else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
            diasMes = 30;
        } else if (numeroMes == 2) {
            diasMes = 28; // Considerando un a�o no bisiesto
        } else {
            System.out.println("ERROR: N�mero de mes incorrecto.");
            return; // Salir del programa si el n�mero de mes no est� en el rango v�lido
        }

        // Mostrar el n�mero de d�as del mes correspondiente
        System.out.println("El mes " + numeroMes + " tiene " + diasMes + " d�as.");

       
    }

		

	}
