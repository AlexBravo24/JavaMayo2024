package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JCSA {

	public static void main(String[] args) {
//		// 2.- Programa un algoritmo que realice la tabla de multiplicar 
//		de un numero introducido desde teclado, hasta la iteración deseada
//		por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		
		System.out.println("****************************************************************************");
		System.out.println("***Este programa realiza la tabla de multiplicar de un numero introducido***"); 
		System.out.println("********desde teclado, hasta la iteración deseada por el usuario************"); 
		System.out.println("****************************************************************************\n");
		
		int tabla, numero, producto;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el número de la tabla que sea ver");
		tabla = entrada.nextInt();
		System.out.println("Ingrese hasta que iteracion que desea ver");
		numero = entrada.nextInt();
		
		
		for (int i = 1; i <= numero; i++) {
			producto = i*tabla;
			System.out.println(i+"x"+tabla+"="+producto);
			
		}
		
		
		entrada.close();

	}

}
