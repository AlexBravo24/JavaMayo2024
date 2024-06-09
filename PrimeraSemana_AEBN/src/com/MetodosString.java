package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Metodos o funcionalidades de la clase String
		//Guardamos una cadena de texto ejemplo
		String cadena = "Hoy es miércoles 22 de mayo del 2024";
		//.length() - Devuelve el tamaño en valor entero en nuestra cadena de texto
		
		System.out.println(cadena.length());
		//.charAt() - devuelve el caracter que se encuentra en determinada posicion o indica que le indiquiemos
		System.out.println("Prueba de método .charAt()");
		System.out.println(cadena.charAt(cadena.length()-1));
		
		// .substring ()- nos devuelve una subcadena a partir de indice especifico
		System.out.println("prueba del metodo .subtring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 31));
		//.toLowerCase()/-toUpperCase
		//convierte a minusculas/convierte a mayusculas una cadena de texto
		System.out.println("prueba de método .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("PrUEBA DE método .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		//.equals() - compara el valor de un objeto
		//contra otro, en este caso, de una cadena de texto 
		//contra otra  y devuelve un booleano si es cierto o no
		System.out.println("Prueba de unmétodo equals()");
		System.out.println(cadena.equals("hoy es miercoles 22 de mayo de 2024"));
		//equalsIgnore case _ compara el valor de un objeto
		//contra otro en este caso de una cadena de text
		//contra otra y decuelve un booleano si es cierto o no
		//pero no importando el uso de mayusculas y minusculas
		System.out.println("Prueba de métodos .equalsignorecase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy eS MierCoLeS 22 DE MaYO Del 2024"));
		//.replace() - reemplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println("Prueba de método .replace()");
		System.out.println(cadena.replace("2024", "2029"));
		System.out.println(cadena.replace("o", "$"));
		System.out.println(cadena.replace(" ", ""));
		
	}

}
