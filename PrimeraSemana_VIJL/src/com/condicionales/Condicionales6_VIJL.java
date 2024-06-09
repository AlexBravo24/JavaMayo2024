package com.condicionales;

import java.util.Scanner;

public class Condicionales6_VIJL {

	public static void main(String[] args) {
		
//		La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo
//		de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
//		Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se
//		requiere determinar cu�nto recibir� un productor por la uva que entrega en un
//		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20
//		c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de
//		tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y
//		50 c�ntimos cuando es de tama�o 2.
		
		char tipo;
		int tama�o;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el tipo de uva (A/B):");
		tipo = entrada.next().charAt(0);
		
		
		if(tipo == 'a' || tipo == 'A') {
			
			System.out.println("Ingresa el tama�o de uva (1/2):");	
			tama�o = entrada.nextInt();
			
			if(tama�o == 1) {
				int cargo = 20;
				System.out.println("el cargo se AUMENTA en:  " +cargo+ " centimos");
			}else if (tama�o == 2){
				int cargo = 30;
				System.out.println("el cargo se AUMENTA en:  " +cargo+ " centimos");
			}else {
				System.out.println("Tama�o incorrecto!!");
			}
			
		}else if(tipo == 'b' || tipo == 'B'){
			
			System.out.println("Ingresa el tama�o de uva (1/2):");	
			tama�o = entrada.nextInt();
			
			if(tama�o == 1) {
				int cargo = -30;
				System.out.println("el cargo se REDUCE en:  " +cargo*(-1)+ " centimos");
			}else if (tama�o == 2){
				int cargo = -50;
				System.out.println("el cargo se REDUCE en:  " +cargo*(-1)+ " centimos");
			}else {
				System.out.println("Tama�o incorrecto!!");
			}
			
		}else {
			System.out.println("Tipo incorrecto!!");
		}
		
		
	}

}
