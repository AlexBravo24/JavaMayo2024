package com.condicionales;

import java.util.Scanner;

public class Condicional6 {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 6===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
//		La asociación de vinicultores tiene como política fijar un precio inicial al kilo 
//		de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
//		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
//		requiere determinar cuánto recibirá un productor por la uva que entrega en un 
//		embarque considerando lo siguiente: 
//		* Si es de tipo A, se le cargan 20  céntimos al precio inicial cuando es detamaño 1 y 
//		30 céntimos si es de  tamaño 2. 
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
//		50 céntimos cuando es de tamaño 2. 
//		Precio inicial se recibe desde teclado 
		int costI;
		char type;
		int size;
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Favor de escribir el precio por kilo de uva");
		
		costI = input.nextInt();
		
		System.out.println("Favor de escribir el tipo de uva (A o B) ");
		
		type = input.next().charAt(0);
		
		System.out.println("Favor de escribir el tamaño de uva (1 o 2) ");
		
		size = input.nextInt();
        
		if (type == 'A' || type == 'a') {
			if(size == 1) {
				System.out.println("El costo final es de " + (costI + 0.20));
			}else if (size==2) {
				System.out.println("El costo final es de " + (costI + 0.3));
			}else {
				System.out.println("Error: Tamaño de uva no válido. Debe ser 1 o 2.");
			}
            return;
		} else if (type == 'B' || type == 'b') {
			if (size == 1) {
				System.out.println("El costo final es de " + (costI + 0.3));
			}else if (size == 2) {
				System.out.println("El costo final es de " + (costI + 0.5));
			}else {

			System.out.println("Error: Tamaño de uva no válido. Debe ser 1 o 2.");
		}
			return;
			
	}
	}
}
