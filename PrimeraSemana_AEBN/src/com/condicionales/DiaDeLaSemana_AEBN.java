package com.condicionales;

import java.util.Scanner;

public class DiaDeLaSemana_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce el n�mero del d�a de la semana (del 1 al 7):");
        int dia = input.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El d�a es lunes.");
                break;
            case 2:
                System.out.println("El d�a es martes.");
                break;
            case 3:
                System.out.println("El d�a es mi�rcoles.");
                break;
            case 4:
                System.out.println("El d�a es jueves.");
                break;
            case 5:
                System.out.println("El d�a es viernes.");
                break;
            case 6:
                System.out.println("El d�a es s�bado.");
                break;
            case 7:
                System.out.println("El d�a es domingo.");
                break;
            default:
                System.out.println("ERROR: n�mero incorrecto.");
        }
	}

}
