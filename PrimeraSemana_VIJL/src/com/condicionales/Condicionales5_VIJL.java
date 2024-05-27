package com.condicionales;

import java.util.Scanner;

public class Condicionales5_VIJL {

	public static void main(String[] args) {
		
		// Crea un programa que pida al usuario dos números y muestre el resultado
		// de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		int edad;
		int nota;
		char sexo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa edad:");	
		edad = entrada.nextInt();
		
		System.out.println("Ingresa nota:");	
		nota = entrada.nextInt();
		
		System.out.println("Ingresa seco M/F");
		sexo = entrada.next().charAt(0);
		
		if (nota >= 5 && edad >= 18) {
			
			if(sexo == 'F' || sexo == 'f'){
				
			System.out.printf("El estado de su solicitud es ACEPTADA");	
			
			}else if(sexo == 'M' || sexo == 'm') {
			System.out.printf("El estado de su solicitud es POSIBLE");
		    }
		}else {
			System.out.printf("El estado de su solicitud es NO ACEPTADA");
		}
				        			
	}

}
