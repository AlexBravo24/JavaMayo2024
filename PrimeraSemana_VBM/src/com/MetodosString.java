package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos o funcionalidades de la clase String
		
		//Guardamos una cadena de texto ejempki
		String cadena = "Hoy es Miercoles 22 de Mayo de 2024";
				
		//.length()-Devuelve el tamaño en valor entero
		//de muestra cadena de texto
		//int conteo = cadena.length();
		System.out.println("Prueba de metodo.length");
		System.out.println(cadena.length()); //35
		
		//Metodo.charAt() - devuelve el caracter que se encuentra 
		//en determinada posiciòn o indice que le indiquemos
		System.out.println("Prueba de metodo .charAt ()");
		System.out.println(cadena.charAt(34));
		
		//.substring() - nos devuelve una subcadena a partir 
		//del indice especificado
		System.out.println("Prueba de metodo .subtring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 31));
		
		//Metodo .toLowerCase ()/.toUpperCase
		//Convierte a minusculas / Convierte a mayusculas
		//una cadena de texto
		System.out.println("Prueba de metodo .toLowerCase ()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Prueba de metodo .toUpperCase ()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - compara el valor de un objeto contra oto
		//en este casi, de una cadena de texto
		//contra otra y devuelve un booleano si es cierto o no
		
		System.out.println("Prueba de metodo .equals()");
		System.out.println(cadena.equals("Hoy es Miercoles 22 de Mayo 2024"));

		
		//Metodo.equalsIgnoreCase - compara el valor de un objeto
		//contra otro, en este caso, de una cadena de texto
		//contra otra y devuelve un booleano si es cierto o no
		//pero no importando el uso de mayusculas y minusculas
		System.out.println("Prueba de metodo .equalsIgnoreCase()");
		System.out.println(cadena.equals("HoY es MiERrcoleE 22 de Mayo 2024"));
		
		//.REPLACE() - reemplazar las apariciones de un tecto o caracter
		//con otro que indiquemos
		System.out.println("Prueba de metodo.replace()");
		System.out.println(cadena.replace("2024", "2029"));
		System.out.println(cadena.replace("o","$"));
		System.out.println(cadena.replace(" ", ""));
		
		
	}

}
