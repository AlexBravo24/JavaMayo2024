package com.arrays;

public class Arrays2_VIJL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea un array de números de 100 posiciones, que contendrá los números del
//		1 al 100. Obtén la suma de todos ellos y la media.

		int cadena [] = new int [100];
		int suma = 0;
		
		for(int i = 0 ; i <= cadena.length-1 ; i++) {
			cadena [i] = i+1;
			suma += cadena [i];
		}
			
		double media = (double)suma/ cadena.length;
		System.out.println("La suma de los números es: " + suma);
		System.out.println("La media es: " + media);
	}

}
