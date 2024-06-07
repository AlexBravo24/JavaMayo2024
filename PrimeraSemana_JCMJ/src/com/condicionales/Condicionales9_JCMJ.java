package com.condicionales;

import java.util.Scanner;

public class Condicionales9_JCMJ {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y 
		//escriba el d�a correspondiente. Si introducimos otro n�mero nos da un error.

			Scanner scanner = new Scanner(System.in);

        // Leer el d�a de la semana desde teclado
        System.out.println("Introduce el d�a de la semana (1-7):");
        int diaSemana = scanner.nextInt();

        // Determinar y mostrar el d�a correspondiente
        String diaCorrespondiente;
        if (diaSemana == 1) {
            diaCorrespondiente = "Lunes";
        } else if (diaSemana == 2) {
            diaCorrespondiente = "Martes";
        } else if (diaSemana == 3) {
            diaCorrespondiente = "Mi�rcoles";
        } else if (diaSemana == 4) {
            diaCorrespondiente = "Jueves";
        } else if (diaSemana == 5) {
            diaCorrespondiente = "Viernes";
        } else if (diaSemana == 6) {
            diaCorrespondiente = "S�bado";
        } else if (diaSemana == 7) {
            diaCorrespondiente = "Domingo";
        } else {
            diaCorrespondiente = "ERROR: n�mero incorrecto";
        }

        // Mostrar el d�a correspondiente
        System.out.println("El d�a correspondiente es: " + diaCorrespondiente);

        
    }
}