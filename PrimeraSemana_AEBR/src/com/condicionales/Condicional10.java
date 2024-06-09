package com.condicionales;

import java.util.Scanner;

public class Condicional10 {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 10==========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
//		Realiza un programa que pida un número entero entre uno y doce e imprima 
//		el número de días que tiene el mes correspondiente. 
		
		int a;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Favor de teclear un número");
		
		a = input.nextInt();
	
		
		if (a<1 || a>12) {
			System.out.println("Incorrecto,favor de teclear un valor entre 1 y 12");
		} else if (a == 2) {
	
        } else if (a == 8 || a == 10 || a == 12  || a == 1 || a == 3 || a == 5|| a == 7) {
                 System.out.println("Este mes tiene 31 días");
        } else if (a == 4 || a == 6 || a == 9  || a == 11 ) {
            System.out.println("Este mes tiene 30 días");
	}

}
}

