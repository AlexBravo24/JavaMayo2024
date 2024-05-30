package com; //nombre del paquete

public class TiposDeDatos { //Inicio de la clase
	
	//Comentario en una sola linea
	
	/*
	 * comentarios
	 * de 
	 * multiples
	 * lineas
	 * 
	 */
	
	public static void main(String[] args) { //apertura del metodo main
		//Es el metodo main es el punto de entrada o ejecocuión
		//de una clase principal o clase java
		
		//main + ctrl + espacio y se genera automaticamente el metodo
		
		//TIPOS DE DATOS
		//TIPOS DE DATOS PRIMITIVOS
		//NUMERICOS ENTEROS
		
		//CTRL + S para guardar los cambios en el codigo/clase
		
		//Declararlas sin un valor numerico inicialmente
		//byte = by;
		
		//Mas adelante puedo asignarle un valor
		//by = 120;
		
		//Delclarar nuestras variables con valores
		//asignados inicialmente
		byte numero1 = 127; //1 byte - -128 a 127
		short numero2 = 30000; //2 bytes - -32768 a 32767
		int numero3 = 2147483647; //4 bytes
		long numero4 = 2147483649L; //8 bytes requieren el sufijo "L" para contener valores mas alla de los tipo int
		
		int resultado = numero1 + numero2;
		
		//El tipo de dato comodin o mas utilizado en los enteros
		//es el tipo de datos int
		
		//TIPOS DE DATOS NUMERICOS EN COMA FLOTANTE
		//DECIMALES
		
		float numero5 = 3.1416F; //4 byetes y necesitan el sufijo "F" para almacenar el valor
		double numero6 = 3.141655787980; //8 bytes
		
		//El tio de dato double es el dato comodin o mas utilizado
		//para declarar valores decimales
		
		//TIPOS DE DATOS PRIMITIVOS
		//Booleanos
		//Caracter
		
		boolean evalua = true; //Solo admiten valores true o false
		//y sirven para evlauar expresiones o condiciones
		
		//char caracter = ''; //solo puede almacenar un caracter a la vez entre comilla simple
		
		
		//TIPOS DE DATOS NO PRIMITIVOS
		//TIPOS DE DATO OBJETO/ESTRUCTURADOS
		//TIPOS DE DATO WRAPPER
		//Estos tipos de dato son clases, los vamos a identificar
		//porque el tipo de dato inicia con Mayuscula
		
		//Cadena de texto
		String nombre = "Misael de Leon";
		
		String cadena = "Hoa mundo";
		
		String chain;
		
		//El tipo de dato String admite secuencias de caracteres
		//(Simbolos, espacios, numeros, etc)
		String numeroTexto = "34";
		
		
		//Tipos de dato Wrapper o envoltorio
		//Envuelven a los datos primitivos en clases para poder otorgarles
		//ciertos comportamientos o metodos
		Byte numero11 = 127;
		
		numero11.toString(); //Convierte a cadena de texto al valor de mi tipo de dato primitivo.
		
		// Integer, Short, Double, Float, Character, Boolean, ...
		
		// Darle salida a los datos en consola
		System.out.println("Hola Mundo");
		
		//Un atajo para escribir la linea de impresion en consola mas raipdo
		// syso + CTRL + ESPACIO
		// sout + CTRL + ESPACIO
		System.out.println();
		
		System.out.println(nombre);
		
		System.out.println(resultado);
		
		System.out.println(5+6);
		
		System.out.println("La suma es: " + (5+6));
		
	} //cierre del metodo main

} //cierre de la clase
