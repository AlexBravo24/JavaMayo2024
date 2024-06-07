package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Introducir valores por teclado 
		//Ejemplo: numeros enteros 
		
		//Primero declaro una varible de tipo entero donde guardar el valor 
		//que introducire en el teclado 
//		
//		Integer edad; 
//		String nombre;
//		
//		Scanner entrada = new Scanner(System.in) ;
//		System.out.println("Introduce tu edad en años");
//		edad = entrada.nextInt();
//		System.out.println("Introduce tu nombre");
//		nombre = entrada.nextLine();
//		System.out.println("Tu edad es de "+edad+" y tu nombre es "+nombre);
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		System.out.println("Tu edad es de "+edad+ " años y tu nombre es "+nombre);
	}

}
