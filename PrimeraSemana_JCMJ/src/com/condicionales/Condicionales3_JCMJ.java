package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JCMJ {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n.
		//Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
	      Scanner entrada = new Scanner(System.in);

	        // Solicitar el primer n�mero
	        System.out.println("Introduce el primer n�mero:");
	        double num1 = entrada.nextDouble();

	        // Solicitar el segundo n�mero
	        System.out.println("Introduce el segundo n�mero:");
	        double num2 = entrada.nextDouble();

	        // Realizar la divisi�n si el segundo n�mero no es 0
	        if (num2 != 0) {
	            double resultado = num1 / num2;
	            System.out.println("El resultado de la divisi�n es: " + resultado);
	        } else {
	            System.out.println("Error: No se puede dividir por cero.");
	        }
	    }
	}