package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		//uso de las clases Java File y File Writer
		
		//Vamos a declarar una cadena de texto para
		//escribirla en nuestro archivo de prueba
		String texto = "\nMisael De Leon";

		
		try {
			File archivo = new file ("C:\\Users\\hp\\Documents\\Curso\\Java\\fichero.txt");
			
			//Para escribir info en el archivo utilizamos la clase FileWriter
			FileWriter linea  = new FileWriter(archivo, true);
			//Nuestro objeto linea se contruye  con dos valores
			//la ruta del archivo a sobre escribir y un valor boleano true
			//para indicar que se respete el contenido original del archivo
			//si no lo indicamos, el archivo se sobreescribe por completo
			
			//Indicamos la escritura del String texto en nuestro archivo
			linea.write(texto);
			//Necesitamos otra instruccion que guarde/confirme los cambios
			linea.close();
			
		} catch (Exeption e) {
			System.out.println("No encontre el archivo");
			e.printStackTrace();
		}
		

	}

}
