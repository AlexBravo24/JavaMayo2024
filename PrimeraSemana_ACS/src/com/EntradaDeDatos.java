package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Introducir valores por teclado, ejemplo
		//n�meros enteros
		
		//Primero declaro una variable de tipo entero donde guardar
		//el valor que introducire por el teclado
		
//		Integer numero;
//		String nombre;
//		
//		//Recurriremos al uso de un tipo de dato o clase 
//		//llamada Scanner (int, String) ->
//		
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Introduce tu edad en a�os: ");
//		numero=entrada.nextInt();
//		System.out.println("Introduce tu nombre: ");
//		//A veces ocurre que el m�todo nextLine()  consume los espacios de salto de linea
//		//entonces hay que consumir primero el espacio vaio y despues asignar
//		//lo que vamos a teclear
//		entrada.nextLine();
//		nombre=entrada.nextLine();
//
//		System.out.println("Tu nombre es " + nombre + " y tienes " + numero + " a�os ");
	
	
		//Otro ejemplo o forma de introducir valores desde teclado, utilizando JOptionPane
		
		String numero = JOptionPane.showInputDialog("Introduce tu edad");
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt(numero) + 1;
		
		System.out.println("Tu nombre es: " + nombre + " y el a�o que viene tendr�s " + edad + " a�os ");
		
		
	}

}
