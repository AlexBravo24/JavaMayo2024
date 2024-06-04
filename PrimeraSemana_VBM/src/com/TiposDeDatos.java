package com; //nombre del paquete

public class TiposDeDatos { //inicio de la clase
	
	// Comentario de una sola linea
	
	/*
	 * Comentarios
	 * de
	 * multiples
	 * lineas
	 * 
	 */
	
	public static void main(String[] args) {// apertura del metodo main
		//El metodo main es el punto de entrada o ejecucion
		//de una clase proncipal o clase Java
		
		//mail + ctrl + espacio y se genera automaticamente el metodo
		
		//TIPOS DE DATOS
		//TIPOS DE DATOS PRIMITIVOS
		//NUMERICOS ENTEROS
		
		//CTRL + S para guardar los cmabios en el codigo/clase
		
		//Declararlas sin un valor numerico asignado inicialmente
		byte by;
		
		//Mas adelante puedo asignarle un valor
		by = 120;
		
		//Declarar nuestra variables con valores
		//asignados inicialmente
		byte numero1 = -128; //1byte - -128 a 127
		short numero2 =-32768; //2bytes - -32768 a 32767
		int numero3 = 2147483647; //4 bytes
		long numero4= 21474836491L; //8 bytes - requiere el sufijo 
		//de la letra "L" para contener valores mas alla de los tipos int
		
		int resultado = numero1 + numero2; 
		
		//El tipo de dato comodin o mas utilizado en los enteros 
		//es el tipo de dato int
		
		//TIPOS DE DATOS NUMERICOS EN COMA FLOTANTE
		//(DECIMALES)
		float numero5 = 3.1416F;  //4bytes y necesitan el sufijo F
		double numero6 = 3.141655787980; // 8 bytes
		
		//El tipo de datos double es el dato comodin o mas utilizado 
		//para declarar valores decimales
		
		//TIPOS DE DATOS PRIMITIVOS
		//Booleanos
		//Caracter
		
		boolean evalua = true;//Solo admite valores true or false 
		//y sirve para evaluar expresiones o condiciones
		
		char caracter = 'a'; //Solo puede almacenar una caracter a la vez
		//entre comillas simples
		
		
		
		//TIPOS DE DATOS NO PRIMITIVOS 
		//TIPOS DE DATO OBJETO/ESTRUCTURADOS
		//TIPOS DE DATO WRAPPER
		//Estos tipos de dato son clase, los vamos a identificar
		//porque el tipo de dato iniciaa con mayuscula
		
		//Cadena de texto
		String nombre ="Vianey";
		
		String cadena = "Hola mundo";
		
		String chain;
		
		//El tipo de dato String admite secuencias de caracteres 
		//(simbolos, espacios, letras, nuemros, etc)
		String numeroTexto = "34";
		
		
		//Tipos de datos Wrapper o envoltorio
		//Envuelven a los datos primitivos en clases para poder otorgarles 
		//ciertos comportamientos o metodos
		Byte numero11= 127;
		
		numero11.toString(); //Convierte a cadena de texto el valor de mi
		//tipo de dato primitivo
		
		//Interger, Short, Double, Float, Character, Boolean....
		
		//Darle salida a los datos en consola
		System.out.println("Hola mundo");
		
		//Un atajo para escribir linea de impresion en consola
		//mas rapido
		//escribir syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println();
		
		System.out.println(nombre);
		
		System.out.println(resultado);
		
		System.out.println(5+6);
		
		//Cuando queremos mostrar texto y una operacion 
		//Entramos en algo que se conoce como cocatenacion
		
		System.out.println("La suma es: " + (5+6));
	}// cierre del metodo main
	

}//cierre de la clase
