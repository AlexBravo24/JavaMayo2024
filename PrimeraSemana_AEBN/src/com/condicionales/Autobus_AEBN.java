package com.condicionales;

import java.util.Scanner;

public class Autobus_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        System.out.println("Por favor, introduce el número de alumnos:");
	        int alumnos = input.nextInt();

	        double costo;
	        if (alumnos >= 100) {
	            costo = 65;
	        } else if (alumnos >= 50) {
	            costo = 70;
	        } else if (alumnos >= 30) {
	            costo = 95;
	        } else {
	            costo = 4000.0 / alumnos;
	        }

	        System.out.println("Cada alumno debe pagar " + costo + " euros.");
	        System.out.println("El pago total a la compañía de autobuses es " + (costo * alumnos) + " euros.");

	}

}
