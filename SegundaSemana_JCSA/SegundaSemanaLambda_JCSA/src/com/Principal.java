package com;

public class Principal {

	public static void main(String[] args) {
		// Expresiones Lambda - son expresiones o funciones 
		//"Anomimas" que implementan un metodo de una interface funcional 
		//Estas expresiones nos van a permitir escribir o "sobreescribir"
		//un metodo para su uso inmediato
		//Sin que una clase defina COMO se va a realizar 
		//Su operador es ->
		//Su sintaxis es (parametros) -> {Cuerpo lambda}
		
		//Vamos a ver un objeto de un objeto creado a traves de 
		//una clase "anonima" que permita implementar la interface 
		//IMetodo y vamos a definir COMO se realiza ese metodo
		//o mas bien, que es lo que queremos solicitar 
		
		IMetodo casio = (c,d) -> System.out.println("La suma es: "+ (c+d));
		
		//Una vez definido el metodo, podemos hacer uso inmediato del mismo
		casio.operacion(5, 11);

	}

}
