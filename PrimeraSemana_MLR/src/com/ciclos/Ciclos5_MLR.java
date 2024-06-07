package com.ciclos;

public class Ciclos5_MLR {

	public static void main(String[] args) {

		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 5 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%");
		System.out.println("de interés mensual. ¿Cuál será la cantidad de dinero que esta persona ");
		System.out.println("tendrá al cabo de un año si todo el dinero lo reinvierte? ");
		System.out.println("=====================================================================================");
		System.out.println("");
	
		double acumulado = 1000;
		
		System.out.println("\nResultado:");

		//Primer mes sin ganancias, cantidades iniciales
		System.out.println("Mes: 01 Intereses: $00.00 Acumulado: $1,000.00");							

		for (int i = 2; i <= 12; i++) {
			//Se calcula la ganancia por mes
			acumulado = acumulado + (acumulado * 0.02);
			System.out.println(String.format("Mes: %02d", i) + " Intereses: " + String.format("$%.2f", (acumulado * 0.02)) + " Acumulado: " + String.format("$%,.2f", (acumulado)));							
		}
		
	}

	
}
