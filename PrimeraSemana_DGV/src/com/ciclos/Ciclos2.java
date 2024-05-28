package com.ciclos;

import java.util.Scanner;

public class Ciclos2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese un dígito para generar su tabla de multiplicación");
		int n1 = in.nextInt();
		System.out.println("Ingrese el último número de la tabla");
		int n2 = in.nextInt();
		System.out.println("Tabla del " + n1);
		int x = 0;
		int y = 0;
		do{
			y++;
			x = n1 * y;
			System.out.println(n1 + " x " + y + " = " + x);
		}while(y<n2);

	}

}
