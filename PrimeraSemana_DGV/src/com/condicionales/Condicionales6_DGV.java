package com.condicionales;

import java.util.Scanner;

public class Condicionales6_DGV {
	
	public static void main(String[] args) {
		separador();
		System.out.println(" PRECIOS ASOCIACI�N DE VINICULTORES");
		separador();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserte tipo de producto (A/B): ");
		char tipo = in.next().charAt(0);
		System.out.println("Inserte un tama�o (1/2): ");
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
//				System.out.println("Ingrese una opci�n v�lida");
//				break;
//		}
		
		//Eval�a que los datos que se metan sean v�lidos
		if(tipo != 'A' && tipo != 'B' || tamano != 1 && tamano != 2) {
			System.out.println(tipo + "" + tamano);
			System.out.println("Ingrese opciones v�lidas");
			
		//Si los datos son v�lidos, se ejecuta lo siguiente
		}else {
			if(tipo == 'A') {
				valor = (tamano == 1 ? valor - 0.20 : valor - 0.30 );
			}else {
				valor = (tamano == 1 ? valor - 0.30 : valor - 0.50 );
			}
			System.out.println("El precio por kilo del producto es: " + valor);
		}
		
		
		
	}// Fin de la funci�n Main
	public static void separador() {
		for(int i=0;i<36;i++) {
			System.out.print("-");
		}
		System.out.println("");
	}
}
