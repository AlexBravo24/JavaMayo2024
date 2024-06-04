package com.condicionales;

import java.util.Scanner;

public class Condicionales5_DGV {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese su nota:");
		int nota = in.nextInt();
		System.out.println("Ingrese su edad");
		int edad = in.nextInt();
		System.out.println("Ingrese su sexo (M/F)");
		char sexo = in.next().charAt(0);
		String estado;
		
		if(nota >= 5 && edad >= 18){
			estado = (sexo == 'M' ? "POSIBLE" : "ACEPTADA");
		}else {
			estado = "NO ACEPTADA";
		}
		System.out.println("El estado de su solicitud es: " + estado);
	}

}
