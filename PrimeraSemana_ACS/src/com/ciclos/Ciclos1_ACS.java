package com.ciclos;

import java.util.Scanner;

public class Ciclos1_ACS {

	public static void main(String[] args) {

		// 1.-Programa un algoritmo que realice la tabla de multiplicar del 12

		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		n = sc.nextInt();

		System.out.println("Tabla del " + n);
		for (int i = 1; i <= 12; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}

	}

}
