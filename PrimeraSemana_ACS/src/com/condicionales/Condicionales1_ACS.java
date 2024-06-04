package com.condicionales;

import java.util.Scanner;

public class Condicionales1_ACS {

	public static void main(String[] args) {
		
		// 1. Realiza un programa que reciba dos números por
		//teclado e indique cuál es mayor o si son iguales
		
		int num1, num2;
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		num1 = n.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = n.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 + " Es mayor que " + num2);
		}
		else {
			System.out.println(num2 + " Es mayor que " + num1);
		}
	}

}
