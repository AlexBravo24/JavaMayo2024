package com; //nombre del paquete

public class TiposDeDatos { //inicio de la clase

	/*comentarios
	 * de
	 * multple 
	 * linea 
	 */
	
	public static void main(String[] args) {  //para ponerlo rapido se usa main + cTRl + barra de espacio
		
		//el metodo main es el putno de entrada o ejecucion 
		//de una clase principal o clase java
		
		//TIPOS DE DATOS
		//TIPOS DE DATOS PRIMITIVOS
		//NUMEROS ENTEROS
		//ctrl + s para guardar los cambios del codigo 
		
		
		//se puede declarar una variable sin un valor numerico asignado inicialmente
		byte by;
		
		//mas adelante se puede asignar el valor 
		
		by = 120;
		// declarar variables con valores asignados inicialmente 
		
		///byte numero1 =128; //1 byte -128 a 127 
		//short numero2 = 32768; //2 bytes -32768 a 32767
		int numero3 = 2147483647; //4 bytes —2 147 483 648 a 2 147 483 647
		long numero4 = 2147483644L; //8 bytes, requiere el sufijo "L" para contener mas 
		// alla de los tipo int 
		
		//int resultado = numero1 + numero2;
		
		//el tipo de dato mas utilizado en los enteros es el int 
		
		//TIPOS DE DATO DE PUNTO FLOTANTE 
		
		float numero5 = 3.1416F; //4 bytes y necesita el sufijo "F"
		double numero6 = 3.1416; //8 bytes 	
		
		//el double es el dato mas utilizado en valores decimales
		
		//DATOS PRIMITIVOS 
		
		//Booleanos 
		//Caracter 
		
		boolean evalua = true; //solo admiten valres true o false 
		//sirven para evaluar expresiones o condiciones
		
		char caracter = '#'; //solo puede almacenar un caracter entre comilla simple. 
		
		
		//TIPO DE DATOS NO PRIMITIVOS
		//TIPOS DE DATO OBJETO/ESTRUCTURADO
		//TIPOS DE DATOS WRAPPER
		//Estos tipos de datos son clases, los vamos  a clasificar 
		//porque el tipo de datos incia con mayuscula.
		
		//Cadena de texto
		
		String nombre = "hola mundo";
		String cadena = "Help";
		// el tipo de dato spring admite secuencias de caracateres
		//(simbolos, espacios, letras, numeros, etc
		
		
		//Tipos de datos Wrapper o envoltorio 
		//Envuelven a los datos primitivos en clases para poder otorgarles 
		//ciertos comportamientos o metodos.
		Byte numero11 = 127; 
		
		//numero5 = 2.54F;
		numero11.toString(); //covierte a cadena de texto el valor de mi tipo de dato primitivo
		// Inter, Short, Double, Float, Caracter, Boolean...
		
		//DARLE SALIDA A LOS DATOS EN CONSOLA
		
		System.out.println("Hi world"); 
		
		//un atajo para escribir el comando de impresion 
		//syso + ctrl + espacio
		//sout * crtl + esoacio 
		
		
		
		
		
				
	}
	
	
} //cierre de la clase 
