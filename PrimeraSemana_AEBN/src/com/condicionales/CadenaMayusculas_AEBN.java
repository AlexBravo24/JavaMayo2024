package com.condicionales;

import java.util.Scanner;

public class CadenaMayusculas_AEBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce una cadena:");
        String Cadena = input.nextLine();

        if (Cadena.equals(Cadena.toLowerCase())) {
            System.out.println("La cadena no contiene letras mayúsculas.");
        } else {
            System.out.println("La cadena contiene al menos una letra mayúscula.");
        }
	}

}
