package com.condiciones;

import java.util.Scanner;

public class Condicionales6_JCSA {

	public static void main(String[] args) {
//		//6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial 
//		al kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
//		Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere 
//		determinar cu�nto recibir� un productor por la uva que entrega en un embarque considerando
//		lo siguiente: * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de 
//		tama�o 1 y 30 c�ntimos si es de tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando 
//		es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
		
		
		int tamano, kilo;
		double precioTotal=0, precio;
		char tipo;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ingrese el que tipo de uva es (A o B):");
		tipo = entrada.next().toUpperCase().charAt(0);
		System.out.println("Ingrese el tama�o de la uva debe de ser 1 o 2: ");
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
				System.out.println("Error!!! No existe ese tama�o de uva");
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


