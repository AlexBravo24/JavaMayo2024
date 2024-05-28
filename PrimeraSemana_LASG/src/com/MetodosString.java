package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Metodos o funcionalidad de la clase string
		//Guardamoas una cadena de texto ejemplo 
		
		String cadena = "Hoy es miercoles 22 de mayo de 2024";
		
		//.length() - devuelve el tamañano en valor entero de
		//de nuestra cadena de texto 
		System.out.println("Prueba de metodo .length()");
		System.out.println(cadena.length()); //35
	
		
		//.chartAt() - devuelve el caracter que se encuentra 
		//en determinada posicion o indice que le indiquemos
		
		System.out.println("Prueba de metodo .chartAt()");
		System.out.println(cadena.charAt(34));
		
		//.substring() - nos devuelve una subcadena a partir
		//del indice especifico
		
		
		System.out.println("Prueba de metodo substring");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 31));
		
		
		//.tolowerCase()/.toUpperCase
		//Covierte a minusculos/Convierte a mayusculas
		//una cadena de texto
		
		System.out.println("Prueba de meotodo .toLoWerCase");
		System.out.println(cadena.toLowerCase());
		System.out.println("Prueba de metodo . toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - compara el valor de un objeto
		//contra otro, en este caso, de una cadena de texto
		//contra otra y vuelve un booleano si es cierto o no 
		
		System.out.println("Prueba de metodo . equals()");
		System.out.println(cadena.contentEquals("Hoy es miercoles 22 de mayo de 2024"));
		
		//equalsignoresCse() - compara el valor de un objeto
		//contra otro, en este caso, de una cadena de texto
		//contra otra y vuelve un booleano si es cierto o no 
		//pero no importa el uso de mayusculas y minusculas.
		
		System.out.println("Prueba de metodo . equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy Es mierCOLes 22 de mayo de 2024"));
		
		//.replace() - reemplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println("Prueba de moteodo .replace()");
		System.out.println(cadena.replace("2024", "2025"));
		System.out.println(cadena.replace("o", "0"));
		System.out.println(cadena.replace(" ", ""));
		
	}
}
