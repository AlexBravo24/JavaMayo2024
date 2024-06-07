package com.condicionales;

import java.util.Scanner;

public class Condicionales6_VIJL {

	public static void main(String[] args) {
		
//		La asociación de vinicultores tiene como política fijar un precio inicial al kilo
//		de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2).
//		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se
//		requiere determinar cuánto recibirá un productor por la uva que entrega en un
//		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20
//		céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de
//		tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y
//		50 céntimos cuando es de tamaño 2.
		
		char tipo;
		int tamaño;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el tipo de uva (A/B):");
		tipo = entrada.next().charAt(0);
		
		
		if(tipo == 'a' || tipo == 'A') {
			
			System.out.println("Ingresa el tamaño de uva (1/2):");	
			tamaño = entrada.nextInt();
			
			if(tamaño == 1) {
				int cargo = 20;
				System.out.println("el cargo se AUMENTA en:  " +cargo+ " centimos");
			}else if (tamaño == 2){
				int cargo = 30;
				System.out.println("el cargo se AUMENTA en:  " +cargo+ " centimos");
			}else {
				System.out.println("Tamaño incorrecto!!");
			}
			
		}else if(tipo == 'b' || tipo == 'B'){
			
			System.out.println("Ingresa el tamaño de uva (1/2):");	
			tamaño = entrada.nextInt();
			
			if(tamaño == 1) {
				int cargo = -30;
				System.out.println("el cargo se REDUCE en:  " +cargo*(-1)+ " centimos");
			}else if (tamaño == 2){
				int cargo = -50;
				System.out.println("el cargo se REDUCE en:  " +cargo*(-1)+ " centimos");
			}else {
				System.out.println("Tamaño incorrecto!!");
			}
			
		}else {
			System.out.println("Tipo incorrecto!!");
		}
		
		
	}

}
