package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de las clases JavaFile Y Writer
		//Vamos a declarar una cadena de texto 
		//para escribirla en nuestro archivo de prueba
		
		
		String texto = "\nJulio Samperio";
		
		try {
			File archivo = new File ("C:\\Users\\jcsam\\OneDrive\\Escritorio\\prueba.txt");
		//PAra escribir info en el archivo utilizamos la clase File Writer
		FileWriter linea = new FileWriter(archivo, true);
		//La ruta del archivo sobreescribir y un valor booleano true
		//para indicar que se respete el contenido original del archivo
		// si no lo indicamos, el archivo se sobreescribe por completo
		
		//Indicamos la escritura del String texto en nuestro archuivo 
		linea.write(texto);
		//Necesitamos otra instruccion que guarde los cambios
		linea.close();
		
		} catch (Exception e) {
			System.out.println("NO se encontro el archivo");
		e.printStackTrace();
		}
		
	}

}
