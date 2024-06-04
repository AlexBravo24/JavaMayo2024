package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Matriz: Array bidimensiona
		//Se tienen dos dimensiones para almacenazr valores, 
		//Lo que nos hace pasar a un concepto de tabla.
		//Existen entonces filas y columnas
		
		
	    //Ejemplo array de 2D de tipo entero
		
		int[][] matriz = new int [3][3]; //AQUI LAS POSICIONES SON [FILA][COLUMNA]
        
		//Asignando valores a la matriz
		
		matriz[0][0]= 1;
		matriz[0][1]= 2;  //[1][2][3]
		matriz[0][2]= 3;


		matriz[1][0]= 4;
		matriz[1][1]= 5;  //[4][5][6]
		matriz[1][2]= 6;
		
		matriz[2][0]= 7;
		matriz[2][1]= 8;  //[7][8][9]
		matriz[2][2]= 9;
		
		//Declarando una matriz con valores asignados desde un inicio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}}; //En cada llave tenemos los valores de una fila
		
		//Para recorrer esta matriz necesitamos dos ciclos for anidados
		//Uno itera sobre filas y otro sobre columnas
		
		System.out.println(matriz);
		
		for (int i = 0; i <3; i++) { //FILAS
			System.out.println();
			for (int j = 0; j < 3; j++) { //Columnas
				System.out.print(matriz[i][j] + " " ); //Imprime valores de una sola sola linea de corrido
				
			}
		}
		//
	}

}
