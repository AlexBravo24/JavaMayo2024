package com.condicionales;

import java.util.Scanner;

public class Condicionales7_SAH {

	public static void main(String[] args) {
		// . El director de una escuela está organizando un viaje de estudios y requiere
		//determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
		//compañía de viajes por el servicio
		
		double costoPorAlumno;
		double costoTotal;
		Scanner scanner = new Scanner(System.in);
        	System.out.print("Ingrese el número total de alumnos: ");
        	int numAlumnos = scanner.nextInt();

        	costoPorAlumno = 0;
        	costoTotal = 0;

        if (numAlumnos >= 100) {
       		costoPorAlumno = 65;
       	} else if (numAlumnos >= 50) {
       		costoPorAlumno = 70;
        } else if (numAlumnos >= 30) {
       		costoPorAlumno = 95;
       	} 
        if (numAlumnos <= 30) {
        	costoTotal = 4000; 
        }
       		
       	costoPorAlumno = costoTotal/numAlumnos;
       			
       	costoTotal = numAlumnos * costoPorAlumno;

       	System.out.printf("El costo total por el viaje es: %.2f euros\n", costoTotal);
       	System.out.printf("Cada alumno debe pagar: %.2f euros\n", costoPorAlumno);

	}

}
