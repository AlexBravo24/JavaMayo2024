package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Introduccion valores por teclado

		//Variables
//		String numero;
//		String nombre;
//		// Fin variables
//		
//		// Code
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Ingresa un número entero:");	
//		numero = entrada.nextInt();	
//		
//		System.out.println("Ingresa tu nombre:");	
//		entrada.nextLine();
//		nombre = entrada.nextLine();	
		
		String numero = JOptionPane.showInputDialog("Introduce tu edad "); 
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre "); 
		
		System.out.printf("Tu nombre es " + nombre + " y tu edad es " + numero + " años !");
		
		// Fin Code
	}

}
