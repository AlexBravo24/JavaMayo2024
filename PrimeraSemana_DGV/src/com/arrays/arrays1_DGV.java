package com.arrays;

import java.util.Scanner;

public class arrays1_DGV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Programa 1");
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
        }
        
        System.out.println("Programa 2");
        
        int[] numeros1 = new int[100];
        int suma = 0;

        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = i + 1;
            suma += numeros1[i];
        }

        double media = (double) suma / numeros1.length;

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        
        
        System.out.println("Programa 3");
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        char[] caracteres = frase.toCharArray();

        for (char c : caracteres) {
            System.out.println(c);
        }
        
        System.out.println("Programa 4");
        int[] original = {1, 2, 3, 4, 5};
        int[] invertido = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < invertido.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + invertido[i]);
        }
        
        System.out.println("Programa 5");
        String[] productos = {"Producto1", "Producto2", "Producto3", "Producto4", "Producto5"};
        double[] precios = {10.0, 20.5, 30.99, 40.75, 50.0};

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i] + ", Precio: $" + precios[i]);
        }
	}

}
