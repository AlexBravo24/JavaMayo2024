package com.condicionales;

import java.util.Scanner;

public class Division_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce el primer número:");
        double numero1 = input.nextDouble();

        System.out.println("Por favor, introduce el segundo número:");
        double numero2 = input.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es " + resultado + ".");
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
	}

}
