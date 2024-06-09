package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionaledades de la clase String
		//Guardamos una cadena texto ejemplo
		
		String cadena = "Hoy es miercoles 22 de mayo 2024";
		
		//.length de vuelve el tamaño de valor entero 
		//de nuestra cadena de texto 
		//int conteo = cadena.length();
		//System.out.println(conteo);
		System.out.println(cadena.length());
		//.charAt() - devuelve el caracter que se encuentra 
		//en determinada posicion o indice que le indicamos 
		System.out.println("prueba de metodo .charAt()");
		System.out.println(cadena.charAt(34));
		//.substring() - nos de vuelve un una subcadena a partir
		//del inice especificado
		System.out.println("prueba de metodo .subtring");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,31));
		
		////otro metodo
		//.tolowerCase()/.toupperCase
		//Convirte a minisculas /convierte a mayusculas
		//una cadena de texto
		System.out.println("prueba de metodo .toloweCase ()");
		System.out.println(cadena.toLowerCase());
		System.out.println("pueba de metodo.toloUpperCase ");
		System.out.println(cadena.toUpperCase());
		
		//.equals () - compara el valor de un objeto 
		//contra otro , en este caso , de una cadena de texto 
		//contra y devuelve un booleano si es cierto o no 
		System.out.println("prueba de metodo .equals");
		System.out.println(cadena.equals("hoy es miercoles 22 de mayo 2024"));
		
		//.equalsIgnorecase -compara el valor de un objeto 
		//contra otro en este caso , de una cadena de texto 
		//contra otra y devuelve un booleano si es cierto  o no 
		//pero no importa el uso de mayusculas
		System.out.println("prueba del metod .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoy eS Miercoles 22 de mayo de 2024"));
		//.replace ()- remplaza las apariciones de un texto o caracter 
		//con otro que indiquemos 
		System.out.println("prueb de metdo .replace");
		System.out.println(cadena.replace("2024", "2025"));
		System.out.println(cadena.replace("0", "$"));
		System.out.println(cadena.replace("", ""));
	}

}
