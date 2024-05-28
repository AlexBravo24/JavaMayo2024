package com.condicionales;

import java.util.Scanner;

public class Condicionales6_DGV {
	
	public static void main(String[] args) {
		separador();
		System.out.println(" PRECIOS ASOCIACIÓN DE VINICULTORES");
		separador();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserte tipo de producto (A/B): ");
		char tipo = in.next().charAt(0);
		System.out.println("Inserte un tamaño (1/2): ");
		int tamano = in.nextInt();
		System.out.println("Ingrese un valor inicial: ");
		double valor = in.nextDouble();
		
		
//			switch (tipo) {
//			case 'A':
//				valor = (tamano == 1 ? valor - 0.20 : valor - 0.30 );
//				break;
//				
//			case 'B':
//				valor = (tamano == 1 ? valor - 0.30 : valor - 0.50 );
//				break;
//				
//			default:
//				System.out.println("Ingrese una opción válida");
//				break;
//		}
		
		//Evalúa que los datos que se metan sean válidos
		if(tipo != 'A' && tipo != 'B' || tamano != 1 && tamano != 2) {
			System.out.println(tipo + "" + tamano);
			System.out.println("Ingrese opciones válidas");
			
		//Si los datos son válidos, se ejecuta lo siguiente
		}else {
			if(tipo == 'A') {
				valor = (tamano == 1 ? valor - 0.20 : valor - 0.30 );
			}else {
				valor = (tamano == 1 ? valor - 0.30 : valor - 0.50 );
			}
			System.out.println("El precio por kilo del producto es: " + valor);
		}
		
		
		
	}// Fin de la función Main
	public static void separador() {
		for(int i=0;i<36;i++) {
			System.out.print("-");
		}
		System.out.println("");
	}
}
