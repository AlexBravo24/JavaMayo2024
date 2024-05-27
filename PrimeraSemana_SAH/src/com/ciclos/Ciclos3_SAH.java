package com.ciclos;

import java.util.Scanner;

public class Ciclos3_SAH {

	public static void main(String[] args) {
		
		// Realiza un programa para determinar si un String es palíndromo
		
		 String palabra;
	    
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Ingresa la palabra");
		 palabra = entrada.nextLine();
		 
		 boolean esPalindromo = esPalindromo(palabra);
	        System.out.println(palabra + " es palíndromo? " + esPalindromo);
	    }

	    public static boolean esPalindromo(String palabra) {
	       
	        String palabraMinusculas = palabra.toLowerCase();
	       
	        int longitud = palabraMinusculas.length();
	        
	        int indiceInicio = 0;
	        
	        int indiceFin = longitud - 1;
	       
	        while (indiceInicio < indiceFin) {
	           
	            if (palabraMinusculas.charAt(indiceInicio)!= palabraMinusculas.charAt(indiceFin)) {
	                return false;
	            }
	            
	            indiceInicio++;
	            indiceFin--;
	        }
	        
	        return true;
		
	}

}
