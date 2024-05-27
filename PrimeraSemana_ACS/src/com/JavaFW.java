package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de las clases Java File y File Writer
		
		//Vamos a declarar una cadena de texto para
		//escribirla en nuestro archivo de prueba
		
		String texto = "\nAlvaro Cz";
		
		try {
			File archivo = new File("C:\\Users\\korfirio\\Desktop\\fichero.txt");
			
			//Para escribir info en el archivo utilizamos FileWriter
			FileWriter linea = new FileWriter(archivo, true);
			//Nuestro objeto linea linea se construye con dos valores,
			//La ruta del archivo a sobre escribir y un valor booleano true 
			//para indicar que se respete el contenido original del archivo
			//si no lo indicamos, el archivo no se sobreescribe por completo
			
			//Indicamos la escritura del String texto en nuestro archivo
			linea.write(texto);
			//necesitamos otra instrucción que guarde los cambios
			linea.close();
			
			
		} catch (Exception e) {
			System.out.println("No encontre el archivo");
			e.printStackTrace();
		}
		

	}

}
