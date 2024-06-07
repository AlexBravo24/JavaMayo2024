package com.condicionales;

import java.util.Scanner;

public class Condicionales3_SAH {

	public static void main(String[] args) {
		
		//Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error. 

		double numero1;
		double numero2;
		
		
		{
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el primer numero");
			numero1=entrada.nextInt();
		}
			
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el segundo numero");
		numero2=entrada.nextInt();
		
		if ( numero2 == 0 ) {
			System.out.println("Error");
		}else {
			double resultado = (numero1/numero2);
			System.out.println("El resultado de la division es:(" + resultado +")");
			
		}
		
	} //Main

} //Final
