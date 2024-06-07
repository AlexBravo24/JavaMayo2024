package com;

public class Principal {

	public static void main(String[] args) {

		//Expresiones Lambda - Son expresiones o funciones
		//"anonimas" que implementan un metodo de una interface
		//funcional.
		//Estas expresiones nos van a permitir esribir o "sobreescribir"
		//un metodo para su su uso inmediato
		//Sin que na clase defina COMO se va a realizar
		//Su operador es ->
		//Su sintaxis es (parametros) -> {cuerpo lambda}
		
		
		//Vamos a ver un ejemplo de un objeto creado a traves de
		//una clase "anonima" que me permita implementar la interface
		//IMetodo y vamos a definir COMO se realiza ese metodo
		//o mas bien, que es lo que queremos solicitarle
		IMetodo casio = (c, d) -> System.out.println("La suma es: " + (c + d));
		
		//Una vez definido el metodo, podemos hacer uso inmediato del mismo
		casio.operacion(6, 7);

	}

}
