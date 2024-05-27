package com.condicionales;

import java.util.Scanner;

public class Condicionales9_SAH {

	public static void main(String[] args) {
		// Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a
		//correspondiente. Si introducimos otro n�mero nos da un error

		int numeroDia;
		String diaSemana;
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el n�mero del d�a de la semana (1-7): ");
        numeroDia = scanner.nextInt();
        

        if (numeroDia < 1 || numeroDia > 7) {
            System.out.println("ERROR: N�mero incorrecto");
        } else {
            
            switch (numeroDia) {
                case 1:
                    diaSemana = "Lunes";
                    break;
                case 2:
                    diaSemana = "Martes";
                    break;
                case 3:
                    diaSemana = "Mi�rcoles";
                    break;
                case 4:
                    diaSemana = "Jueves";
                    break;
                case 5:
                    diaSemana = "Viernes";
                    break;
                case 6:
                    diaSemana = "S�bado";
                    break;
                case 7:
                    diaSemana = "Domingo";
                    break;
                default:
                    diaSemana = "";
            }
            System.out.println(diaSemana);
        }

		
		
	}

}
