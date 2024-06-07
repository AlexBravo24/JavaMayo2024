package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Uso de las clases File,FileReader y BufferedReader
		
		//Hay que leerlo
		
		String linea;  //Traer la información a la variable
		//En ocaciones cuando se necesitan convertir tipos de datos o comunicarnos
		//con un programa o archivo externo, pueden 
		//ocurrir errores que no esten en nuestras manos.
		
		try {//Intenta ejecutar el siguiente bloque de codigo
			//Usamos la clase file para ubicar nuestro archivo 
			
			File archivo = new File ("C:\\Users\\Angelica\\Desktop\\fichero.txt");
			
			//Ahora usamos FileReader para prepararlo en modo lectura
			
			FileReader fr = new FileReader (archivo);
			
			//Ya podemos leerlo
			
			BufferedReader buffer = new BufferedReader(fr);
			
			//Vamos a leer la info de la linea de nuestro archivo
			//Guardandola en nuestro string linea
			
			while((linea = buffer.readLine()) !=null){
				
			System.out.println(linea);
			}
		} catch (Exception e) {//Pero si algo falla aqui se atrapa el fallo
			//o exepción y ejecutamos lo indicado en el bloque,
			// TODO: handle exception
			System.out.println("No se encontro el archivo");
			//Ahora traeremos e que nos permitiria saber donde 
			//esta el error
			e.printStackTrace();
		}
	}

}
