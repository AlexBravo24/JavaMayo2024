package com.condicionales;

import java.util.Scanner;

public class Condicional9 {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 9===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
//		Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
//		correspondiente. Si introducimos otro n�mero nos da un error. 
		int a;

		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un n�mero del 1 al 7 para conocer el d�a de la semana: ");
		a = input.nextInt();
		
		if (a<1 || a>7) { //AQUI PODRIA PONER UNA MANERA PARA QUE VUELVA A PEDIR Y DEJE ENTRAR DE NUEVO 
			System.out.println("Error,favor de introducir un numero del 1 al 7");
		}else if (a==1){
			System.out.println("El d�a 1 corresponde al d�a Lunes");
		}else if (a==2){
			System.out.println("El d�a 2 corresponde al d�a Martes");
		}else if (a==3){
			System.out.println("El d�a 3 corresponde al d�a Miercoles");
		}else if (a==4){
			System.out.println("El d�a 4 corresponde al d�a Jueves");
		}else if (a==5){
			System.out.println("El d�a 5 corresponde al d�a Viernes");
		}else if (a==6){
			System.out.println("El d�a 6 corresponde al d�a Sabado");
		}else if (a==7){
			System.out.println("El d�a 7 corresponde al d�a Domingo");
		}
		
	}
}

