package com.condicionales;

import java.util.Scanner;

public class Condicional8 {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 8===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
//		 Realiza un programa que pida por teclado el resultado (dato entero) 
//		 obtenido al lanzar un dado de seis caras y muestre por pantalla el número en 
//		 letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
//		 caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
//		 Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
//		 mostrará el mensaje: “ERROR: número incorrecto”. 
		int a;
		
        Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce el resultado de tu dado: ");
		a = input.nextInt();
		
		if (a<1 || a>6) {
			System.out.println("ERROR: número incorrecto");
		}else if (a==1) {
			System.out.println("El valor de la cara opuesta es seis");
		}else if (a==6) {
			System.out.println("El valor de la cara opuesta es uno");
		}else if (a==2) {
			System.out.println("El valor de la cara opuesta es cinco");
		}else if (a==5) {
			System.out.println("El valor de la cara opuesta es dos");
		}else if (a==3) {
			System.out.println("El valor de la cara opuesta es cuatro");
		}else if (a==4) {
			System.out.println("El valor de la cara opuesta es tres");
	}
	}
}
