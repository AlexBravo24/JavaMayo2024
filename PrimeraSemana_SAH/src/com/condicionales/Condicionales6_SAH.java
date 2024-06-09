package com.condicionales;

import java.util.Scanner;

public class Condicionales6_SAH {

	public static void main(String[] args) {
		// La asociación de vinicultores tiene como política fijar un precio inicial al kilo
		//de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2)

		int tamañoUva;
		double precioInicial;
		char tipoUva;
		
		Scanner scanner = new Scanner(System.in);

        	System.out.print("Ingrese el precio inicial por kilo de uva: ");
        	precioInicial = scanner.nextDouble();

        	System.out.print("Seleccione el tipo de uva (A/B): ");
        	tipoUva = scanner.next().charAt(0);

        	System.out.print("Seleccione el tamaño de la uva (1/2): ");
        	tamañoUva = scanner.nextInt();

        double ajustePrecio = 0;

        if (tipoUva == 'A') {
            if (tamañoUva == 1) {
                ajustePrecio += 0.20;
            } else if (tamañoUva == 2) {
                ajustePrecio += 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tamañoUva == 1) {
                ajustePrecio -= 0.30;
            } else if (tamañoUva == 2) {
                ajustePrecio -= 0.50;
            }
        }

        double precioFinal = precioInicial + ajustePrecio;

        System.out.printf("El precio final por kilo de uva será: %.2f\n", precioFinal);
		
		
	}//Main

}//Final
