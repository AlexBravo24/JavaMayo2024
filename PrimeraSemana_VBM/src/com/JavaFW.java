package com;

import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//
		//
		String texto = "\nVianey Beltran";
		
		try {
			File archivo = new File("C:\\Users\\vianey\\OneDrive\\Escritorio\\fichero.txt");
			
			//Para escribir info en el archivo utilizamos la clase FileWriter
			FileWriter linea = new FileWriter(archivo, true);
			//Nuestro objeto linea se construye con dos valores;
			//la ruta del archivo sobre escribir y un valor booleano true
			//para indicar que se respete el contenido original del archivo
			//si no lo indicamos, el archivo se sobreescribe por completo
			
			//indicamos la escritura del String texto nuestro archivo
			linea.write(texto);
			//necesitamos otra instruccion que guarde / o confirme los cambios
			linea.close();
		}catch (Exception e) {
			System.out.println("No encontre el archivo");
			e.printStackTrace();
		}

	}

}
