package com.condiciones;

import java.util.Scanner;

public class Condicionales9_JCSA {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. 
		// Si introducimos otro n�mero nos da un error.
		
		int dia;
		Scanner entrada = new Scanner(System.in);
		System.out.println("***Este programa te pediara el d�a de la semana (1 al 7) y te dara el d�a correspondienete***");
		System.out.println();
		System.out.println("Ingrese un n�mero del dia de la semana");
		dia = entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("El dia es Lunes");
			break;
		case 2:
			System.out.println("El dia es Martes");
			break;
		case 3:
			System.out.println("El dia es Miercoles");
			break;
		case 4:
			System.out.println("El dia es Jueves");
			break;
		case 5:
			System.out.println("El dia es Viernes");
			break;
		case 6:
			System.out.println("El dia es Sabado");
			break;
		case 7:
			System.out.println("El dia es Domingo");
			break;

		default:
			System.out.println("Error!!!\nEse dia de la semana no existe");
			break;
		}
		
		entrada.close();

	}

}
