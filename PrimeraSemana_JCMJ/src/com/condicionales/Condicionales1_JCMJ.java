package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JCMJ {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
         
         Scanner entrada = new Scanner (System.in);
         System.out.println("cuales tu primer numero ");
        int a=entrada.nextInt();
        System.out.println("tu segundo numero");
        int b=entrada.nextInt();
        if(a==b)
        	System.out.println("son iguales");
        else if(a > b) {
        	System.out.println("el primer numero es mayor " + a);
        	
        }else {
        	System.out.println("el segundo es mayor " + b);
        }
	}

}
