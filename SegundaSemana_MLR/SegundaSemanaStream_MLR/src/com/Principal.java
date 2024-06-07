package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		// API Stream - Funcionalidad que inicio a partir
		//de Java 8 que nos va a permitir un mejor uso
		//o gestion de una coleccion de datos.
		//Esto nos va a permitir solicitar la info, ya sea
		//ordenandola, filtradola, como mejor nos convenga
		
		//Vamos a crear una lista que podamos
		//agregar elementos Persona
		List<Persona> original = new ArrayList<Persona>();
		
		//Creamos una lista para filtrar la info de la original
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a la lista original
		original.add(new Persona("Alex", 30, "MASCULINO"));
		original.add(new Persona("White", 25, "FEMENINO"));
		original.add(new Persona("Axel", 50, "MASCULINO"));
		original.add(new Persona("Slash", 48, "MASCULINO"));
		original.add(new Persona("Philip", 65, "MASCULINO"));
		original.add(new Persona("Anshelmo", 38, "MASCULINO"));
		original.add(new Persona("Epica", 40, "FEMENINO"));
		original.add(new Persona("Simmone", 36, "FEMENINO"));
		original.add(new Persona("Jinjer", 37, "FEMENINO"));
		original.add(new Persona("Alissa", 39, "FEMENINO"));
		original.add(new Persona("Gluz", 19, "FEMENINO"));
		
		//Imprimir la lista original en consola
		//System.out.println(original);
		
		//Recorrer nuestra lista para ver cada elemento con
		//un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//		}
		
		//Recuperar todos los elementos con el ciclo forEach
//		for (Persona i:original) {
//			System.out.println(i);
//		}
		
//		forEach pero ahora a traves de nuestra Lista
//		original.forEach(a -> System.out.println(a));
		
//		//Si filtraramos a los elementos del genero MASCULINO
//		//con un cilo convencional
//		for (Persona i: original) {
//			if(i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//			}
//		}
//		
//		filtrada.forEach(a -> System.out.println(a));
		
//		//Filtrar con el API Stream a las personas del genero femenino
//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//
//		filtrada.forEach(System.out::println);
		
//		//Oredenar a las personas por edad ascendente
//		filtrada = original.stream()
//				.sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(System.out::println);
//		
//		//Contar el numero de elementos de mi lista
//		long conteo = original.stream().count();
//		System.out.println(conteo);
		
//		//Solicitar una variable boolean si algun elemento o todos
//		//los elementos cumplen alguna condicion
//		
//		boolean alguno = original.stream().anyMatch(a -> a.getEdad()<30);
//		
//		System.out.println(alguno);


//		//Solicitar una variable boolean si todos elemento o todos
//		//los elementos cumplen alguna condicion
//		
//		boolean alguno = original.stream().allMatch(a -> a.getEdad()<30);
//		
//		System.out.println(alguno);
		
		//Retornar un avalor a una clase Optional
		//Optional es una clase que nos permite manejar valores nulos,
		//en caso de que no s eencuentren
		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
	}

}
