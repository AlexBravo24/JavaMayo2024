/**
 * 
 */
package com.arrays;

/**
 * @author korfirio
 *
 */
public class Arrays5_ACS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos
		 */

		// Arrays de productos y precios
		String[] productos = { "Ropa", "Pan", "Discos", "Tacos", "CocaCola" };
		double[] precios = { 10.50, 20.25, 15.75, 30.00, 12.99 };

		// Mostrar la lista de productos y sus precios
		System.out.println("Lista de productos y precios:");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + ": $" + precios[i]);
		}
	}

}
