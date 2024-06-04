package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// Metodos o funcionalidades de la clase String
		
		//Guardamos una cadena de texto ejemplo
		String cadena = "Hoy es Miercoles 22 de Mayo de 2024";
		
		System.out.println(cadena);
		
		//.length() - Devuelve el tamaño en valor entero
		//de nuetra cadena de texto
		//int conteo = cadena.length();
		System.out.println("Prueba de metodo .length()");
		System.out.println(cadena.length());
		
		//.charAt() - Devuelve el caracter que se encuentra
		//en determinada posicion o indice que le indiquemos
		//int conteo = cadena.length();
		System.out.println("Prueba de metodo .charAt(2)");
		System.out.println(cadena.charAt(2));
		
		//.substring() - nos devuelve una subcadena a partir 
		//del indice especificado
		System.out.println("Prueba de metodo .substring(4)");
		System.out.println(cadena.substring(4));
		System.out.println("Prueba de metodo .substring(4, 31)");
		System.out.println(cadena.substring(4, 31));

		//.toLowerCase() / .toUpperCase
		//Convierte a minusculas/Convierte a mayusculas
		//una cadena de texto
		System.out.println("Prueba de metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Prueba de metodo .toUpperCase()");
		System.out.println(cadena.toUpperCase());

		//.equals() - compara el valor de un objeto
		//contra otro, en este caso, de una cadena de texto
		//contra otra y devuelve un booleano si es cierto o no
		System.out.println("Prueba de metodo .equals(\"Hoy es martes\"" + ")");
		System.out.println(cadena.equals("Hoy es martes"));

		//.equalsIgnoreCase() - compara el valor de un objeto
		//contra otro, en este caso, de una cadena de texto
		//contra otra y devuelve un booleano si es cierto o no
		//pero no importando el uso de mayusculas o minusculas
		System.out.println("Prueba de metodo .equalsIgnoreCase(\"HoY eS MiErcOlEs 22 de MayO de 2024\"" + ")");
		System.out.println(cadena.equalsIgnoreCase("HoY eS MiErcOlEs 22 de MayO de 2024"));

		//.replace() - reemplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println("Prueba de metodo .replace(\"2024\", \"2029\"" + ")");
		System.out.println(cadena.replace("2024", "2029"));

		System.out.println("Prueba de metodo .replace(\"e\", \"3\"" + ")");
		System.out.println(cadena.replace(" ", ""));

	}

}
