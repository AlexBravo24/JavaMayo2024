package com.arrays;

public class Arrays2_VIJL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
//		1 al 100. Obt�n la suma de todos ellos y la media.

		int cadena [] = new int [100];
		int suma = 0;
		
		for(int i = 0 ; i <= cadena.length-1 ; i++) {
			cadena [i] = i+1;
			suma += cadena [i];
		}
			
		double media = (double)suma/ cadena.length;
		System.out.println("La suma de los n�meros es: " + suma);
		System.out.println("La media es: " + media);
	}

}
