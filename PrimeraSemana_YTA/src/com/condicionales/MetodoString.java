package com.condicionales;

public class MetodoString {

	public static void main(String[] args) {
		//Métodos o funcionalidades de la clase String
		
				//Guardamos una cadena de texto ejemplo
				String cadena = "Hoy es miercoles 22 de mayo de 2024";
				
				//.length() - devuelve el tamaño en valor entero 
				//de nuestra cadena de texto
				//int conteo = cadena.length();
				System.out.println("Prueba de método .length(");
				System.out.println(cadena.length());

				//.charAt() - devuelve el caracter que se encuentra 
				//en determinada posicion o indice que le indiquemos 
				
			System.out.println("Prueba de método .chartAt()");
			System.out.println(cadena.charAt(34));
			
			//.substring() - nos devuelve una subcadena a partir 
			//del indice especificado
			System.out.println("Prueba de método .subtring");
			System.out.println(cadena.substring(4));
			System.out.println(cadena.substring(4, 31));
			
			//.toLowerCase()/.toUpperCase
			//Convierte a minusculas/Convierte a mayusculas
			//una cadena de texto
			System.out.println("Prueba de método .toLowerCase()");
			System.out.println(cadena.toLowerCase());
			System.out.println("Prueba de método .toUpperaCase()");
			System.out.println(cadena.toUpperCase());
			
			//.equals() - compara el valor de un objeto
			//contra otro, en este caso, de una cadena de texto
			//contra otra y devuelve un booleano si es cierto o no
			System.out.println("Prueba de método .equals()");
			System.out.println(cadena.contentEquals("hoy es miercoles 22 de mayo de 2024"));
			
			//.equalsIgnoreCase() - compara el valor de un objeto
			//contra otro, en este caso, de una cadena de texto
			//contra otra y devuelve un booleano si es cierto o no
			//pero no importando el uso de mayusculas y minusculas
			System.out.println("Prueba de método .equalsIgnoreCase()");
			System.out.println(cadena.equalsIgnoreCase("hoy es miercoles 22 de mayo de 2024"));
			
			
			//.replace() - reemplazar las apariciones de un texto o caracter
			//con otro que indiquemos
			System.out.println("Prueba de método .replace()");
			System.out.println(cadena.replace("2024","2029"));
			System.out.println(cadena.replace("o", "$"));
			System.out.println(cadena.replace(" ", ""));
			
	}
			
			
	

}
