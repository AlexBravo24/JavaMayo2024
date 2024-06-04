package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducir valores por teclado, ejemplo números enteros
		//Primero declaro una variable de tipo entero donde guardar 
		//el valor que introducire por teclado
		 
		Integer numero; 
		String nombre;
		//Recurriremos a un tipo de dato o clase llamado Scanner
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce tu edad en años");
		numero=input.nextInt();
		System.out.println("Introduce un nombre");
		//A veces ocurre que el método nextLine() consume los espacios
		//de salto de linea, pruimero hay que consumir los espacios
		//y despues asignar lo que vamos a asignar
		input.nextLine(); 
		nombre=input.nextLine();
		
		System.out.println("Tu nombre es " + nombre + " y tienes " + numero + "años");
         //Otro ejemplo o forma de introducir valores desde teclado, utilizando JOptionPane
		
//		String numero = JOptionPane.showInputDialog("Introduce tu edad");
//		
//		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
//		
//		int edad = Integer.parseInt(numero) + 1;
//		
//		System.out.println("Tu nombre es " + nombre + " y el año que viene tendras " + edad + " años");
		
	}

}
