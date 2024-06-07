package com.condicionales;

import java.util.Scanner;

public class DiaDeLaSemana_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce el número del día de la semana (del 1 al 7):");
        int dia = input.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El día es lunes.");
                break;
            case 2:
                System.out.println("El día es martes.");
                break;
            case 3:
                System.out.println("El día es miércoles.");
                break;
            case 4:
                System.out.println("El día es jueves.");
                break;
            case 5:
                System.out.println("El día es viernes.");
                break;
            case 6:
                System.out.println("El día es sábado.");
                break;
            case 7:
                System.out.println("El día es domingo.");
                break;
            default:
                System.out.println("ERROR: número incorrecto.");
        }
	}

}
