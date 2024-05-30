package com.condicionales;

import java.util.Scanner;

public class Condicionales9_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 9 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día ");
		System.out.println("correspondiente. Si introducimos otro número nos da un error. ");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		int dia;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un numero de dia de la Semana: ");
		dia=entrada.nextInt();
		
		System.out.println("\nResultado:");	
		
		switch(dia) {
		case 1:
			System.out.println("El numero de dia "  + dia + " corresponde al LUNES");
			break;
		case 2:
			System.out.println("El numero de dia "  + dia + " corresponde al MARTES");
			break;
		case 3:
			System.out.println("El numero de dia "  + dia + " corresponde al MIERCOLES");
			break;
		case 4:
			System.out.println("El numero de dia "  + dia + " corresponde al JUEVES");
			break;
		case 5:
			System.out.println("El numero de dia "  + dia + " corresponde al VIERNES");
			break;
		case 6:
			System.out.println("El numero de dia "  + dia + " corresponde al SABADO");
			break;
		case 7:
			System.out.println("El numero de dia "  + dia + " corresponde al DOMINGO");
			break;
		default:
			System.out.println("Error: El numero ingresado no correspondea ningun dia de la semana");
			break;			
		}
	
	}

}
