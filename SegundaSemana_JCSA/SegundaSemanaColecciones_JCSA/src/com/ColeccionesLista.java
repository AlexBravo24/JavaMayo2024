package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesLista {

	public static void main(String[] args) {
//		Esta colección se implementa a través de una 
//		interface List y por medio de un array redimensional de la 
//		clase ArrayList
//		Las listas si admiten valores duplicados, 
//		es de las colecciones mas utilizadas y con mayor rendimiento 
//		No podemos guardar tipos de datos primitivo
//		pero si datos de tipo Objeto (String, Wrapper, etc)
		
		//Declarar una lista de elementos de tipo String
		
		List<String> lista = new ArrayList<>();
		
		//Agregar elementos a nuestra lista 
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//Imprimir una lista en nuestra consola
		System.out.println(lista);
				
		//Imprimir o recuerar el valor de un solo elemento de una lista 
		System.out.println(lista.get(2));
		
		//Devuelve un valor booleano si el elemento existe en la lista 
		System.out.println(lista.contains("Gabriela"));
		
		//Devuelve la posicion donde se encuentra el elemento por primera vez
		System.out.println(lista.indexOf("Alberto"));
		 

		//Eliminar un elemento de mi lista (Se puede eliminar por indice o por objeto)
		//lista.remove("Alberto");
		lista.remove(5);
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posicion 
		lista.add(2,"Celso");
		//Se agrega el elemento y desplaza las posiciones. 
		//No reemplaza el elemento del indice indicado
		System.out.println(lista);
		
		//Remplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista e imprimirlos a una nueva linea 
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		//Puedo almacenar varios elementos si parametrizo mi lista 
		// con elementos Object o si no la parametrizo 
			
		List<Object> coleccion = new ArrayList<Object>();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		
		
		System.out.println(coleccion.get(2));
		
		}
	}

}
