package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
	//Introducir valores por teclado
	//Números enteros
		
	//Primero declaro variable de tipo entero
		//donde guardo el valor que introducire por teclado
		
		int edad;
		String nombre;
		int dia;
		//Haremos el uso de un tipo de dato llamado Scanner
		// (int,String) esta en el paquete de Java.util
		//Scanner permite introducir datos desde la consola
		
//		Scanner input = new Scanner (System.in); //system.in permite introducir valores por teclado
//        
//		System.out.println("Favor de introducir un número");
//		
//		edad = input.nextInt(); //nEXTiNT FUNCIONA CON SCANNER, Y NOS PERMITE CONECTAAR A LO ALMACENADO EN ENTRADA (TECLADO) EN LA VARIABLE NUMEROSOLO ENTEROS POR EL INT
//	   
//		System.out.println("Favor de introducir tu nombre");
//		//A VECES NEXT LINE USA LOS ESPACIOS DE SALTOS DE LINEA
//		// HAY QUE CONSUMIR EL ESPACIO VACIO Y DESPUES ASIGNAR LO QUE VAMOS A TECLEAR 
//		// ¿COMO?
//		input.nextLine();
//		nombre = input.nextLine();
//		
//		System.out.println("Favor de introducir el dia"); 
//		
//		dia = input.nextInt();
//		
//		System.out.println("¡Gracias!");
//
//	    System.out.println("Tienes " + (edad) + "Tu nombre es " + (nombre)+ "Hoy es " + (dia));
//	
	    //OTRA MANERA DE INTRODUCIR VALORES DESDE EL TECLADO JOptionPane
	    
	    String numero = JOptionPane.showInputDialog("Introduce tu edad ");
	    
	    String nombre2 = JOptionPane.showInputDialog("Introduce tu nombre");
	    
	    //Joption solo va a funcionar con caracteres si queremos hacer operaciones con datos de tipo numero 
	    //entonces debemos hacer un parseo/convertir datos con lo siguiente 
	  //   int edad = Integer.parseInt(numero) + 1;
		
	     System.out.println("Tu nombre es " + (nombre2) + "y tienes " + (numero));

	}

}
