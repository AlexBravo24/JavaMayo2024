package com.ciclos;

import java.util.Scanner;

public class Ciclos2_VIJL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qu� n�mero se va a multiplicar?");	
		a = entrada.nextInt();
		
		System.out.println("Hasta que n�mero deseas multiplicar:");	
		b = entrada.nextInt();

		for(int x = 1; x <= b ; x ++) {
			
			System.out.println(+ a + " X " + x + " = " + a*x );
			
		}
		
	}

}
