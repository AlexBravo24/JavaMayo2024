package com.Array;

public class Array2_JCMJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[100];

        // Llenar el array con los n�meros del 1 al 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Calcular la suma de todos los n�meros en el array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calcular la media de los n�meros en el array
        double mean = (double) sum / numbers.length;

        // Imprimir la suma y la media
        System.out.println("La suma de los n�meros del 1 al 100 es: " + sum);
        System.out.println("La media de los n�meros del 1 al 100 es: " + mean);
    }
}

