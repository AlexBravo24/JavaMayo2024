package com.bucles;

import java.util.Scanner;

public class Bucle2_AEBR {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 2===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		//Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
        int a;
		int b;
        
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce el número del cual deseas obtener la tabla de multiplicar: ");
		a = input.nextInt();
		
		System.out.println("Introduce hasta donde deseas multiplicar: ");
		b = input.nextInt();
		
		System.out.println(("Tabla de multiplicar del "+ a));
	    for (int i=1; i<=b; i++) {
    		System.out.println( a + " x " + i + " = " + (i*a));
    	}
	}

}
