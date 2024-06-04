package com.condicionales;

import java.util.Scanner;

public class Condicionales7_DGV {

	public static void main(String[] args) {
		//Cálculo de pasaje de estudiantes
		System.out.println("Cálculo de pasaje de estudiantes");
		Scanner in = new Scanner(System.in);
		Integer cant = in.nextInt();
		int costoTotal;
		int costoAlumno;
		
		if (cant >= 100) {
			costoAlumno = 65;
			costoTotal = cant * costoAlumno;
		}
		else if(cant >=50 && cant <= 99) {
			costoAlumno = 70;
			costoTotal = cant * costoAlumno;
		}
		else if(cant >=30 && cant <= 49) {
			costoAlumno = 95;
			costoTotal = cant * costoAlumno;
		}
		else{
			costoTotal = 4000;
			costoAlumno = 4000 / cant;
		}
		
		System.out.println("El coste por alumno es: " + costoAlumno);
		System.out.println("El coste total: " + costoTotal);
	}

}
