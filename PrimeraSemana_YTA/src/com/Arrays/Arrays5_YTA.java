package com.Arrays;

public class Arrays5_YTA {

	public static void main(String[] args) {
		// //Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos
		 
		String[] productos = {"Manzana", "Plátano", "Pera", "Melón", "Naranja"};
        double[] precios = {5.0, 3.5, 6.25, 8.0, 12.5};

        System.out.println("Lista de productos y sus precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }

	}

}
