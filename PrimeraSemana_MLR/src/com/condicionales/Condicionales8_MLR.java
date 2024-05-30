package com.condicionales;

import java.util.Scanner;

public class Condicionales8_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 8 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Realiza un programa que pida por teclado el resultado (dato entero) ");
		System.out.println("obtenido al lanzar un dado de seis caras y muestre por pantalla el número en ");
		System.out.println("letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las ");
		System.out.println("caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. ");
		System.out.println("Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se ");
		System.out.println("mostrará el mensaje: “ERROR: número incorrecto”. ");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		int cara;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce el resultado del DADO: ");
		cara=entrada.nextInt();
		
		System.out.println("\nResultado:");	
		
		switch(cara) {
		case 1:
			System.out.println("Resultado del DADO: "  + cara + " - Cara Opuesta -> SEIS");
			break;
		case 2:
			System.out.println("Resultado del DADO: "  + cara + " - Cara Opuesta -> CINCO");
			break;
		case 3:
			System.out.println("Resultado del DADO: "  + cara + " - Cara Opuesta -> CUATRO");
			break;
		case 4:
			System.out.println("Resultado del DADO: "  + cara + " - Cara Opuesta -> TRES");
			break;
		case 5:
			System.out.println("Resultado del DADO: "  + cara + " - Cara Opuesta -> DOS");
			break;
		case 6:
			System.out.println("Resultado del DADO: "  + cara + " - Cara Opuesta -> UNO");
			break;
		default:
			System.out.println("Error: Cara de DADO no valida");
			break;			
		}
	
	}

}
