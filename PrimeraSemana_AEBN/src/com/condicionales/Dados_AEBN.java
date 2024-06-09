package com.condicionales;

import java.util.Scanner;

public class Dados_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce el resultado obtenido al lanzar un dado de seis caras:");
        int resultado = input.nextInt();

        switch (resultado) {
            case 1:
                System.out.println("La cara opuesta es seis.");
                break;
            case 2:
                System.out.println("La cara opuesta es cinco.");
                break;
            case 3:
                System.out.println("La cara opuesta es cuatro.");
                break;
            case 4:
                System.out.println("La cara opuesta es tres.");
                break;
            case 5:
                System.out.println("La cara opuesta es dos.");
                break;
            case 6:
                System.out.println("La cara opuesta es uno.");
                break;
            default:
                System.out.println("ERROR: número incorrecto.");
        }
	}

}
