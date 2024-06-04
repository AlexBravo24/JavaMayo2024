package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase String 
		//	Guardamos una cadena de texto ejemplo
		
		String cadena = "Hoy es Miercoles 22 de Mayo de 2024";
		//int conteo;
		
		// 	.length() - devuelve el tamano en el valor entero de nuestra cadena
		
		int conteo = cadena.length();
		//System.out.println(conteo);
		
		System.out.println(cadena.length());
		
		//	.charAt()	devuelve el caracter que se encuentra en determinada posicion o indice que indiquemos
		System.out.println("Prueba de metodo .charAt()");
		System.out.println(cadena.charAt(34));
		
		System.out.println("Prueba de metodo .subString");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,31));
		
		
		// .toLowerCase() - convierte la cadena en minusculas
		//	
		System.out.println("Prueba de metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Prueba de metodo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		System.out.println("Prueba de metodo .equals");
		System.out.println(cadena.equals("hoy es miercoles"));
		
		System.out.println("Prueba de metodo .equals");
		System.out.println(cadena.equalsIgnoreCase("Hoy es miercoles 22 de mayo de 2024"));
		
		System.out.println("Prueba de metodo .replace()");
		System.out.println(cadena.replace("2024","2029"));
		System.out.println(cadena.replace("o","$"));
		System.out.println(cadena.replace(" ",""));
		
	}
	

}
