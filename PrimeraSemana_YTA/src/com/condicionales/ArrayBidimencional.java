package com.condicionales;

public class ArrayBidimencional {

	public static void main(String[] args) {
		//  ARRAY DE DOS DIMENSIONES
		//Tambi�n se le conoce como matriz.
		//Pasamos a tener dos dimensiones para almacenar
		//lo que nos hace pasar a un concepto de "tabla"
		//Teniendo "filas" y "columnas" para almacenar los datos
		
		//Ejemplo de un array de dos dimensiones 
		//de elementos de tipo entero
int [][] matriz = new int [3][3];//[Filas][Columnas]
		
		//Asignar valores a la matriz
		
		matriz[0][0]=1;
		matriz[0][1]=2; //[1][2][3]
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5; //[4][5][6]
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=8; //[7][8][9]
		matriz[2][2]=9;
		
		//Declarando una matriz con valores asignados desde un inicio
		int [][] matriz2 ={{1,2,3},{4,5,6},{7,8,9}};
		
		//Como podemos recorrer u obtener los datos y mostrarlos en consola
		System.out.println(matriz2[2][1]);
		
		for (int i = 0; i<3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
	}

	}
}
