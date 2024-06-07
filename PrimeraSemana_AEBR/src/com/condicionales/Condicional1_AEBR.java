package com.condicionales;

import java.util.Scanner;

public class Condicional1_AEBR {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 1===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		
		//Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales. 
		
		int a;
		int b;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Favor de teclear el primer número");
		a = input.nextInt();
		
		System.out.println("Favor de teclear el segundo número");
		b = input.nextInt();
		
		if (a==b) {
		   System.out.println("Ambos numeros son iguales");
		}else if (a > b) {
			System.out.println((a) + " Es mayor que " + (b));
		}else
			System.out.println((b) + " Es mayor que " + (a));	
		}
	
}
