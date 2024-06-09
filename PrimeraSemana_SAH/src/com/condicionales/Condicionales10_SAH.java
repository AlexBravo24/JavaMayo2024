package com.condicionales;

import java.util.Scanner;

public class Condicionales10_SAH {

	public static void main(String[] args) {
		// .Realiza un programa que pida un número entero entre uno y doce e imprima
		//el número de días que tiene el mes correspondiente

		int numeroMes;
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero entre uno y doce: ");
        numeroMes = scanner.nextInt();

        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("ERROR");
        } else {
            switch (numeroMes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("El mes tiene 31 días");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("El mes tiene 30 días");
                    break;
                case 2:
                    System.out.println("El mes tiene 28 días");
                    break;
               
            }
        }

	}//Main

}//Final
