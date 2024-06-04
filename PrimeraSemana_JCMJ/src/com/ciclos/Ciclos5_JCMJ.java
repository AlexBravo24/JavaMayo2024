package com.ciclos;

public class Ciclos5_JCMJ {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s mensual. 
		//�Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		
		 double principal = 1000.00;
	        double tasaInteresMensual = 2.0 / 100.0;
	        int numPeriodos = 12;

	        double montoTotal = principal * Math.pow(1 + tasaInteresMensual, numPeriodos);
	        System.out.printf("El monto total despu�s de un a�o es: %.2f%n", montoTotal);
	    }
	

}
