package com.arrays;

import java.util.Scanner;

public class Arrays3_JCSA {

	public static void main(String[] args) {
//		// 3. Pide al usuario por teclado una frase 
//		y pasa sus caracteres a un array de caracteres.
		
		System.out.println("********************************************************************");
		System.out.println("******Este programa muestra una frase convertida a caracteres*******"); 
		System.out.println("********************************************************************\n");
		
		Scanner input = new Scanner (System.in);
		String frase;
		System.out.println("Ingrese una frase");
		frase = input.nextLine();
		
		char[] caracteres = frase.toCharArray();		
		
		
		System.out.println("Aqui se muestra la frase convertida a caracteres:");
		for(char i:caracteres){
	
		System.out.print(" '"+i+"' ");
		}
		
		
		
		
		input.close();
		

	}

}
