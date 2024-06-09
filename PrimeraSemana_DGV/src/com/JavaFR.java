package com;

import java.io.*;

public class JavaFR {

	public static void main(String[] args) {
		//Uso de las clases File, FileReader
		
		String linea;
		
		try {
			File archivo = new File("C:\\Users\\dguev\\OneDrive\\Escritorio\\fichero.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr);		
			while((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			}
		} catch (Exception e) {
			System.out.println("No se encontró el archivo o no puede ser leído");
		}
	}
}
