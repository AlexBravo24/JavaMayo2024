package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// API Stream - Funcionalidad que inicio apartir
		// de java que nos va apermitir hacer un mejor uso
		// o gestion de una colleccion de datos
		// esto nos va a permitir solocitar la info ,ya sea
		// ordenandola, filtrandola ,etcn como mejor nos convenga

		// vamos a crear una lista para que podamos
		// agregar elementos Persona

		List<Persona> original = new ArrayList<Persona>();
		List<Persona> Filtrada = new ArrayList<Persona>();
		// Añadir elementos a la lista original
		original.add(new Persona("jhonny", 20, "masculino"));
		original.add(new Persona("chamoy", 22, "masculino"));
		original.add(new Persona("mitzi", 26, "Femenino"));
		original.add(new Persona("dani", 27, "masculino"));
		original.add(new Persona("oscar", 27, "masculino"));
		original.add(new Persona("lupe", 26, "Femenino"));
		original.add(new Persona("laura", 18, "Femenino"));
		original.add(new Persona("lalo", 20, "masculino"));
		original.add(new Persona("jrafael", 25, "masculino"));

		// Imiprimir toda la lista original en consola
		// System.out.println(original);
		// for (int i = 0; i < original.size(); i++) {
		// System.out.println(original.get(i));

		// Recuperar todos los elementos con el ciclo forEach

		// for (Persona i:original) {
		// System.out.println(i);

		// }
		// original.forEach(a->System.out.println(a));
		// si filtramos a los elementos del genero masculino
		// con un ciclo convencional

		// for (Persona i : original) {
		// if (i.getGenero().equals("masculino")) {
		// Filtrada.add(i);
		// System.out.println(i);
		// }

		// }
		// Filtrada = original.stream()
		// .Filtrada(item->item.getGenero().equals("femenino"))
		// .collect(Collectors).toList());
		// Filtrada.forEach(a ->System.out::println);
		//por edad ascendente
		//Filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				//.collect(Collectors.toList());
		//Filtrada.forEach(System.out::println);

	}
}
