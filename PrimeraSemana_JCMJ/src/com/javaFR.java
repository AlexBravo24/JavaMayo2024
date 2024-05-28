package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class javaFR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String linea;		
			try {
				File archivo = new File ("C:\\Users\\Juan\\Desktop\\fichero.txt");
				FileReader fr = new FileReader(archivo);
				//modo lectura usamos lacase buf
				BufferedReader buffer = new BufferedReader(fr);
				linea = buffer.readLine();
				System.out.println(linea);
			} catch (Exception e) {
				System.out.println("nose encontro el archivo ");
				// TODO: handle exception
			}
	}

}
