package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decicion if - evaluan valores booleanos
		
		int x = 9;
		
		if (x<10) { //Si x es menor a 10 
           System.out.println("si");
		}else { //si x no es menor a 10 
			System.out.println("no");
		}
		
		//Condiciones compuestas con operadores logicos
		//AND, OR NOT, DIFERENTE DE, IGULADAD
		
		//AND - && - Devuelve el valor "true" cuando se cumplen
		//todas las condiciones
		
		if (x<15 && x>10)  {
		System.out.println("si");
		}else {
			System.out.println("no");
		}
		

