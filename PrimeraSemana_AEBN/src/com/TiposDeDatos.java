package com; //nombre del paquete

public class TiposDeDatos { //inicio de la clase

	//comentario de una sola linea
	
	/*
	 * comentarios
	 * de 
	 * multiples 
	 * lineas
	 */
	public static void main(String[] args) {
		//El m�todo main es el punto de entrada o ejecuci�n
		//de una clase principal o clase java 
		//Tipos de datos
		//Tipos de datos primitivos
		//Num�ricos enteros
		byte by;
		 //M�s adelante puedo asignarle un valor
		by = 120;
		
		//Declarar nuestra variable con valores
		//asignar inicialmente
		byte numero1 = -128; // 1 byte - -128 a 127
		short numero2 = 32767; // 2bytes - - 32768 a 32767
		int numero3 = 2147483647; //4 bytes
		long numero4 = 2144836411L; // 8 bytes- requieren el sufijo
		//de la letra "L" para contener valores m�s alla de los tipo int
		int resultado = numero1 + numero2;
		//El tipo de dato comod�n o mas utilizado en los enteros
		//es el tipo dato int
		//TIPOS DE DATOS NUM�RICOS EN COMA FLOTANTE 
		//(Decimales)
		float numero5 = 3.1416F; //4 bytes-Necesitan el sufijo f para almacenar el valor
		double numero6 = 3.14162190321308; //8 bytes 
		//El tipo de dato double es el dato comod�n m�s utilizado
		//para declarar valores decimales
		
		//TIPOS DE DATOS PRIMITIVOS
		boolean evalua = true; //solo admiten valores ture o false
		//sirven para evaluar expresiones o condiciones
		
		char caracter = '&'; //Solo puede almacenar un caracter a la vez
		// entre comilla simple
		
		//TIPOS DE DATO NO PRIMITIVOS
		//TIPO DE DATO OBJETO/ESTRUCTURADOS
		//TIPOS DE DATO WRAPPER
		// Estos tipos de dato son clases , los vamos a identificar
		//Porque el tipo de dato inicia con may�scula
		
		//Cadena de Texto
		String nombre = "Eugenio Nava";
		
		String cadena = "Hola mundo";
		
		String chain;
		//El tipo de dato Sring admite secuencias de caracteres
		//(simbolos, espacios, letras, numeros, etc)
		String numeroTexto = "34";
		
		//Tipos de dato Wrapper o envoltorio
		//Envuelven a los datos primitivos en clases para poder otorgarles
		//ciertos comportamientos o metodos 
		Byte numero11 = 127;

        numero5 = 2.54F;
        numero11.toString(); //Convierte a cadena de texto
        //Integer, short, doyble, float, character, bolean...
        
        //Darle salida a los datos en consola 
        System.out.print("Hola mundo");
        //Un atajo para escribir la linea de impresion en consola mas rapido
       System.out.println();
       
       System.out.println(nombre);
       
       System.out.println(resultado);
       
       System.out.println(5+6);
       System.out.println("La suma es :" + (5+6));
       
       
	}
	
	
} //cierre de la clase
