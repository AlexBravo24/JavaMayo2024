package com.condiciones;

import java.util.Scanner;

public class Condicionales6_JCSA {

	public static void main(String[] args) {
//		//6. La asociación de vinicultores tiene como política fijar un precio inicial 
//		al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
//		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere 
//		determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando
//		lo siguiente: * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de 
//		tamaño 1 y 30 céntimos si es de tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando 
//		es de tamaño 1, y 50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado
		
		
		int tamano, kilo;
		double precioTotal=0, precio;
		char tipo;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ingrese el que tipo de uva es (A o B):");
		tipo = entrada.next().toUpperCase().charAt(0);
		System.out.println("Ingrese el tamaño de la uva debe de ser 1 o 2: ");
		tamano = entrada.nextInt();
		System.out.println("Ingrese el precio de la uva");
		precio = entrada.nextDouble();
		System.out.println("Ingrese cuantos kilos compraran: ");
		kilo = entrada.nextInt();
		
		
		if(tipo=='A') {
			if (tamano==1) {
				precioTotal = ((precio+20) * kilo);
				System.out.println(precioTotal);
			}else if (tamano==2) {
				precioTotal = ((precio+30) * kilo);
			}else {
				System.out.println("Error!!! No existe ese tamaño de uva");
			}
		}
			
		else if (tipo=='B') {
			if (tamano==1) {
				precioTotal = ((precio-30) * kilo);
				System.out.println(precioTotal);
			}else if (tamano==2) {
				precioTotal = ((precio-50) * kilo);
				System.out.println(precioTotal);
			}
			
			else {
				System.out.println("Error!!! Ese tipo de uva no existe");
			}
			
				
			}
			
		else {
			System.out.println("Error!!! NO existe ese tipo de uva");
		}
		//System.out.println(precioTotal);
		entrada.close();
		
	}						// aqui se cierra if principal
	
	
		
	
	}


