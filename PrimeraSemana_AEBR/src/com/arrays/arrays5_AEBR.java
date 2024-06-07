package com.arrays;

public class arrays5_AEBR {

	public static void main(String[] args) {
		
		
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.
		
		Scanner input = new Scanner(System.in);
		int [] costo = new int [];
		String prodructo= input.nextLine();
		
		
		for (int i=0; i<costo.length; i++) {
			System.out.println("Ingresa el costo del producto" + i);
			costo [i]=input.nextInt();
			for (int j = 0; j < producto.length; j++) {
				System.out.println("Ingresa el nombre del producto" + i);
				producto [i]=input.nextInt();
			}
			
		}

	}

}
