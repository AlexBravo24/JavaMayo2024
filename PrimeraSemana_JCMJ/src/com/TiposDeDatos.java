package com;//nombre del paquete 

public class TiposDeDatos {//inicio de la clase 
	
	//comentario de una sola linea 
		
	public static void main(String [] args) {//metodo main apertura del metodo main 
		
		// el metodo main es el punto de entrada o ejecución
		//de una calse principal o clase java 
		
		//main + ctrl + espacio y se genera automaticamente el metodo 
		
		// dentro de main se declarar los tipos de datos 
		
		//TIPOS DE DATOS 
		//TIPOS DE DATOS PRIMITIVOS 
		//NUMERICOS ENTEROS 
		//CTRL + S PARA GUARDAR LOS CAMBIOS EN ELCODIGO / CLASE 
		//Declarar sin un valor numerico asignado inicialmete 
		byte by;
		//Más adelante puedo asignar un valor
		by = 120;
		//Declarar nuestras variables con valores 
		//asignados inicialmte  
		byte numero1 = -128;  // 1 byte -128 a 127
		short numero2 = -32768; //2  byte -32768 a 32767
		int numero3 = 2147483647; // 4 bytes
		long numero4 = 21474836479l; // 8 bytes - Requieren el sufijo 
		//de la letra "L" para contener valores más alla de los tipos  int 
		//El tipo de dato comodin  o mas utilizado en los enteros 
		//es el tipo  de dato  int 
		//TIPOS DE DATOS NUMERICOS EN COMA FLOTANTE  
		//(Decimales )
		float numero5 = 5.1416f; // 4 bytes y necesitan el sufijo F 
		double numero6 = 3.1416; // 8 bytes
		//el tipo  de dato double  es el dato comodin o más utilizado  
		//para declarar valores  decimales  
		
		//TIPOS DE DATOS PRIMITIVOS 
		//BOOLEAN
		//CARACTER 
		boolean evalua = true; //solo se admiten valores true or false
		//y sirven para evaluar expresiones o condiciones 
		char caracter = 'a';// solo almacana carcter 
		//---------------------------/----------------------------------------
		//TIPO DE DATOS NO PRIMITIVOS 
		//TIPO  DE DATO OBJETO /ESTRUCTURAS 
		//TIPOS  DE DATOS WRAPPER 
		
		String nombre = "juan";
		String cadena = "hola mundo ";
		String chain;
				
		System.out.println("hola mundo");
		System.out.println("juan");
		
		for (int i = 0; i < args.length; i++) {
			
			
		}
		
		
		
		
	}//cierre del metodo main 

}//cierre de la clase 
