package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		int numero;
		int nombre;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduce tu edad en años");
		numero=entrada.nextInt(); 
		System.out.println("Introduce tu nombre");
		nombre=entrada.nextInt(); 
		System.out.println("tu nombre es" + nombre + "y tienes" + numero + "años"); 
		entrada.nextInt();
		nombre=entrada.nextInt();
		
		System.out.println("pon tu nombre es" + nombre +"y tiene" + "años"); 
		
	}

}
