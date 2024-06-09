package com.condicionales;

import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 4===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");

		//Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas. 
		String a;

		Scanner input = new Scanner (System.in);
		
		System.out.println("Favor de escribir una cadena de texto");  
		
	    a = input.nextLine();
	    String minuscula = a.toLowerCase();
	    if (a.equals(minuscula)) { //puedes usar == ? debido al POOL STRING
		     System.out.println("No hay mayusculas en la cadena de texto");
	    }else {
	    	System.out.println("Hay mayusculas en la cadena de texto");
	    }

	}
}
