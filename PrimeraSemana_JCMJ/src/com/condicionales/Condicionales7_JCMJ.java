package com.condicionales;

import java.util.Scanner;

public class Condicionales7_JCMJ {

	public static void main(String[] args) {
		// El director de una escuela está organizando 
		//un viaje de estudios y requiere determinar 
		//cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. 
		//La forma de cobrar es la siguiente: * 
		//Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 alumnos, 
		//el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. * Menos de 30 alumnos, 
		//el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
		//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses 
		//y lo que debe pagar cada alumno por el viaje.

		Scanner scanner = new Scanner(System.in);

        // Leer el número de alumnos desde teclado
        System.out.println("Introduce el número de alumnos:");
        int numAlumnos = scanner.nextInt();

        // Calcular el costo por alumno y el costo total del viaje
        double costoPorAlumno;
        double costoTotalViaje;
        
        if (numAlumnos >= 100) {
            costoPorAlumno = 65.0;
            costoTotalViaje = numAlumnos * costoPorAlumno;
        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            costoPorAlumno = 70.0;
            costoTotalViaje = numAlumnos * costoPorAlumno;
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            costoPorAlumno = 95.0;
            costoTotalViaje = numAlumnos * costoPorAlumno;
        } else {
            costoPorAlumno = 4000.0 / numAlumnos;
            costoTotalViaje = 4000.0;
        }

        // Mostrar el costo por alumno y el costo total del viaje
        System.out.println("El costo por alumno es: " + costoPorAlumno + " euros.");
        System.out.println("El costo total del viaje es: " + costoTotalViaje + " euros.");

        // Cerrar el escáner
        scanner.close();
    }

	}

