package com.condicionales;

import java.util.Scanner;

public class Condicionales3_DGV {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Programa para divisiones");
		System.out.println("Ingrese un primer número: ");
		double n1 = in.nextDouble();
		System.out.println("Ingrese un segundo número: ");
		double n2 = in.nextDouble();
		
		double div = (n1 / n2);
		
		if(n2 == 0) {
			System.out.println("No es posible dividir entre cero.");
		} else {
			System.out.println("El resultado es: " + div);
		}
	}

}
