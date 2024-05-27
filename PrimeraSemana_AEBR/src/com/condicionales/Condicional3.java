package com.condicionales;

import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 3===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		//Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error. 
		int a;
		int b;

		Scanner input = new Scanner (System.in);
		
		System.out.println("Favor de teclear el primer número");
		
		a = input.nextInt();
		
		System.out.println("Favor de teclear el segundo número");
		
		b = input.nextInt();
		
		if (b==0) {
			System.out.println("Error");
		}else {
			System.out.println("Tu resultado es " + (a/b));
		}
	}

}
