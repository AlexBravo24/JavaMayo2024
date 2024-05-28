package com.condicionales;

import java.util.Scanner;

public class Condicionales_LASG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es
		//mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		//Pedir el primer numero
		System.out.println("Escribe el primer numero");
		int numero = entrada.nextInt();
		
		//Pedir el segundo numero
		System.out.println("Escribe el segundo numero");
		int numero2 =entrada.nextInt();
		
		//Comparar los numeros
		
		if (numero < numero2) {
			System.out.println("El primer numero ("+ numero +") es menor que el segundo.");
			
		}else if (numero > numero2) {
		System.out.println("El segundo numero("+numero2+")es mayor que el primero");
		}else {
			System.out.println("Ambos numeros son iguales("+numero2+")");
		}
		
	
		
		


	}

}
