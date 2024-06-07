package com.condicionales;

import java.util.Scanner;

public class Condicionales8_DGV {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la cara del dado: ");
		int cara = in.nextInt();
		
		switch (cara) {
		case 1:
			System.out.println("SEIS");
			break;
		case 2:
			System.out.println("CINCO");
			break;
			
		case 3:
			System.out.println("CUATRO");
			break;
		
		case 4:
			System.out.println("TRES");
			break;

		case 5:
			System.out.println("DOS");
			break;
			
		case 6:
			System.out.println("UNO");
			break;
			
		default:
			System.out.println("ERROR: número incorrecto");
			break;
		}
	}

}
