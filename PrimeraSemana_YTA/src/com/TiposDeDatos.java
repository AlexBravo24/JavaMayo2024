package com; //nombre del paquete 

public class TiposDeDatos { //inicio de la clase

    // Comentario de una sola linea
	
     /*
      * Comentarios
      * de 
      * multiples 
      * lineas	
      */


public static void main(String[] args) {//apertura del metodo main
    //El metodo main es el punto de entrada o ejecucion 
	// de una clase principal o clase Java
    
	//main + crtl + espacio y se genera automaticamnete el metodo 
	//TIPOS DE DATOS
	//TIPOS DE DATOS PRIMITIVOS
	//NUMERICOS ENTEROS 
	// CTRL + S para guardar los cambios en el codigo/clase
    
	//Declararlas sin un valor numerico asignado inicialmente 
	byte by;
	
	//Más adelante puedo asignarle un valor
	by = 120;
	
	//Declarar nuestras variables con valores 
	//asignados inicialmente
	byte numero1 = -128; //1 byte - -128 a 127
	short numero2 = -32768; //2bytes - -32768 a 32767
	int numero3 = 2147483647; //4bytes
	long numero4 = 2147483649L; // 8 bytes - requieren el subgijo
	//de la letra "L" para contener valores más alla de los tipo int 
	
	int resultado = numero1 + numero2;
	
	//El tipo de dato comodin o más utilizado en los enteros 
	//es el tipo da dato int 
	
	//TIPOS DE DATOS NUMERICOS EN COMA FLOTANTE
	//(DECIMALES)
	float numero5 = 3.1416F; // 4bytes y necesitan el subfijo "F"
	double numero6 = 3.141655787980; //8bytes
	
	//El tipo de dato double es el dato comodiin o más utilizado
	//para declarar valores decimales
	
	//TIPOS DE DATOS PRIMITIVOS
	//Booleanos
	//Caracter
	
	boolean evalua = true;//Solo admiten valores true or false
	//y sirven para evaluar expresiones o condiciones
	
	char caracter = 'a'; //Solo puede almacenar un caracter a la vaz
	//entre comilla simple 
	
	
	//TIPOS DE DATOS NO PRIMITIVOS
	//TIPOS DE DATO OBJETO/ESTRUCTURADOS
	//TIPOS DE DATOS WRAPPER
	//Estos tipos de dato son clases, los vamos a identificar
	//porque el tipo de dato inicia con Mayuscula
	
	//Cadena de texto
	String nombre  = "Yair Toledo";
	
	String cadena = "Hola mundo";
	
	String chain;
	
	//El tipo de dato String admite secuencias de caracteres
	//(simbolos, espacios, letras, numeros, etc)
	String numeroTexto = "34";
	
	
	//Tipos de dato Wrapper o envoltorio
	//Envuelven a los datos primitivos en clases para otorgarles 
	//ciertos comportamientos o metodos
	Byte numero11 = 127;
	
	numero11.toString(); //convierte a cadena de texto el valor de mi
	//tipo de dato primitivo
	
	//Interger, Short, Double, Float, Character, Boolean....
	
	//Darle salida a los datos en consola 
	System.out.println("Hola Mundo");
	
	//Un atajo para escribir la linea de impresion en consola
	//más rapido
	//syso + ctrl + espacio
	//sout + crtl + espacio
	System.out.println();
	
	System.out.println(nombre);
	
	System.out.println(resultado);
	
	System.out.println(5+6);
	
	//Cuando queremos mostrar texto y una operación
	//Entramos en algo que se conoce como concatenación
	System.out.println("La suma es: " + (5+6));
	
}// cierre del metedo main


}// cierre de clase 
