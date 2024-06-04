package com.ciclos;

import java.util.Scanner;

public class Ciclos2_YTA {

	public static void main(String[] args) {
		// // Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 

int numero;
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número a multiplicar: ");
        numero = scanner.nextInt();

        System.out.print("Escribe el numero limite hasta el cual quieres ver la tabla de multiplicar: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("\nTabla de multiplicar del " + numero + " hasta el " + limiteSuperior);
        for (int i = 1; i <= limiteSuperior; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
	
	}

}

}