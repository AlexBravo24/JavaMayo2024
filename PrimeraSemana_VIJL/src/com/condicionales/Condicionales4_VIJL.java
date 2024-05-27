package com.condicionales;

import java.util.Scanner;


public class Condicionales4_VIJL {

	public static void main(String[] args) {
		
		// Realiza un programa que lea una cadena por teclado y compruebe si
		// contiene letras mayúsculas.
		
		//int contador = 0;
		String cadena;
		String minus;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa la cadena:");	
		cadena = entrada.nextLine();
		
		minus= cadena.toLowerCase();
		
		if(minus.equals(cadena)) {
			System.out.println("La cadena contiene NO mayúsculas.");
		}
		else {
			System.out.println("La cadena contiene mayúsculas.");
		}
				
//		for(int i = 0; i<cadena.length(); i++) {
//			if(Character.isUpperCase(cadena.charAt(i)))
//			{
//				contador++;
//			}
//		}
//        if (contador>0) {
//        	
//            System.out.println("La cadena contiene " +contador+ " letras mayúsculas.");
//            
//        } else {
//        	
//            System.out.println("La cadena NO contiene letras mayúsculas.");
//        }
			
	}
}
