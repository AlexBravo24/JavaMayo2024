package com.arrays;

import java.util.Scanner;

public class Arrays5_VIJL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
//		respectivos precios. Muestra en consola la lista de productos y sus precios.
//		Por lo menos 5 productos o artículos.
		
		int numProductos = 0;
		int opcion = 0;
		String[] productos = new String[100];
        double[] precios = new double[100];		
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("");
			System.out.println("****************************");
			System.out.println("*     Elige una opción     *");
			System.out.println("****************************");
			System.out.println("* 1) Agregar Producto      *");
			System.out.println("* 2) Imprimir productos    *");
			System.out.println("* 3) Salir                 *");
			System.out.println("****************************");
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			
			switch(opcion) {
			case 1:
				
				System.out.println("Ingrese el nombre del producto: ");
                productos[numProductos] = entrada.nextLine();
                
                System.out.println("Ingrese el precio del producto: ");
                precios[numProductos] = entrada.nextDouble();
                entrada.nextLine();
				numProductos++;
				
				break;
				
			case 2:
				
				if(numProductos < 2) {
					System.out.println("No se puede Imprimir, es necesario agregar por lo menos 5 artículos");
				}else {
					System.out.println("************************************");
					System.out.println("*  Producto              Precio    *");
					System.out.println("************************************");
					
					for (int i = 0; i < numProductos; i++) {
						
                        System.out.println("*  "+productos[i] + "		$" + precios[i]);
                        
                    }
					
				}
				
				break;
				
			case 3:
				
				System.out.println("Salir");
				
				break;
				
			default:	
				
				System.out.println("ERROR!!!");
				System.out.println("Ingrese una opcion válida");
				
				break;
			}
			
        }while(opcion != 3);
		
		System.out.println("Gracias por usar el programa!!");
	}

}
