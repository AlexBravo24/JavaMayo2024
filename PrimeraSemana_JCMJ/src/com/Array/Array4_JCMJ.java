package com.Array;

public class Array4_JCMJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] arrayOriginal = {1, 2, 3, 4, 5};
        
        // Array para los valores invertidos
        int[] arrayInvertido = new int[arrayOriginal.length];
        
        // Llenar el array invertido con los valores del array original en orden inverso
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }
        
        // Imprimir el array invertido
        System.out.print("Array invertido: ");
        for (int i : arrayInvertido) {
            System.out.print(i + " ");
        }
    }
}
