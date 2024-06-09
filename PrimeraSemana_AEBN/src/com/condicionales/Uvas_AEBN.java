package com.condicionales;

import java.util.Scanner;

public class Uvas_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce el tipo de uva (A o B):");
        char tipo = input.next().charAt(0);

        System.out.println("Por favor, introduce el tama�o de la uva (1 o 2):");
        int tama�o = input.nextInt();

        System.out.println("Por favor, introduce el precio inicial:");
        double precioInicial = input.nextDouble();

        if (tipo == 'A') {
            if (tama�o == 1) {
                precioInicial += 0.20;
            } else if (tama�o == 2) {
                precioInicial += 0.30;
            }
        } else if (tipo == 'B') {
            if (tama�o == 1) {
                precioInicial -= 0.30;
            } else if (tama�o == 2) {
                precioInicial -= 0.50;
            }
        }

        System.out.println("El precio final por kilo de uva es " + precioInicial + " euros.");

	}

}
