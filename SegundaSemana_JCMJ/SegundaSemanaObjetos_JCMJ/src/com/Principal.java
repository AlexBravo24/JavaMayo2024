package com;

public class Principal {

	public static void main(String[] args) {
		// En el paradigma de la POO solo dede existir 
		//una unica clase principal una solo una  clase
		
		Persona pepe = new Persona ();
		       //variable objeto o instanca de una clase 
		       //Instanci de una clase (crear un objeto)apartir
		      //de una clase 
		
		//Asignar un nombre a nuestra persona juan de forma incorrecta
		//juan.nombre="jhonny";
		
		Persona mary = new Persona ("Maria",18,"femenino");
		//Creando una Persona unicamente con nombre
		
		//Creando 
		Persona peter = new Persona ("Pedro");

		//Probar el metodo setNombre para establecerle un nombre a pepe
		pepe.setNombre("jose luis");
		
		// Asigandole un edad a pepe 
		pepe.setEdad(30);
		System.out.println(mary.getNombre());
		
		String nombrePeter = peter.getNombre();
		System.out.println(nombrePeter);
		System.out.println(mary);
	}
}