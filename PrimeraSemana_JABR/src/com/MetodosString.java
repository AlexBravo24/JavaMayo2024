package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//M�todos o funcionalidades de la clase String
		
		//Guardamos una cadena de texto ejemplo
		String cadena = "Hoy es Miercoles 22 de Mayo de 2024";
		
		//.length() - devuelve el tama�o en valor entero
		//de nuestra cadena de texto
		//int conteo = cadena.length();
		System.out.println("Prueba de m�todo .length()");
		System.out.println(cadena.length()); //35
		
		//.charAt() - devuelve el caracter que se encuentra
		//en determinada posicion o indice que le indiquemos
		System.out.println("Prueba de m�todo .charAt()");
		System.out.println(cadena.charAt(34));
		
		//.substring() - nos devuelve una subcadena a partir
		//del indice especificado
		System.out.println("Prueba de m�todo .subtring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 31));
		
		//.toLowerCase()/.toUpperCase
		//Convierte a minusculas/Convierte a mayusculas
		//una cadena de texto
		System.out.println("Prueba de m�todo .toLoWerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Prueba de m�todo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - compara el valor de un objeto
		//contra otro, en este caso, de una cadena de texto
		//contra otra y devuelve un booleano si es cierto o no
		System.out.println("Prueba de m�todo .equals()");
		System.out.println(cadena.equals("Hoy es Miercoles 22 de Mayo de 2024"));
		
		//.equalsIgnoreCase - compara el valor de un objeto
		//contra otro, en este caso, de una cadena de texto
		//contra otra y devuelve un booleano si es cierto o no
		//pero no importando el uso de mayusculas y minusculas
		System.out.println("Prueba de m�todo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("HoY eS MiErcOlEs 22 de MayO de 2024"));
		
		//.replace() - reemplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println("Prueba de m�todo .replace()");
		System.out.println(cadena.replace("2024", "2029"));
		System.out.println(cadena.replace("o", "$"));
		System.out.println(cadena.replace(" ", ""));
		
		

	}

}
