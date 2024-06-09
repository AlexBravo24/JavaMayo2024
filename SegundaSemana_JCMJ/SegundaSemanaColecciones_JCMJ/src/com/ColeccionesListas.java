package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Son colecciones de datos o elementos 
		//definida como una sucesion de los mismo
		//esta colecion se implememnta a travez de la interfaces listas
		//lista si adminten valores duplicados  es delas colecciones  //mas utilizadas y con mejor rendimiento 
		//no podemos guardadar tipos primitivos 
		//pero si tipo  datos Objetos (String)

		List<String>lista = new ArrayList<String>();
		//Agregar elementos 
		lista.add("jaun");
		lista.add("bere");
		lista.add("dani");
		lista.add("mitzi");
		//Iprimir una lista en consola
		System.out.println(lista);
		
		//Recuperar el valor de un elemento de lista 
			
		System.out.println(lista.get(2));
		
		//Devolver un valor booleano si el elemento exite en la lista 
		System.out.println("mitzi");
		//Devuelve la pocion donde  se encuntra  al elemento por 
		//primera vez 
		System.out.println(lista.indexOf("bere"));
		
		//devuelve la ultima pocion deonde ecuntra el elemento
		System.out.println(lista.lastIndexOf("bere"));
		//Eliminar un elemeto de un lista 
		lista.remove(2);
		System.out.println(lista);
		//Añadir elementos a la lista indicando una determinada posicion 
		lista.add(2, "lalo");
		System.out.println(lista);
		//remplazar el valor de una determinada posicion 
		
		lista.set(3, "samuel");
		System.out.println(lista);
		//Recorrer o recuperar todos  los valores de milsta
		//e imprimirlos en una nueva linea 
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		//Puedo almacenar varios elementos si parametrizo mi lista
		//con elementos Objet o si no la parametrizo
		List<Object>Coleccion = new ArrayList<Object>();
		
		Coleccion.add("Nombre");
		Coleccion.add(23);
		Coleccion.add(3.1416);
		Coleccion.add(true);
		Coleccion.add('$');
		System.out.println(Coleccion.get(2));
		
	}
	

}
