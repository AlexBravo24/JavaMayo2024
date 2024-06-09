package com.ciclos;

public class Ciclos5_VIJL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1000.00;
		double resultado = a;
		Double ganancia = 0.00;

		for(int i = 1 ; i <= 12 ; i ++) {
			ganancia = 2*(resultado/100);
			resultado = resultado + ganancia;
			System.out.printf("Su ganancia del mes " + i + " es de : %.2f" , ganancia);
			System.out.println();
			System.out.printf("Se reinvertira la cantidad de: %.2f" ,resultado);
			System.out.println();
		}
		
	}

}
