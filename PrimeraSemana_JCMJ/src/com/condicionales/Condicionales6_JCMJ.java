package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JCMJ {

	public static void main(String[] args) {
		// La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 
		//2. Precio inicial se recibe desde teclado

	

		Scanner scanner = new Scanner(System.in);

        // Leer el precio inicial desde teclado
        System.out.println("Introduce el precio inicial por kilo de uva:");
        double precioInicial = scanner.nextDouble();

        // Leer el tipo de uva (A o B) desde teclado
        System.out.println("Introduce el tipo de uva (A o B):");
        char tipoUva = scanner.next().charAt(0);

        // Leer el tama�o de la uva (1 o 2) desde teclado
        System.out.println("Introduce el tama�o de la uva (1 o 2):");
        int tama�oUva = scanner.nextInt();

        // Calcular el precio final de la uva seg�n el tipo y tama�o
        double precioFinal;
        if (tipoUva == 'A') {
            if (tama�oUva == 1) {
                precioFinal = precioInicial + 0.20;
            } else {
                precioFinal = precioInicial + 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tama�oUva == 1) {
                precioFinal = precioInicial - 0.30;
            } else {
                precioFinal = precioInicial - 0.50;
            }
        } else {
            System.out.println("Tipo de uva no v�lido.");
            return; // Salir del programa si el tipo de uva no es A ni B
        }

        // Mostrar el precio final de la uva
        System.out.println("El precio final por kilo de uva es: " + precioFinal);

        
    }
}
