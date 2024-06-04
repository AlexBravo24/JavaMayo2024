package com; //paquete
/*
 * Comentario multil�nea
 * */
// Ctrl + S guarda los cambios


public class TiposDeDatos {

	public static void main(String[] args) {
		//M�todo de entrada o ejecuci�n de una clase en Java
		//Se pueden declarar variables sin valor asignado
		
		byte by;
		by = 120;
		
		//Declarar variables con valores asignados inicialmente
		byte numero1 = 127; //Byte s�lo almacena de -128 a 127 (El 0 cuenta)
		short numero2 = -32768; //La variable short ocupa 2 bytes de memoria -32768 a 32767
		int numero3 = 2147483647; //Ocupa 4 bytes
		long numero4 = 214748364713L; //Ocupa 8 bytes de memoria y requieren el sufijo "L" cuando contendr� valores m�s grandes que int
		//int es el tipo de dato para enteros m�s utilizado
		
		int resultado = numero1 + numero2;
		
		//Tipos de datos en coma flotante (decimales)
		float numero5 = 3.1416F; //Tiene 4 bytes de almacenamiento, necesita el sufijo "F"
		double numero6 = 3.14161417; //Tiene 8 bytes de almacenamiento, no necesita sufijo
		//El dato de tipo double es el mas usado para la declaraci�n de decimales
		
		//Tipos de datos primitivos
		boolean evalua = true; //Estos admiten true o false
		char character = '@'; //S�lo puede almacenar un caracter a la vez entre comillas simples
		
		//TIPOS DE DATOS NO PRIMITIVOS
		//TIPOS DE DATO OBJETO/ESTRUCTURADOS
		//Estos tipos de dato son clases, los vamos a identificar porque el tipo de dato inicia con may�scula
		
		//Cadena de texto
		String nombre = "Esta es una cadena de texto";
		String cadena = "Hola mundo";
		//El tipo de dato String admite secuencias de caracteres
		
		
		//Tipos de dato wrapped
		//Envuelven los datos primitivos en clases para otorgarles ciertos m�todos
		Byte numero7 = 127;
		numero7.doubleValue();
		
		//Atajos para esta instrucci�n pueden ser
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println(numero7);
	}
	
}
