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
//		Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
//		correspondiente. Si introducimos otro número nos da un error. 
		int a;

		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un número del 1 al 7 para conocer el día de la semana: ");
		a = input.nextInt();
		
		if (a<1 || a>7) { //AQUI PODRIA PONER UNA MANERA PARA QUE VUELVA A PEDIR Y DEJE ENTRAR DE NUEVO 
			System.out.println("Error,favor de introducir un numero del 1 al 7");
		}else if (a==1){
			System.out.println("El día 1 corresponde al día Lunes");
		}else if (a==2){
			System.out.println("El día 2 corresponde al día Martes");
		}else if (a==3){
			System.out.println("El día 3 corresponde al día Miercoles");
		}else if (a==4){
			System.out.println("El día 4 corresponde al día Jueves");
		}else if (a==5){
			System.out.println("El día 5 corresponde al día Viernes");
		}else if (a==6){
			System.out.println("El día 6 corresponde al día Sabado");
		}else if (a==7){
			System.out.println("El día 7 corresponde al día Domingo");
		}
		
	}
}

