package com.Arrays;

public class Arrays2_YTA {

	public static void main(String[] args) {
		// // Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		//1 al 100. Obt�n la suma de todos ellos y la media.
		
		 int[] numeros = new int[100];
			        
			        
       for (int i = 0; i < numeros.length; i++) {
           numeros[i] = i + 1;
       }
			        		        
       int sumaTotal = 0;
       for (int numero : numeros) {
           sumaTotal += numero;
       }
			        			        
       double media = (double) sumaTotal / numeros.length;
			        
       System.out.println("Suma de todos los n�meros: " + sumaTotal);
       System.out.println("Media de los n�meros: " + media);		

	}

}
