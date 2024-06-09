package com.condicionales;

import java.util.Scanner;

public class Condicionales9_JCMJ {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y 
		//escriba el día correspondiente. Si introducimos otro número nos da un error.

			Scanner scanner = new Scanner(System.in);

        // Leer el día de la semana desde teclado
        System.out.println("Introduce el día de la semana (1-7):");
        int diaSemana = scanner.nextInt();

        // Determinar y mostrar el día correspondiente
        String diaCorrespondiente;
        if (diaSemana == 1) {
            diaCorrespondiente = "Lunes";
        } else if (diaSemana == 2) {
            diaCorrespondiente = "Martes";
        } else if (diaSemana == 3) {
            diaCorrespondiente = "Miércoles";
        } else if (diaSemana == 4) {
            diaCorrespondiente = "Jueves";
        } else if (diaSemana == 5) {
            diaCorrespondiente = "Viernes";
        } else if (diaSemana == 6) {
            diaCorrespondiente = "Sábado";
        } else if (diaSemana == 7) {
            diaCorrespondiente = "Domingo";
        } else {
            diaCorrespondiente = "ERROR: número incorrecto";
        }

        // Mostrar el día correspondiente
        System.out.println("El día correspondiente es: " + diaCorrespondiente);

        
    }
}