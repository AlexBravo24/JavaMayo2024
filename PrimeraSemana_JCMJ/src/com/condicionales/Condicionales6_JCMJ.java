package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JCMJ {

	public static void main(String[] args) {
		// La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		//Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 
		//2. Precio inicial se recibe desde teclado

	

		Scanner scanner = new Scanner(System.in);

        // Leer el precio inicial desde teclado
        System.out.println("Introduce el precio inicial por kilo de uva:");
        double precioInicial = scanner.nextDouble();

        // Leer el tipo de uva (A o B) desde teclado
        System.out.println("Introduce el tipo de uva (A o B):");
        char tipoUva = scanner.next().charAt(0);

        // Leer el tamaño de la uva (1 o 2) desde teclado
        System.out.println("Introduce el tamaño de la uva (1 o 2):");
        int tamañoUva = scanner.nextInt();

        // Calcular el precio final de la uva según el tipo y tamaño
        double precioFinal;
        if (tipoUva == 'A') {
            if (tamañoUva == 1) {
                precioFinal = precioInicial + 0.20;
            } else {
                precioFinal = precioInicial + 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tamañoUva == 1) {
                precioFinal = precioInicial - 0.30;
            } else {
                precioFinal = precioInicial - 0.50;
            }
        } else {
            System.out.println("Tipo de uva no válido.");
            return; // Salir del programa si el tipo de uva no es A ni B
        }

        // Mostrar el precio final de la uva
        System.out.println("El precio final por kilo de uva es: " + precioFinal);

        
    }
}
