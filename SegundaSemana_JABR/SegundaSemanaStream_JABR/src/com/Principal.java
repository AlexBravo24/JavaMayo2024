package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		// API Stream - Funcionalidad que inicio a partir
		//de Java 8 que nos va a permitir hacer un mejor uso
		//o gestión de una colección de datos
		//Esto nos va a permitir solicitar la info, ya sea
		//ordenandola, filtrandola, etc, como mejor nos convenga
		
		//Vamos a crear una lista para que podamos
		//agregar elementos Persona
		List<Persona> original = new ArrayList<Persona>();
		
		//Creamos una lista para filtrar la info de la original
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a la lista original
		original.add(new Persona("Alex", 30, "MASCULINO"));
		original.add(new Persona("Alanis", 25, "FEMENINO"));
		original.add(new Persona("Cesar", 39, "MASCULINO"));
		original.add(new Persona("Oscar", 23, "MASCULINO"));
		original.add(new Persona("Guadalupe", 25, "FEMENINO"));
		original.add(new Persona("Juan", 31, "MASCULINO"));
		original.add(new Persona("Monica", 27, "FEMENINO"));
		original.add(new Persona("Paola", 26, "FEMENINO"));
		original.add(new Persona("Ivan", 32, "MASCULINO"));
		original.add(new Persona("Rafael", 22, "MASCULINO"));

	}

}
