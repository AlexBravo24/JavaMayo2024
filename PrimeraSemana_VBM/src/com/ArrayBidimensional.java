package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		//ARRAY DE DOS DIMENSIONES O ARRAY BIDIMENSIONAL
		//Tambien se le conoce como matriz.
		//Pasamos a tener 2 dimensiones para almacenar valore
		//lo que nos hace pasar a un concepto de "tabla"
		//Teniendo "filas" o "columnas" para almacenar los datos
		
		//Ejemplo: un array de dos dimensiones
		//de elemento de tipo entero
		
		int [] [] matriz = new int [3] [3]; // filas [columnas] 
		
		//Asignar valores a la matriz
		
		matriz[0] [0]=1;
		matriz[0] [1]=2; // [1] [2] [3] 
		matriz[0] [2]=3;
				
		matriz[1] [0]=4;
		matriz[1] [1]=5; // [4] [5] [6] 
		matriz[1] [2]=6;
		
		matriz[2] [0]=7;
		matriz[2] [1]=8; // [7] [8] [9] 
		matriz[2] [2]=9;
		
		//Declarando una matriz con valores asignados desde un inicio
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Como podemos recorrer u obtener los datos y mostrarlos en consola
		System.out.println(matriz2[2][1]);
		
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz [i][j]+ " ");	
			}
			
		}
		}

}
