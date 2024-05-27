package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays 
		//*Los arrays,vectorees o arreglos son una estructura
//		  *de datos que nos permite almacenar un tipo de datos en
//		   comun una especie de colección de datos.
//         Una vez declarado su tamaño ese no puede crecer.
		//Para declarar un array:
		
		//Declarando un array de numeros enteros con su tamaño
		
//		int [] numeros = new int [5];
//		
//		//Guardar o asignar valoresen cada posición del array
//		
//		numeros[0] = 1;
//		numeros[1] = 31;
//		numeros[2] = 75;
//		numeros[3] = 8;
//		numeros[4] = 19;
		
		//Como mostrar en consola determinada posición del array
		
//		System.out.println(numeros[2]);
		
		//Declarando un scanner para solicitar los valores por teclado
//		Scanner input = new Scanner(System.in);
//
//		int [] numeros2 = new int [5];
//		for (int i=0; i<numeros2.length; i++) {
//			System.out.println("Ingresa un numero en la pisción" + i);
//			numeros2 [i]=input.nextInt();
//		}
//		{
////       
//	  //Para verlos todos se puede hacer un ciclo
//	   for (int i=0; i<numeros2.length; i++) {
//		System.out.println(numeros2[i]+ "," );
//	   }
//}
		//Tambien puedes hacer arrays de caracteres 
		char [] nombre = {'a','s','f','g'};
		String [] nombree= {"chiquilin","sisifo"};
		
		//Se imprimen todos con for each
		for (String i:nombree) { //Para cada elemento de array
			System.out.println(i); //Se imprime uno en cada linea

		}
	}

	
}



