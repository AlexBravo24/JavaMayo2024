package com.condicionales;

import java.util.Scanner;

public class Condicional7 {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 7===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
//		 El director de una escuela est� organizando un viaje de estudios y requiere 
//		 determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
//		 compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		 100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		 euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
//		 euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
//		 determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
//		 alumno por el viaje. 
		int a;
		float cien = 65F;
		float cinc = 70F;
		float trei = 95F;
		float vein = 4000F;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Favor de escribir el n�mero de alumnos que viajaran");
		
		a = input.nextInt();
		
		if(a>=100) {
			System.out.println("Cada alumno debera pagar " + (cien) + " euros " );
			System.out.println("Se debe pagar " + (cien*a) + " euros a la compa��a de autobuses" );
		}else if(a>=50 && a<=99) {
			System.out.println("Cada alumno debera pagar " + (cinc) + " euros " );
			System.out.println("Se debe pagar " + (cinc*a) + " euros a la compa��a de autobuses" );
		}else if(a>=30 && a<=49) {
			System.out.println("Cada alumno debera pagar " + (trei) + " euros " );
			System.out.println("Se debe pagar " + (trei*a) + " euros a la compa��a de autobuses" );
		}else if (a<30) {
			System.out.println("Cada alumno debera pagar " + (vein/a) + " euros " );
			System.out.println("Se debe pagar " + (vein) + " euros a la compa��a de autobuses" );
	}
	}
}
