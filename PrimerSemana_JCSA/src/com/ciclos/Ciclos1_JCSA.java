package com.ciclos;

import java.util.Scanner;

public class Ciclos1_JCSA {

	public static void main(String[] args) {
		// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12.
		
		System.out.println("******************************************************");
		System.out.println("***Este programa muestra la tabla de multiplicar del 12***"); 
		System.out.println("******************************************************");
		
		int numero, producto;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de múltiplos de 12 desea ver");
		numero = entrada.nextInt();
		
		
		for (int i = 1; i <= numero; i++) {
			producto = i*12;
			System.out.println(i+"x12="+producto);
			
		}
		
		entrada.close();

	}

}
