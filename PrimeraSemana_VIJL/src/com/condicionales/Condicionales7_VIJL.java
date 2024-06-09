package com.condicionales;

import java.util.Scanner;

public class Condicionales7_VIJL {

	public static void main(String[] args) {
		
//		El director de una escuela est� organizando un viaje de estudios y requiere
//		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la
//		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
//		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
//		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000
//		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita
//		determinar el pago a la compa��a de autobuses y lo que debe pagar cada
//		alumno por el viaje.
		
		int alumnos;
		int costo = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el n�mero de alumnos:");	
		alumnos = entrada.nextInt();
		
		if(alumnos>=100) {
			costo=alumnos*65;
		}else if (alumnos>=50 && alumnos<=99) {
			costo=alumnos*70;
		}else if (alumnos>=30 && alumnos<=49) {
			costo=95;
		}else if (alumnos<30) {
			costo=alumnos*4000;
		}else if (alumnos<=0) {
	        System.out.println("Error");
		}
		float costU = (float) costo/alumnos;
		String resultado = String.format("%.3f", costU);
		
        System.out.println("El costo total del autobus es de: " +costo+ " Euros.");
        System.out.println("El costo por alumno es de: " +resultado+ " Euros.");
	}

}
