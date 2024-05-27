package com.arrays;

public class arrays4_AEBR {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 4===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		
		//Dado un array de números de 5 posiciones con los siguientes valores: 
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}.
//		
		int [] a = {1,2,3,4,5};
		int [] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }

        // Imprimir el array invertido
        System.out.print("Array invertido: ");
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
