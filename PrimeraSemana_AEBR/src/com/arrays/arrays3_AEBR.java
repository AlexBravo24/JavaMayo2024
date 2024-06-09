package com.arrays;

import java.util.Scanner;
import java.io.*;

public class arrays3_AEBR {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 3===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		//Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.

		Scanner input = new Scanner(System.in);
		
		System.out.println("Favor de ingresar una frase: " );
		String cadena= input.nextLine();
	
		System.out.println(cadena);
	    
		
		//char [] nou = {}; //MI ERROR NO OLVIDAR
		char[] nou = new char[cadena.length()]; //LA FORMA CORRECA DE CREAR UNA VARIABLE 
		                                        //TIPO ARRAY PARA CARACTER QUE SE PUEDA IR LLENANDO ES ESTA
		
		for (int i = 0; i < cadena.length(); i++) {//Nos paramos en la posición cero de la palabra
                                                   // siempre que i sea menor a longitud de CADENA, y va caminando de uno en uno
			nou [i] = cadena.charAt(i);// TOMA EL PRIMER CARACTER DE LA CADENA Y LO COLOCA EN EL ARRA
			System.out.println(nou);   //HACE ESTO PARA CADA CARACTER
		}	
}
}
