package com.ciclos;

import java.util.Scanner;

public class Ciclos3_1_JCSA {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.
				System.out.println("*************************************************************");
				System.out.println("***Este programa te determina si una palabra es palindromo***"); 
				System.out.println("*************************************************************\n");
				
				
				String palabra;
				Scanner entrada = new Scanner (System.in);
				System.out.println("Ingrese una palabra ");
				palabra = entrada.nextLine();
				palabra = palabra.replace(" ", "").toLowerCase();
				
				int inicio = 0;
				int inverso = palabra.length()-1;
				
				
				for (int i = 0; i < palabra.length(); i++) {
					if(palabra.charAt(inicio) != palabra.charAt(inverso)) {
						inicio++;
						inverso--;
						System.out.println("NO es Palindromo ");
						return;
						
					}else {
						System.out.println("Es Palindromo ");
						return;
					}
				}
				
				
					
				entrada.close();				
				}
				
		
				

	}


