/**
 * 
 */
package com;

/**
 * @author korfirio
 *
 */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cientifica operacion = new Cientifica("Cassio", "Power", 15.0);

//		operacion.sumar(10, 10);
//		System.out.println(operacion);
//		
//		operacion.dividir(20, 5);
//		System.out.println(operacion);
//		
//		operacion.multiplicar(10, 10);
//		
//		operacion.restar();
//		
//		operacion.sumar(1, 2, 3);

		operacion.tomarTemperatura();

		// La multiherencia en Java no existe. Es decir,
		// Una clase hija no puede tener dos padres.
		// Pero se puede simular a trav�s del uso de interfaces
		// implementando los m�todos de estas.

		// �De donde obtienen comportamientos los objetos/clases?
		/*
		 * 1. De m�todos propios
		 * 2. Deotras clasaes, clases abstractas (herencia) 
		 * 3. De interfaces
		 */

	}

}
