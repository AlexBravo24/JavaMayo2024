package com;

public class TiposDeDatos { //inici de la clase

	// Comentario de una sola linea
	
	/*
	 * Comentarios
	 * de
	 * multiples
	 * lineas
	 */
	public static void main(String[] args) {// apertura del método main
		//El método main es el punto de entrada o ejecución
		//de un clase principal o clase en Java
		
		//TIPOS DE DATOS
		//TIPOS DE DATOS PRIMITIVOS
		//TIPOS DE DATOS ENTEROS
		
		//Declaralas sin un valor númerico asignado inicialmente
		byte by;
		
		//Más adelante puedo asignarle un valor 
		by = 120;
		
		//Declarar nuestras variables con valores
		//asignados inicialmente 
		byte numero1 = -128; //1 byte - -128 a 127
		short numero2 = -32768; //2 bytes - - 32768 a 32767
		int numero3 = 2147483647; //4 bytes
		long numero4 = 21474836411L;// 8 bytes - requieren el sufijo 
		// de la letra "L" para contener valores mas alla de los tipo int
		
		int resultado = numero1 + numero2;
		
		//TIPOS DE DATOS NÚMERICOS ENMCOMA FLOTANTE 
		//(DECIMALES)
		float numero5 = 3.1416F; //4bytes y necesita el sufijo F
		double numero6 = 3.141655787980; //8bytes
		
		//el tipo de dato double es el comodin o más utilizado
		//para declarar valores decimales
		
		//TIPOS DE DATOS PORIMITIVOS 
		//Booleanos
		//Caracter
		
		boolean evalua = true; //solo admiten valores true or false
		//y sirven para evaluar expresiones o condiciones
		
		char caracter = 'a'; //solo puede almacenar un caracter a la vez
		//entre comilla simple
		
		
		//TIPOS DE DATOS NO PRIMITIVOS 
		//TIPOS DE DATOS OBJETO/ESTRUCTURADOS
		//TIPOS DE DATOS WRAPPER
		//Estos tipos de dato son clases, los vamos a identificar
		//porque el tipo de dato inicia con Mayúscula
		
		//Cadena de Texto
		String nombre = "Alvaro Cruz";
		
		String cadena = "Hola Mundo";
		
		String chain;
		
		//El tipo de dato String admite secuencia de caracteres
		//(simbolos, espacios, letras, numeros, etc)
		
		String numeroTexto ="34";
		
		//Tipos de datos Wrapper o envoltorio
		//Evaluen a los datos primitivos en clases para poder otorgarles 
		//ciertos comportamientos o métodos
		
		Byte numero11 = 127;
		
		numero11.toString(); //Convierte a cadena de texto el valor de mi 
		//tipo de dato primitivo
		
		//Integer, short, Double, Float, Character, Boolean...
		
		//Darle salida a los datos en consola
		System.out.println("Hola mundo");

		//un atajo para escribir la linea de impresion en consola
		//más rapido
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		
		System.out.println(nombre);
		System.out.println(5+6);
		
		//cuando queremos mostrar texto y una operacion entramos en algo que 
		//se conoce como concatenación
		System.out.println("La suma es: " + (5+6));
		System.out.println("tu");
		
		
	}
	
	
} //cierre de la clase 
