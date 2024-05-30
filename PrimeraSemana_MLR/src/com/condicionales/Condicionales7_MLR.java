package com.condicionales;

import java.util.Scanner;

public class Condicionales7_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 7 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("El director de una escuela está organizando un viaje de estudios y requiere ");
		System.out.println("determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la ");
		System.out.println("compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son ");
		System.out.println("100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 ");
		System.out.println("alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 ");
		System.out.println("euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 ");
		System.out.println("euros, sin importar el número de alumnos. Realiza un algoritmo que permita ");
		System.out.println("determinar el pago a la compañía de autobuses y lo que debe pagar cada ");
		System.out.println("alumno por el viaje.");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		int alumnos;
		int ind = 0;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce el numero de Alumnos: ");
		alumnos=entrada.nextInt();
		
		System.out.println("\nResultado:");	
		
		if (alumnos >= 100) {
			ind = 65;
			System.out.println("Categoria > 100 Alumnos - Costo x Alumno: € " + ind + " - Pago a Agencia: € " + (alumnos * ind));
		}else if (alumnos >= 50 && alumnos < 100) {
			ind =70;
			System.out.println("Categoria 50 - 99 Alumnos - Costo x Alumno: € " + ind + " - Pago a Agencia: € " + (alumnos * ind));
		}else if (alumnos >= 30 && alumnos < 50) {
			ind = 95;
			System.out.println("Categoria 30 - 49 Alumnos - Costo x Alumno: € " + ind + " - Pago a Agencia: € " + (alumnos * ind));
		}else if (alumnos > 0 && alumnos < 30) {
			System.out.println("Categoria 50 - 99 Alumnos - Costo x Alumno: NA - Pago a Agencia: € 4000");
		}else {
			System.out.println("Num de alumnos no valido");
		}
	
	}

}
