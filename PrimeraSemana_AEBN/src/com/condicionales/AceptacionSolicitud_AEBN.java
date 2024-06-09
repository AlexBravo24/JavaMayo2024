package com.condicionales;

import java.util.Scanner;

public class AceptacionSolicitud_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce tu edad:");
        int edad = input.nextInt();

        System.out.println("Por favor, introduce tu nota:");
        double nota = input.nextDouble();

        System.out.println("Por favor, introduce tu sexo (M para masculino, F para femenino):");
        char sexo = input.next().charAt(0);

        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }

	}

}
