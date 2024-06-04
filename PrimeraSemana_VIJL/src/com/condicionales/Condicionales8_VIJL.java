package com.condicionales;

import java.util.Scanner;

public class Condicionales8_VIJL {

	public static void main(String[] args) {
		
		// Realiza un programa que pida por teclado el resultado (dato entero)
		// obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		// letras (dato cadena) de la cara opuesta al resultado obtenido.

		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un día de la semana en número (1 -7 ):");	
		numero = entrada.nextInt();

			switch(numero) {
			case 1:
				System.out.println("Seis");
				break;
			case 2:
				System.out.println("Cinco");
				break;
			case 3:
				System.out.println("Cuatro");
				break;
			case 4:
				System.out.println("Tres");
				break;
			case 5:
				System.out.println("Dos");
				break;
			case 6:
				System.out.println("Uno");
				break;default:
					System.out.println("Error: Número incorrecto");	
				}
	}

}
