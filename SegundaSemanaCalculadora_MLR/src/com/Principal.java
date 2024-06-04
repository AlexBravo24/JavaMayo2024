package com;

public class Principal {

	public static void main(String[] args) {

		// Vamos a probar a crear un nuevo empleado
		Cientifica casio = new Cientifica();
		Cientifica hp = new Cientifica();
		
		casio.sumar(19, 34);
		
		casio.sumar(45, 36, 87);
		
		hp.mutiplicar(7, 8);
		
		hp.tomarTemperatura();
		
		//La Multiherencia en Java no existe. Es decir,
		//una clase hija no puede tener dos padres
		//pero se puede simular a traves del uso de interfaces
		//implementando los metodos de estas.
		
		/*¿De donde obtienen comportamientos los objetos/clases?
		 * 1. De metodos propios
		 * 2. De otras clases, clases abstractas (herencia)
		 * 3.De interfaces
		 * 
		 */
		
	}

}