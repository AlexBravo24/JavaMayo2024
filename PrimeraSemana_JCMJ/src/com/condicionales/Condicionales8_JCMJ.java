package com.condicionales;

import java.util.Scanner;

public class Condicionales8_JCMJ {

	public static void main(String[] args) {
		// Realiza un programa que pida por teclado el resultado (dato entero) 
		//obtenido al lanzar un dado de seis caras y 
		//muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
		//Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. Nota 2:
		//Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR:
		//número incorrecto”.

		Scanner scanner = new Scanner(System.in);

        // Leer el resultado del dado desde teclado
        System.out.println("Introduce el resultado del dado (1-6):");
        int resultadoDado = scanner.nextInt();

        // Determinar la cara opuesta al resultado del dado
        String caraOpuesta;
        if (resultadoDado == 1) {
            caraOpuesta = "Seis";
        } else if (resultadoDado == 2) {
            caraOpuesta = "Cinco";
        } else if (resultadoDado == 3) {
            caraOpuesta = "Cuatro";
        } else if (resultadoDado == 4) {
            caraOpuesta = "Tres";
        } else if (resultadoDado == 5) {
            caraOpuesta = "Dos";
        } else if (resultadoDado == 6) {
            caraOpuesta = "Uno";
        } else {
            caraOpuesta = "ERROR: número incorrecto";
        }

        // Mostrar la cara opuesta al resultado del dado
        System.out.println("La cara opuesta es: " + caraOpuesta);

        // Cerrar el escáner
        scanner.close();
    }
}