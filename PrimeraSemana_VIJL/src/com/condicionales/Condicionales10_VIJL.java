package com.condicionales;

import java.util.Scanner;

public class Condicionales10_VIJL {

	public static void main(String[] args) {
		
		//.Realiza un programa que pida un número entero entre uno y doce e imprima
		// el número de días que tiene el mes correspondiente.
		
		int numero;
		int nota;
		char sexo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un número entre (1 - 12):");	
		numero = entrada.nextInt();
		
			switch(numero) {
			case 1:
				System.out.println("Enero tiene 31 días");
				break;
			case 2:
				System.out.println("Febrero puede tener 28 o 29 días");
				break;
			case 3:
				System.out.println("Marzo tiene 31 días");
				break;
			case 4:
				System.out.println("Abril tiene 30 días");
				break;
			case 5:
				System.out.println("Mayo tiene 31 días");
				break;
			case 6:
				System.out.println("Junio tiene 30 días");
				break;
			case 7:
				System.out.println("Julio tiene 31 días");
				break;
			case 8:
				System.out.println("Agosto tiene 31 días");
				break;
			case 9:
				System.out.println("Septiembre tiene 30 días");
				break;
			case 10:
				System.out.println("Octubre tiene 31 días");
				break;
			case 11:
				System.out.println("Noviembre tiene 30 días");
				break;
			case 12:
				System.out.println("Diciembre tiene 31 días");
				break;
			default:
				System.out.println("Error !!!");	
			}
	}

}
