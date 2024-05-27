package com.condicionales;

import java.util.Scanner;

public class Condicionales6_SAH {

	public static void main(String[] args) {
		// La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo
		//de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2)

		int tama�oUva;
		double precioInicial;
		char tipoUva;
		
		Scanner scanner = new Scanner(System.in);

        	System.out.print("Ingrese el precio inicial por kilo de uva: ");
        	precioInicial = scanner.nextDouble();

        	System.out.print("Seleccione el tipo de uva (A/B): ");
        	tipoUva = scanner.next().charAt(0);

        	System.out.print("Seleccione el tama�o de la uva (1/2): ");
        	tama�oUva = scanner.nextInt();

        double ajustePrecio = 0;

        if (tipoUva == 'A') {
            if (tama�oUva == 1) {
                ajustePrecio += 0.20;
            } else if (tama�oUva == 2) {
                ajustePrecio += 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tama�oUva == 1) {
                ajustePrecio -= 0.30;
            } else if (tama�oUva == 2) {
                ajustePrecio -= 0.50;
            }
        }

        double precioFinal = precioInicial + ajustePrecio;

        System.out.printf("El precio final por kilo de uva ser�: %.2f\n", precioFinal);
		
		
	}//Main

}//Final
