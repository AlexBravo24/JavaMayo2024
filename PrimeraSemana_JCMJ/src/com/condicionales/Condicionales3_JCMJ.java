package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JCMJ {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división.
		//Si el segundo número es 0, debe mostrar un mensaje de error.
		
	      Scanner entrada = new Scanner(System.in);

	        // Solicitar el primer número
	        System.out.println("Introduce el primer número:");
	        double num1 = entrada.nextDouble();

	        // Solicitar el segundo número
	        System.out.println("Introduce el segundo número:");
	        double num2 = entrada.nextDouble();

	        // Realizar la división si el segundo número no es 0
	        if (num2 != 0) {
	            double resultado = num1 / num2;
	            System.out.println("El resultado de la división es: " + resultado);
	        } else {
	            System.out.println("Error: No se puede dividir por cero.");
	        }
	    }
	}