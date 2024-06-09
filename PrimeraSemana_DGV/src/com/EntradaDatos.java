package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDatos {
	public static void main(String[] args) {
//		Integer numero;
//		
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Introduce un número");
//		numero =  entrada.nextInt();
//		System.out.println(numero + 5 * 2);
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		
		System.out.println("Hola "+ nombre + ", tienes " + edad + "años, ¿verdad?");
	}
}
