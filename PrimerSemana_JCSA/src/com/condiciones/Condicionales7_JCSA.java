package com.condiciones;

import java.util.Scanner;

public class Condicionales7_JCSA {

	public static void main(String[] args) {
//		7. El director de una escuela está organizando un viaje de estudios 
//		y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe 
//		pagar a la compañía de viajes por el servicio. La forma de cobrar es 
//		la siguiente: * Si son 100 alumnos o más, el costo por cada alumno es
//		de 65 euros. * De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 
//		49 alumnos, el costo es de 95 euros. * Menos de 30 alumnos, el costo 
//		de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
//		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses
//		y lo que debe pagar cada alumno por el viaje.
		
		int alumno, precioTotal;
		double precioAlumno;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese cuantos alumnos iran al viaje: ");
		alumno = entrada.nextInt();
		
		if (alumno >= 100) {
			precioTotal = alumno*65;
			System.out.println("Cada alumno tendra que pagar 65 euros");
			System.out.println("El costo a pagar a la compañía de autobuses sera de "+precioTotal+" euros ");
		}
		else if (alumno >= 50 && alumno <= 99 ) {
			precioTotal = alumno*70;
			System.out.println("Cada alumno tendra que pagar 70 euros");
			System.out.println("El costo a pagar a la compañía de autobuses sera de "+precioTotal+" euros ");
		}
		else if (alumno >= 30 && alumno <= 49 ) {
			precioTotal = alumno*95;
			System.out.println("Cada alumno tendra que pagar 95 euros");
			System.out.println("El costo a pagar a la compañía de autobuses sera de "+precioTotal+" euros ");
		}
		else if (alumno < 30 && alumno > 0) {
			precioAlumno = 4000/alumno;
			System.out.println("Cada alumno tendra que pagar "+precioAlumno+ " euros");
			System.out.println("El costo a pagar a la compañía de autobuses sera de 4000 euros ");
		}
		else {
			System.out.println("Error debe ingresar la cantidad de alumnos");
		}
		
		entrada.close();
	}
	

}
