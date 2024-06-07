package com.condicionales;

import java.util.Scanner;

public class ParInpar_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        System.out.println("Por favor, introduce un número:");
	        int numero = input.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println("El número es par.");
	        } else {
	            System.out.println("El número es impar.");
	        }
	}

}
