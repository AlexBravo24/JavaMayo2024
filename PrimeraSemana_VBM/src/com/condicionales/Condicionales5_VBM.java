package com.condicionales;

import java.util.Scanner;

public class Condicionales5_VBM {

	public static void main(String[] args) {
		
		//Realiza un programa que calcule la aceptación de una solicitud en base a 
		//los siguientes parámetros: edad, nota y sexo.
		System.out.println("===================================");
		System.out.println("============Ejercicio 5 ===========");
		System.out.println("===================================");
		
		Scanner entrada= new Scanner(System.in);
		int nota;
		int edad;
		String sexo;
		
		System.out.println("Edad");
		edad=entrada.nextInt();
		System.out.println("Nota");
		nota=entrada.nextInt();
		System.out.println("Sexo (M o F):");
		sexo=entrada.next();
		
		if ( !sexo.toUpperCase().equals ("M") &&
	!sexo.toUpperCase() .equals ("F")) {
			System.out.println("El valor de sexo introducido es incorrecto");
		} else if (( nota >= 5) && (edad >= 18) &&
	(sexo.toUpperCase().equals("M")) {
			System.out.println("POSIBLE");
		}else if ((nota >=5) && (edad >=18) &&
	(sexo.toUpperCase().equals ("F")) {
			Syso
			
			
			
		}
				
		
	}

}
