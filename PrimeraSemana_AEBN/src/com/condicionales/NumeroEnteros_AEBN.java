package com.condicionales;

import java.util.Scanner;

public class NumeroEnteros_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce un número entero entre uno y doce:");
        int mes = input.nextInt();

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 días.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes tiene 30 días.");
                break;
            case 2:
                System.out.println("El mes tiene 28 días en un año normal y 29 días en un año bisiesto.");
                break;
            default:
                System.out.println("ERROR: número incorrecto.");
        }
	}

}
