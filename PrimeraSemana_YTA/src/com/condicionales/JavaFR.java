package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		//Uso de la clases Fila, FileReader y BifferredReader
		
		//intentaremos leer la linea de texto de nuestro archivo
		//de prueba
		boolean linea; 
		
		//En ocaciones cuando necesitamos convertir tipos de dato
		//comunicarnos con un programa o archivo externo
		//pueden ocurrir errores que no esten en nuestra mano
		
		try {//intentar ejecutar el sig bloque de codigo
			//Usamos la clase File pata ubicar nuestro archivo
			File archivo = new File("C:\\Users\\pc-1\\Desktop\\fichero.txt");
			//Ya que tenemos ubicado el archivo, usamos a la clase FileReader
			//para prepararlo en modo lectura
			FileReader fr = new FileReader (archivo);
			//Ya que esta en el modo lectura, usamos la clase BufferredReader
			BufferedReader buffer = new BufferedReader(fr);
			
			//Vamos a leer la info de la linea de nuestro archivo
			//y la guardamos en nuestro String linea
			while (linea = buffer.readLine() != null)  {
			
			System.out.println(linea);
			}
			
		} catch (Exception e) {//pero si algo falla, aqui se atrapa
			//el posible fallo o execpcion
			//y ejecutamos lo que se indique en este bloque
			System.out.println("No se encontro el archivo");
		}
		

	}

}
