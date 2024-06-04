package com.arrays;

public class Arrays5_JCSA {

	public static void main(String[] args) {
//		// 5. Crea dos arrays, uno para mostrar n productos 
//		y otro para mostrar sus respectivos precios. 
//		Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos.
		
		String [] productos = {"Computadora", "Mouse", "Celular", "Libreta", "Lapiz"};
		int [] precio = {10000, 500, 8000, 55, 10};
		
		System.out.println("Precio de los productos:");
		for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precio[i]);
        }
		

	}

}
