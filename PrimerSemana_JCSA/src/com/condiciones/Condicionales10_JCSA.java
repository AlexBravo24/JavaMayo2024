package com.condiciones;

import java.util.Scanner;

public class Condicionales10_JCSA {

	public static void main(String[] args) {
		// 	10.Realiza un programa que pida un número entero entre uno y 
		//	doce e imprima el número de días que tiene el mes correspondiente.
		
		int dia;
		Scanner entrada = new Scanner(System.in);
		System.out.println("***Este programa te pediara un numero entre 1 y 12 y determinara el numero de dias que tiene el mes correspondiente***");
		System.out.println();
		System.out.println("Ingrese un número del mes del año");
		dia = entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Este es el mes de Enero y tiene 31 dias");
			break;
		case 2:
			System.out.println("Este es el mes de Febrero y tiene 29 dias");
			break;
		case 3:
			System.out.println("Este es el mes de Marzo y tiene 31 dias");
			break;
		case 4:
			System.out.println("Este es el mes de Abril y tiene 30 dias");
			break;
		case 5:
			System.out.println("Este es el mes de Mayo y tiene 31 dias");
			break;
		case 6:
			System.out.println("Este es el mes de Junio y tiene 30 dias");
			break;
		case 7:
			System.out.println("Este es el mes de Julio y tiene 31 dias");
			break;
		case 8:
			System.out.println("Este es el mes de Agosto y tiene 31 dias");
			break;
		case 9:
			System.out.println("Este es el mes de Septiembre y tiene 30 dias");
			break;
		case 10:
			System.out.println("Este es el mes de Octubre y tiene 31 dias");
			break;
		case 11:
			System.out.println("Este es el mes de Noviembre y tiene 30 dias");
			break;
		case 12:
			System.out.println("Este es el mes de Diciembre y tiene 31 dias");
			break;

		default:
			System.out.println("Error!!!\nEse mes del año no existe");
			break;
		}
		
		entrada.close();

	}

}
