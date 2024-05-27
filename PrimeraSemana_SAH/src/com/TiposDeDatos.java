package com; //nombre del paquete

public class TiposDeDatos { //inicio de la clase

	//Comentario de una sola linea

	/*
	 * Comentarios 
	 * de 
	 * multiples 
	 * lineas
	 * 
	 */
	
	public static void main(String[] args) {//Apertura del m�todo main
		//El metodo main es el punto de entrada o ejecuci�n
		//de una clase principal o clase java
		
		//main + ctrl + espacio y se genera automaticamente el m�todo
		
		//TIPOS DE DATOS
		//TIPOS DE DATOS PRIMITIVOS
		//NUM�RICOS ENTEROS
		
		//CTRL + S para guardar los cambios en el c�digo/clase
		
		//Declararlas sin un valor num�rico asignado inicialmente 
		byte by;
		
		//M�s adelante puedo asignarle un valor
		by = 120; 
		
		//Declarar nuestras variables con valores
		//asignados inicialmente 
		byte numero1 = -128; //1 byte - -128 a 127
		short numero2 = 30000;//2bytes - -32768 a 32767
		int numero3 = 2147483647;//4 bytes
		long numero4 =2147483649L; //8 bytes - requieren el sufijo
		//de la letra "L" para contener vlaores m�s alla de los tipo int
		
		int resultado = numero1 + numero2;
		
		//El tipo de dato comod�n o m�s utilizado en los enteros
		//es el tipo de dato int
	 
		//TIPOS DE DATOS NUM�RICOS EN COMA FLOTANTE
		//(DECIMALES)
		float numero5 = 3.1416F; //4bytes y necesitan el sufijo F 
		double numero6 = 3.141655787980; //8 bytes
		
		//El tipo de dato double es el dato comod�n o m�s utilizado
		//para declarar valores decimales 
		
		
		//TIPOS DE DATOS PRIMITIVOS
		//Booleanos
		//Caracter
		
		boolean evalua = true;//Solo admiten valores true o false
		//y sirven para evaluar expresiones o condiciones 
		
		char caracter = 'a';//Solo puede almacenar un caracter a la vez
		//entre comilla simple
		
		
		//TIPOS DE DATOS NO PRIMITIVOS 
		//TIPOS DE DATO OBJETO/ESTRUCTURADOS
		//TIPOS DE DATO WRAPPER
		//Estos tipos de dato son clases, los vamos a identificar 
		//porque el tipo de dato inicia con May�scula
		
		//Cadena de Texto 
		String nombre = "Sergio Alarc�n"; 
		
		String cadena = "Hola mundo";
		
		String chain; 
		
		//El tipo de dato String admite secuencias de caracteres 
		//(simbolos, espacios, letras, numeros, etc)
		String numeroTexto = "34"; 
		
		
		//Tipos de datos Wrapper o envoltorio
		//Envuelven a los datos primitivos en clases para poder otorgarles
		//ciertos comportamientos o m�todos
		Byte numero11 = 127;
		
		numero11.toString(); //Convierte a cadena de texto el valor de mi 
		//tipo de dato primitivo
		
		//Integer, Short , Double, Float, Character, Boolean....
		
		//Darle salida a los datos en consola
		System.out.println("Hola mundo");
		
		//Un atajo para escribir la linea de impresion en consola 
		//m�s rapido
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println();
		
		System.out.println(nombre);
		
		System.out.println(resultado);
		
		System.out.println(5+6);
		
		//Cuando queremos mostrar texto y una operaci�n 
		//Entramos en algo que se conoce como concatenaci�n
		System.out.println("La suma es: " + (5+6));
		
		
	}// cierre del m�todo main
	
	  
}// cierre de la clase