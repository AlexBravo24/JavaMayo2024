package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Introducir valores por teclado, ejemplo
		//números enteros
		
		//Primero declaro una variable de tipo entero donde guardar
		//el valor que introducire por el teclado
		
//		Integer numero;
//		String nombre;
//		
//		//Recurriremos al uso de un tipo de dato o clase 
//		//llamada Scanner (int, String) ->
//		
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Introduce tu edad en años: ");
//		numero=entrada.nextInt();
//		System.out.println("Introduce tu nombre: ");
//		//A veces ocurre que el método nextLine()  consume los espacios de salto de linea
//		//entonces hay que consumir primero el espacio vaio y despues asignar
//		//lo que vamos a teclear
//		entrada.nextLine();
//		nombre=entrada.nextLine();
//
//		System.out.println("Tu nombre es " + nombre + " y tienes " + numero + " años ");
	
	
		//Otro ejemplo o forma de introducir valores desde teclado, utilizando JOptionPane
		
		String numero = JOptionPane.showInputDialog("Introduce tu edad");
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt(numero) + 1;
		
		System.out.println("Tu nombre es: " + nombre + " y el año que viene tendrás " + edad + " años ");
		
		
	}

}
