package com.arrays;

public class arrays2_AEBR {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 2===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		//DUDA SUMA CONCATENADA Y MEDIA
		//Crea un array de números de 100 posiciones, que contendrá los números del 
		//1 al 100. Obtén la suma de todos ellos y la media. 
		int [] array = new int [100];
		
		for (int i=0; i<array.length; i++) {
			array [i]= i+1;
			System.out.println(array[i]);		
		}
		
		int sum = 0;
		
		for (int j=0; j<array.length; j++) {
			sum += array [j] ;              //SUMA EL VALOR ANTERIOR AL NUEVO Y SE ACUMULA
			System.out.println(sum);		
		}
		
//		for (int j=0; j<array.length; j++) {
//			sum = array [j]++ ;
//			System.out.println(sum);		
//		}
		
		System.out.println(sum);
		System.out.println(array.length);

	
	}
}

//int [] array = new int [100];
////for (int i1=0;i1<array.length; i1++) {
////		array [i1]= i1++ ;
////		System.out.println(i1);
////      System.out.println(array.length);
////	}
////
//for (int i=0; i <100; i++) {
//	array [i]= i++ ;
//	System.out.println(i);
////           System.out.println(array.length);
//}