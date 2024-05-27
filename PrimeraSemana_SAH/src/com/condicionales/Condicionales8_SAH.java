package com.condicionales;

import java.util.Scanner;

public class Condicionales8_SAH {

	public static void main(String[] args) {
		// Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		//letras (dato cadena) de la cara opuesta al resultado obtenido.

		
		int x;
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el resultado al lanzar el dado (1-6): ");
        x = scanner.nextInt();

        if (x < 1 || x > 6) {
            System.out.println("ERROR: número incorrecto");
        } else {
            switch (x) {
                case 1:
                    System.out.println("La cara opuesta es 6");
                    break;
                case 2:
                    System.out.println("La cara opuesta es 5");
                    break;
                case 3:
                    System.out.println("La cara opuesta es 4");
                    break;
                case 4:
                    System.out.println("La cara opuesta es 3");
                    break;
                case 5:
                    System.out.println("La cara opuesta es 2");
                    break;
                case 6:
                    System.out.println("La cara opuesta es 1");
                    break;
            }
        }

		
	}//Main

}//Final
