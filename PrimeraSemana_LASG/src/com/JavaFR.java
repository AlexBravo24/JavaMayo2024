package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferReader
		
		//Intentaremos leer la linea de texto de nuestro archivo de prueba
		
		String linea;
		
		//En ocuaciones cuando necesitamos convertir tipos de datos 
		//o comuniicacarnos con un programa o archivo externo
		//pueden ocurrir errores que no esten en nuestras manos 
		
		try {//intenta ejecuetar el siguiente bloque de configo
			//usamos la clase File para ubicar nuestro archivo
		File archivo = new File("C:\\Users\\alber\\Desktop\\fichero.txt");
		//para prepara en modo lectura 
		FileReader fr = new FileReader(archivo);
		//ya ue esta en modo lectura, usamos la clase BufferReader
		BufferedReader buffer = new BufferedReader (fr);
		//vamos a leer la info de la linea de nuestro archivo
		//y la guardmos en nuestro string linea 
		
		
		while ((linea = buffer.readLine()) !=null) {
		
		System.out.println(linea);
		}
		
		
		
				
					
		} catch (Exception e) {//pero si algo falla, aqui se atra el posible fallo o excepcion 
		
			// y ejecutamos lo que se indique en este  bloque 
		}

	}

}
