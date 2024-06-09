package com.condicionales;

import java.util.Scanner;

public class Uvas_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce el tipo de uva (A o B):");
        char tipo = input.next().charAt(0);

        System.out.println("Por favor, introduce el tamaño de la uva (1 o 2):");
        int tamaño = input.nextInt();

        System.out.println("Por favor, introduce el precio inicial:");
        double precioInicial = input.nextDouble();

        if (tipo == 'A') {
            if (tamaño == 1) {
                precioInicial += 0.20;
            } else if (tamaño == 2) {
                precioInicial += 0.30;
            }
        } else if (tipo == 'B') {
            if (tamaño == 1) {
                precioInicial -= 0.30;
            } else if (tamaño == 2) {
                precioInicial -= 0.50;
            }
        }

        System.out.println("El precio final por kilo de uva es " + precioInicial + " euros.");

	}

}
