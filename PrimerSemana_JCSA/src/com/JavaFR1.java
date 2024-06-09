package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR1 {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader, BufferedReader
		// Intentaremos leer la linea de texto de nuestro archivo de prueba
		
		String linea;
		
		//En ocasiones cuando necesitamos convertir tipos de datos
		//o comunicarnos con un programa o archivo externo
		//pueden ocurrir errores que no esten en nuestras manos
		
		// Intenta ejecutar el siguiente bloque de codigo pero si algo falla se atrapa en el catch 
		
		try {
			
			//Usamos la Clase File para ubicar nuestro archivo
			File archivo = new File ("C:\\Users\\jcsam\\OneDrive\\Escritorio\\prueba.txt");
			
			//Ya que tenemos ubicado el archivo 
			//Usamos la Clase FileReader para prepararlo en modo lectura 
			FileReader fr = new FileReader (archivo);
		
			//Ya que esta en modo lectura, usamos la clase BufferedReader()
			BufferedReader  buffer = new BufferedReader(fr);
			
			//Vamos a leer la informacion de la linea de nuestro archivo
			//y la guardamos en nuestro String linea
			while ((linea = buffer.readLine()) != null){
			System.out.println(linea);
			}
			
		} catch (Exception e) {		
			//Si algo falla aqui se atrapa el posible fallo o exepcion 
			//y ejecutamos lo que indique en este bloque 
			e.printStackTrace();		// Este metodo imprime en consola la traza de error
			System.out.println("No se encontro el archivo");
		}

	}

}
