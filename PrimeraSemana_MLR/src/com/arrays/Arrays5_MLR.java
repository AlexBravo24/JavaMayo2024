package com.arrays;

public class Arrays5_MLR {

	public static void main(String[] args) {
		
		System.out.println("\n=====================================================================================");
		System.out.println("================================== Ejercicio 5 ======================================");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Descripción:");
		System.out.println("");
		System.out.println("Crea dos arrays, uno para mostrar n productos y otro para mostrar sus ");
		System.out.println("respectivos precios. Muestra en consola la lista de productos y sus precios.");
		System.out.println("Por lo menos 5 productos o artículos.");
		System.out.println("=====================================================================================");
		System.out.println("");
		
		//Delcaracion de variables
		String [] producto = {"Laptop","Mouse","Teclado","Audifonos","Router"};
		int [] precio = {10000,400,200,500,600};

			
		System.out.println("\nResultado:");
		System.out.println("");
		
		for (int i = 0; i <= producto.length - 1; i++) {
			//producto y precio
			System.out.print("Producto: " + producto[i]);
			System.out.println(" Precio: $" + precio[i]);
		}
		
	}

}
