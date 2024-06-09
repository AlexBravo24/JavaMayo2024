package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La intefaz Map asocia o almacena los datos
		// en pares (clave - valor a almacenar)
		// Las claves no pueden duplicarse
		// Es decir, la clave actua como una identificador unico
		// para cada elemento a almacenar (ID)
		// Dede claracion de un map y la Clase hashMap
		// para alamacenar claves de tipo Integer y elementos de tipo String
		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		usuarios.put(1, "juan");
		usuarios.put(3, "karmina");
		usuarios.put(2, "carlos");
		System.out.println(usuarios);
		// Imprimir en pantalla un solo valor alacenado en
		// una determinada clave
		System.out.println(usuarios.get(2));
		// Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		// Imprimir en consola las llaves de mi HasMap
		System.out.println(usuarios.keySet());
		// Imprimir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		// Mandar a imprimir cada una de las llaveas con un ciclo
		// for each
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);
		}
		// Mandar a imprimir cada una de las valores con un ciclo
		// for each
		for (String i : usuarios.values()) {
			System.out.println(i);
		}
		//Imprimir llaves y valores
		for (Integer i: usuarios.keySet()) {
			System.out.println("Lave : "  + i  +  " valor  " + usuarios.get(i));
			
		}

	}

}