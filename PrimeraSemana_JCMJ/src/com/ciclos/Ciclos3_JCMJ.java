package com.ciclos;
import java.util.Scanner;
public class Ciclos3_JCMJ {

	//3.Realizar un programa para determinar si un String es palindromo
	//Declaro una variable de tipo String para almacenar la 
	//Frase que solicita mediante teclado 
	
	public static void main(String[] args) {
		String original;//ana 
		//Despues declaro otro String para armar lacadena de texto
		//original pero en resversa 
		String regreso = " ";
		//Necesitamos un Scanner para intruducir los valores por el tlecado 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introcuce la frace");
		original = entrada.nextLine();
		//una vez tenemos gurdado el String original 
		//Necesitamos un ciclo que nos permita extraer caracter por caracter 
		//Ahora iniciamos por elultimo caracter y que  esté se vuelva el primer 
		//en y lo guardemos en el String reversa 
		
		for (int i = original.length()-1; i>=0; i--) {
			//Armamos la reversa extrayendo caractaer por caracter 
			
			regreso = regreso + original .charAt(i);//a+n+a
			
				
		}
		System.out.println("Regreso" + regreso);
		//Evaluamos si las cadenas son iguales ,para ellos debemos remplazar 
		//los espacios e  ignirar el uso de mayusculas  y minusculas
		
		if (original.replace("","").equalsIgnoreCase(regreso.replace(" "," "))) {
			
		System.out.println("Es palindromo");
		
		}else {
			System.out.println("no es palindromo");
		
	}
		
	}
}
	

