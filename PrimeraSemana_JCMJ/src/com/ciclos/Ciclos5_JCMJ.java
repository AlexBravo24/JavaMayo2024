package com.ciclos;

public class Ciclos5_JCMJ {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. 
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		 double principal = 1000.00;
	        double tasaInteresMensual = 2.0 / 100.0;
	        int numPeriodos = 12;

	        double montoTotal = principal * Math.pow(1 + tasaInteresMensual, numPeriodos);
	        System.out.printf("El monto total después de un año es: %.2f%n", montoTotal);
	    }
	

}
