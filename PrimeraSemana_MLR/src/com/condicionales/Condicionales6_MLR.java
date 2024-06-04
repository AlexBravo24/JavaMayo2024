package com.condicionales;

import java.util.Scanner;

public class Condicionales6_MLR {

	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("=====================================================================================");
		System.out.println("================================== Ejercicio 6 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:\n");
		System.out.println("La asociación de vinicultores tiene como política fijar un precio inicial al kilo");
		System.out.println("de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). ");	
		System.out.println("Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se ");
		System.out.println("requiere determinar cuánto recibirá un productor por la uva que entrega en un");
		System.out.println("embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20");
		System.out.println("céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de");
		System.out.println("tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y");
		System.out.println("50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado");
		System.out.println("");
		System.out.println("=====================================================================================");
		
		Scanner entrada = new Scanner(System.in);
		float precioInicial;
		float precioFinal;
		String tipo;
		int tamaño;
		String clasif;
		
		System.out.print("Introduce Precio Inicial x Kilo: ");
		precioInicial=entrada.nextFloat();

		// Validacion de Tipo
		do {
			System.out.print("Introduce un Tipo (A/B): ");
			tipo=entrada.next();
			tipo=tipo.toUpperCase();
		} while ((tipo.equals("A") == false) && (tipo.equals("B") == false));
		
		// Validacion de tamaño
		do {
			System.out.print("Introduce un Tamaño (1,2): ");
			tamaño=entrada.nextInt();			
		} while (tamaño != 1 && tamaño != 2);
		
		clasif = tipo + tamaño;
		
		System.out.println("\nResultado:");	
		
		switch(clasif) {
		case "A1":
			System.out.println("Clasificacion " + clasif + " (+20¢) - Precio Inicial: $" + precioInicial + " - Precio Final: $" + String.format("%.2f", (precioInicial + 0.2)));
			break;
		case "A2":
			System.out.println("Clasificacion " + clasif + " (+30¢) - Precio Inicial: $" + precioInicial + " - Precio Final: $" + String.format("%.2f", (precioInicial + 0.3)));
			break;
		case "B1":
			System.out.println("Clasificacion " + clasif + " (-30¢) - Precio Inicial: $" + precioInicial + " - Precio Final: $" + String.format("%.2f", (precioInicial - 0.3)));
			break;
		case "B2":
			System.out.println("Clasificacion " + clasif + " (-50¢) - Precio Inicial: $" + precioInicial + " - Precio Final: $" + String.format("%.2f", (precioInicial - 0.5)));
			break;			
		}
		
	}

}
