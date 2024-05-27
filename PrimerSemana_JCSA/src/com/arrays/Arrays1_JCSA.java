package com.arrays;

import java.util.Scanner;

public class Arrays1_JCSA {
	public static void main(String[] args) {
		
		System.out.println("*******************************************************************************************");
		System.out.println("***Este programa muestra por consola el índice y el valor al que corresponde a cada dato***"); 
		System.out.println("*******************************************************************************************\n");
		
		int [] numero = new int[10];
		
		Scanner input = new Scanner(System.in);
		System.out.println("A continuacion ingresara 10 numeros\n");
		for (int i = 0; i < numero.length; i++) {
			
			System.out.println("Introduce el dato "+(i+1)+":");
			numero [i] = input.nextInt();
		}
		 
		input.close();
		
		for (int i= 0; i<numero.length; i++) {
			System.out.println("Al indice "+i+" le corresponde el valor: "+numero[i]);
		}
		
	}
}
