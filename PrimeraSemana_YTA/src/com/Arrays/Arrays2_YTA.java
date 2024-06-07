package com.Arrays;

public class Arrays2_YTA {

	public static void main(String[] args) {
		// // Crea un array de números de 100 posiciones, que contendrá los números del 
		//1 al 100. Obtén la suma de todos ellos y la media.
		
		 int[] numeros = new int[100];
			        
			        
       for (int i = 0; i < numeros.length; i++) {
           numeros[i] = i + 1;
       }
			        		        
       int sumaTotal = 0;
       for (int numero : numeros) {
           sumaTotal += numero;
       }
			        			        
       double media = (double) sumaTotal / numeros.length;
			        
       System.out.println("Suma de todos los números: " + sumaTotal);
       System.out.println("Media de los números: " + media);		

	}

}
