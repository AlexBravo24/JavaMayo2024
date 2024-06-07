package com;

public class ArrayBidimensional {

	public static void main(String[] args) {

		//ARRAY De DOS DIMENSIONES
		//Tambien se le conoce como matriz
		//Pasamos a tener dos dimensiones para almacenar valores
		//lo que nos hace pasar a un concepro de "Tabla"
		//Teniendo "Filas" y "Columnas" para almacenar los datos
		
		//Ejemplo de un array de dos dimensiones
		//de elementos de tipo entero
		
		int [][] matriz = new int [3][3]; //[Filas] [Columnas]
		
		//Asignar valores a la matriz
		
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;
		
		//Declarando una matriz con valores asignados desde un inicio
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
			
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}

}
