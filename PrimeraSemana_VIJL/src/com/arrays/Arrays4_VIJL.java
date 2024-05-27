package com.arrays;

public class Arrays4_VIJL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//		los valores invertidos, es decir, que el segundo array deberá tener los valores
//		{5,4,3,2,1}.
		
		int[] array = new int[]{ 1,2,3,4,5 };
		int array2 [] = new int [array.length]; 
		int j = 0;
		
		for (int i = array.length-1 ; i >= 0 ; i--) {
			
			array2[j] = array[i];
			j++;
			
		}
		
        System.out.println("Cadena original: ");
		
		for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]+ " ");
		}
		
		System.out.println();
		System.out.println("Cadena nueva: ");
		
		for (int i = 0; i < array2.length; i++) {
			
            System.out.print(array2[i]+ " ");
            
		}
	}

}
