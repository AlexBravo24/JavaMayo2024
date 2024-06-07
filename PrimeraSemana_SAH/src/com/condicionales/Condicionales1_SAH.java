package com.condicionales;

import java.util.Scanner;

public class Condicionales1_SAH {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales
		
		int numero1;
		int numero2;
		
		{
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el primer numero");
			numero1=entrada.nextInt();
		}
			
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el segundo numero");
		numero2=entrada.nextInt();
		
		if ( numero1 > numero2) {
			System.out.println("El primero numero (" + numero1 + ") es mayor que el segundo numero (" + numero2 + ")"); 
		}else if ( numero1 < numero2 ){
			System.out.println("El segundo numero (" + numero2 + ") es mayor que el primer numero (" + numero1 + ")");
		}else {
			System.out.println("Ambos numeros(" + numero1 +" y " +numero2 +") son iguales"); 
			
		}
		
			
			
			
		}//Cierre main
	
	}//Final


