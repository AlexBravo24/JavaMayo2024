package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
		//Introducir valores por teclado, ejemplo 
		//numeros enteros
		
		//Primero declaro una variable de tipo entero donde guardar
		//el valor que introducire por teclado
//		Integer numero;
//		String nombre;
//		
//		//Recurriremos al uso de un tipo de dato o clase
//		//llamada Scanner (int, String) - java.lang
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu edad en años");
		int numero = entrada.nextInt();
		System.out.println("Introduce tu nombre");
		//Aveces ocurre que el metodo nextLine() cosume los espacios de salto de linea
		//entonces hay que consumir primero el espacio vacio y despues asignar 
		//lo que vayamos a teclear
		entrada.nextLine();
		String nombre = entrada.nextLine();   
//		
//		System.out.println("Tu nombre es " + nombre + "y tienes" + numero + "años");
		
		//Otro ejemplo o forma de introduccir valores desde teclado, utilizando JoptionPane
		
		String numero = JOptionPane.showInputDialog("Introduce tu edad");
		
		String nombre =JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt (numero) + 1;
		
		System.out.println("Tu nombre es" + nombre + "y el año que viene tendras " + edad + "años");

	}

}
