package com.condicionales;

import java.util.Scanner;

public class Condicionales5_SAH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		double nota;
		char sexo;
		
		String resultado;
		
		Scanner scanner = new Scanner(System.in);
			System.out.print("Ingrese su edad: ");
			edad = scanner.nextInt();

			System.out.print("Ingrese su nota: ");
			nota = scanner.nextDouble();

			System.out.print("Ingrese su sexo (M/F): ");
			sexo = scanner.next().charAt(0); 

			resultado = "NO ACEPTADA";
			resultado = "NO POSIBLE";

			if (sexo == 'F' && nota >= 5 && edad >= 18) {
				resultado = "ACEPTADA";
			}
			
			if ( sexo == 'M' && nota>= 5 && edad >=18 ) {
				resultado = "Posible";
			}
				
				
			System.out.println(resultado);
		
		
	}//Main

}//Final
