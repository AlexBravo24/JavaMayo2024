package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Hacer uso de clases File y FileWriter 
		
		//Vamos a delcarar una cadena de texto para excribirla en nuestro archivo
		String texto = "\nKikimora"; //El salto de linea se puede indicar con \n
		try {
			File archivo = new File("C:\\Users\\Angelica\\Desktop\\fichero.txt");
			//PAra escribir info en el archivo utilizamos la clase FileWriter 
			
			FileWriter linea = new FileWriter(archivo,true); //Aqui nos pregunta sobre quien vamos a escribir
			//Al agregar el valor booleano TRUE permite que se mantenga
			//toda la demas información del archivo de texto.
			
			//Ahora indicamos la escritura del string texto
			linea.write (texto);
			
			//Necesitamos otra instrucción que guarde la información 
			linea.close();
			
		} catch (Exception e) {
			System.out.println("No se encontro archivo");
		

	}
	}
}
