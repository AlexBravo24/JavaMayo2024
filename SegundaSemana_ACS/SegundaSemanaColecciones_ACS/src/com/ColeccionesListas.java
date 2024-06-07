/**
 * 
 */
package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author korfirio
 *
 */
public class ColeccionesListas {

	public static void main(String[] args) {
		
		//Listas - son una coleccon de datos o elementos 
		//definida omo una sucesion de los mismos
		//Esta colleccion se implementa a través de la interface Lista
		//y por medio de una array redimensionables de la clase 
		//ArrayList
		//Las listas si admiten valores duplicados, es de las colecciones
		//más utilizadas y con mejor rendimiento
		//No podemos guardar tipos de datos primitivos
		//Pero si datos de yipo Objetos (String, Wrapper, etc)
		
		//Declarar una lista de elementos de tipo String 
		List<String> lista = new ArrayList<String>();
		
		//Agregar elementos a nuestra lista
		 lista.add("Alvaro");
		 lista.add("Carlos");
		 lista.add("Sarai");
		 lista.add("Alberto");
		 lista.add("Maria");
		 lista.add("Alberto");
		
		 //Imprimir una lista en consola
		 System.out.println(lista);
		 
		 //Imprimir o recuperar el valor de una sola lista
		 System.out.println(lista.get(2));
		
		 //Devuelve un vlor booleano si el elemnto existe en ka lista
		 System.out.println(lista.contains("Alvaro"));
		 
		 //Devuelve la posición donde se encuentra al elemento por primera vez
		 System.out.println(lista.indexOf("Alberto"));
		 
		 //Devuelve la ultima posicion donde encuentra el elemento
		 System.out.println(lista.lastIndexOf("Alberto"));
		 
		 
		 //Eliminar un elemento de mi lista
		 lista.remove(5);
		 System.out.println(lista);
		 
		 //Añadir elemntos a la lista indicando una determinada posicion
		 lista.add(2, "Celso");
		 //Las posiciones. No reemplaza el elemento del indice indicado
		 System.out.println(lista);
		 
		 //REemplaazar el valor de una determinada posicion 
		 lista.set(3, "Sandy");
		 System.out.println(lista);
		 
		 //Recorrer o recuperar todos los valores de mi lista
		 //e imprimirlos en una nueva lista
		 for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		 
		 //Puedo almacenar varios elementos si parametrizo mi lista
		 //con elementos Objeto o si no lo parametrizo
		 List<Object> coleccion = new ArrayList<Object>();
		 
		 coleccion.add("Nombre");
		 coleccion.add(23);
		 coleccion.add(3.1416);
		
		 
		

	}

}
