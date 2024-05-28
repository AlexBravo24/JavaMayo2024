package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JCMJ {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número para la tabla de multiplicar
        System.out.print("Introduce el número para la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Solicitar al usuario que ingrese el límite de iteración
        System.out.print("Introduce el límite de iteración: ");
        int numero2 = scanner.nextInt();

        // Generar la tabla de multiplicar hasta el límite deseado
        for (int i = 1; i <= numero2; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

       
    }


}
