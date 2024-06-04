package com;

public class MetodosString {

	public static void main(String[] args) {
		// METODOS O FUNCIONALIDADES DE LA CLASE STRING
		
		//Guardamos una cadena de texto ejemplo
		String cadena = "Hoy es miercoles 22 de mayo del 2024";
		
//		//.length () devuelve el tamaño en valor entero de nuestra cadena de texto
//		int conteo = cadena.length() ;
//		System.out.println(conteo);
//		System.out.println(cadena.length());
//	}
       //.charAr () - devuelve el caracter que se encuentra en 
	   //determinada posicion o indice
	//   System.out.println(cadena.charAt(2));
		//substring () nos devuelve una cadena despues del indice 
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 27));
	  //.toLowerCase() / .toUpperCase()
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
      //.equals() Compara el valor de un objeto comtra otro 
	 //devolviendo un booleano
		System.out.println(cadena.contentEquals("Hoy es miercoles 22 de mayo del 2024"));//toma en cuenta minusculas y mayusculas
		System.out.println(cadena.equalsIgnoreCase("Hoy es miercoles "));//este ignora mayusculas y minusculas
	//.replace reemplaza los caracteres con otro que indiquemos
		System.out.println(cadena.replace("2024", "2019"));
		System.out.println(cadena.replace(cadena, "HELLOU"));
}
}