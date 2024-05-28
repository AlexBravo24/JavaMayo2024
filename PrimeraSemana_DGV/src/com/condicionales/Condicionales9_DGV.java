package com.condicionales;

import java.util.Scanner;

public class Condicionales9_DGV {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la cara del dado: ");
		int dia = in.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
			
		case 3:
			System.out.println("MIÉRCOLES");
			break;
		
		case 4:
			System.out.println("JUEVES");
			break;

		case 5:
			System.out.println("VIERNES");
			break;
			
		case 6:
			System.out.println("SABADO");
			break;
			
		case 7:
			System.out.println("DOMINGO");
			break;
			
		default:
			System.out.println("ERROR: Opción inválida");
			break;
		}
	}

}
