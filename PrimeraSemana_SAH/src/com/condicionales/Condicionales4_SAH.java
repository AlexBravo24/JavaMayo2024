package com.condicionales;

import java.util.Scanner;

public class Condicionales4_SAH {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras may�sculas

		String cadena;
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Ingresa una cadena de texto:");
	        cadena = scanner.nextLine();
	        
	        boolean tieneMayusculas = false;
	        
	        for (int i = 0; i < cadena.length(); i++) {
	            if (Character.isUpperCase(cadena.charAt(i))) {
	                tieneMayusculas = true;
	                break; 
	            }
	        }
	        
	        if (tieneMayusculas) {
	            System.out.println("La cadena tiene may�scula.");
	        } else {
	            System.out.println("La cadena no tiene ninguna letra may�scula.");
	        }
	        
	      
	}//Main

}//final
