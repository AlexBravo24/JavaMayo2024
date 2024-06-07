package com;

public class TiposDeDatos {


public static void	main (String [] args) { //Apertura del método main
	//ejecutar una salida de datos o impresión en consola "METODO MAIN"
	//El método main es el punto de entrada o ejecución 
	//de una clase principal o clase Java
	//main + ctrl + espacio
	
	//TIPOS DE DATOS PRIMITIVOS
	//NUMÉRICOS ENTEROS 
	
	//Formas de declarar variables:
	  // Sin un valor númerico asignado incialmente 
	byte by; 
	
	  //Más adelante se le asigna un valor
	by = 120;
	 
	  //Asignar el valor desde el inicio
	byte numero1 = -128; //-128 to 127
	short numero2 = 32767; // T:2bytes 
	int numero3 = 2147483647; //T:4bytes 
	long numero4= 2147483649L; //T_8bytes. Los datos tipo long requieren un sufijo
	//Al usar antes la funcion del nombre de la variable
	//le digo que tipo de dato quiero que sea esa variable
	
	//El tipo de dato más utilizado es el int
	
	//NUMERICOS EN COMA FLOTANTE (DECIMALES)
    float numero5 = 3.1416F; //T: 4bytes. Se necesita sufijo F para almacenarse 
	double numero6 = 3.141615116565; // T:8bytes
	
	//double es el mas utilizado, aunque ocupe más memoria
	
	//booleans
	boolean evalua = true;//T o F, EVALUA CONDICION
	
	//Caracter
    char caracter = '$'; //Es necesaria comilla simple
	
	//TIPOS DE DATOS NO PRIMITIVOS (OBJETO/ESTRUCTURADOS)
    //Son estructuras más complejas,son clases se identifican
    //porque el tipo de dato se inicia con mayuscula
    
    //CADENA DE TEXTO
    String name = "Kikimora";
	
    //Wrapper o envoltorio 
    //Envuelven a los datos primitivos en clases para poder otorgarle
	//ciertos comportamientos o metodos. 
    Byte numero11 = 127; 
    
    numero11.toString();//Convierte a texto
    
    //DARLE SALIDA DE DATOS EN CONSOLA
    
    System.out.println("Buenos días estrellitas"); 
	
    //EScribir linea de consola rapido
    //syso + ctrl + espacio
    //sout + ctrl + espacio
	
    System.out.println(name);

	
} //cierre del método main 
}
