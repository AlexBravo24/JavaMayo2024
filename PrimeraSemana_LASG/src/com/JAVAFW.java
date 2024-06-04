package com;

import java.io.File;
import java.io.FileWriter;

public class JAVAFW {

	public static void main(String[] args) {
		// Uso de la clases Java File y File writer 
		
		//Vamos a declarar una cadena da texto para escribirla en nuestro 
		//archivo de prueba 
		
		String texto = "\nLuis Alberto";
		 
		try {
			File archivo = new File("C:\\Users\\alber\\Desktop\\fichero.txt");
			
			//para escrinbir info en el archivo utiixamos la clase FileWriter
			FileWriter linea = new FileWriter(archivo, true );
			//nuestro objeto linea se contruye con dos valores, 
			//la ruta del archivo a sobre escribir y un valor booleano true 
			//para indicr que se respete el contenid o original del archivo 
			//si no lo indicamos, el archivo se sobreescribe por coompleto 
			
			//indicamos la escritura del string texto en nuestro archivo
			linea.write(texto);
			//necesitamos otra instruccion que guarde/confirme los cambios
			linea.close();
			
			
		} catch (Exception e) {
		System.out.println("No encontre el archivo");
		e.printStackTrace();
		}

	}

}
