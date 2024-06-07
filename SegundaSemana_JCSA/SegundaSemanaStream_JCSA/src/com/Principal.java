package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// API Stream- funcionalidad que inicio a partir
		// de Java 8 que nos va a permitir hacer un mejor uso 
		//o gestion de una coleccion de datos
		
		//Esto nos va a permitir solicitar la info, ya sea 
		//ordenandola, filtrandola, etc. como mejor nos convenga
		
		//vamos a crear un a lista para que podamos
		//agregar elemento persona
		
		List<Persona> original = new ArrayList <Persona>();
		
		//Creamos una lista para filtar la info de la original
		List<Persona> filtrada = new ArrayList <Persona>();
		
		//Anadir elementos a la lista original 
		original.add(new Persona("Alex", 30, "MASCULINO"));
		original.add(new Persona("Alanis", 25, "FEMENIMO"));
		original.add(new Persona("Cesar", 9, "MASCULINO"));
		original.add(new Persona("Oscar", 23, "MASCULINO"));
		original.add(new Persona("Guadalupe", 25, "FEMENIMO"));
		original.add(new Persona("Juan", 31, "MASCULINO"));
		original.add(new Persona("Monica", 27, "FEMENIMO"));
		original.add(new Persona("Paola", 26, "FEMENIMO"));
		original.add(new Persona("Ivan", 32, "MASCULINO"));
		original.add(new Persona("Rafael", 2, "MASCULINO"));
		
		
//		// Imprimir la lista original en consola 
//		System.out.println(original);
//		
//		//Recorrer nuestra lista con un ciclo for 
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//			
//		//Recuperar todos los elementos con el ciclo forEach
//			for (Persona j:original) {
//				System.out.println(j);
//			}
		
		//ForEach pero ahora a traves de nuestra lista 
	//	original.forEach(a -> System.out.println(a));
		
		//Si filtramos los elementos del genero masculino
		//con un ciclo convencinal
//		for(Persona i: original) {					//Se abre llave de for
//			if(i.getGenero().equals("MASCULINO")) {	//Se abre llave de if
//				filtrada.add(i);
//				System.out.println(i);
//			}										//Cierre de if anidado en for 
//		}											//Cierre de forEach
		
		filtrada = original.stream()
				.filter(item -> item.getGenero().equals("FEMENIMO"))
				.collect(Collectors.toList());
		//filtrada.forEach(a -> System.out.println(a));
		
		//Otra forma de mandar a imprimir es 
		//filtrada.forEach(System.out::println);
		
		//Ordenar a las personas por edad ascendente 
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		filtrada.forEach(System.out::println);
		
		
//		//Contar el numero de elementos de mi lista 
//		System.out.println(original.stream().count());
		
		//Solicitar una variable booleana si algun elemento o todos 
		//los elementos cuamplen alguna condicion 
		
//		boolean alguno = original.stream().allMatch(a -> a.getEdad()<30);
//		System.out.println(alguno);
//		
		//Retornar un valor a una clase Optional
		//Optional es una clase que nos permite manejar valores nulos, 
		//en caso de que no se encuentren 
		Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		}											//Cierre de Main
	}

//}
