package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Introducir valores or teclado
		//Ejemplo, numeros enteros
		
		//Primero declaro una variable de tipo entero donde guardar
		//el valor que introducire por teclado
		Integer numero;
		String nombre;
		
		//Recurriremos al uso de un tipo de dato o clase
		//llamada Scanner (int, String) -> java.lang
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad en años");
		numero=entrada.nextInt();
		
		System.out.println("Introduce tu nombre");
		//A veces ocurre el metodo nextLine consume los espacion de salto de linea
		//entones hay que consumir primero el espacio vacio y despues asignar
		//lo que vamos a teclear
		entrada.nextLine();
		nombre=entrada.nextLine();
		
		System.out.println("Tu nombre es " + nombre + " y tienes " + numero + " años");
		
//		//otro ejemplo o forma de introducir valores desde teclado, utilizando JOptionPane
//		
//		String numero = JOptionPane.showInputDialog("Introduce tu edad");
//		
//		String nombre = JOptionPane.showInputDialog("Introduce tu Nombre");
//		
//		//Convertir una valor String en entero
//		int edad = Integer.parseInt(numero) + 1;
//		
//		System.out.println("Tu nombre es " + nombre + " y el año que viene tendras " + edad + " años");
		
	}

}
