/**
 * 
 */
package com;

/**
 * @author korfirio
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda - Son expresiones o funciones 
		//"anonimas" que implementan un método de una interface
		//funcional
		//Estas expreciones nos van a permitir escribir o "sobreescribir"
		//un método para su suo inmediato
		//Sin que una clase defina CÓMO se va a realizar
		//Su operador es ->
		//Su sintaxis es (parametros)-> {cuerpo lambda}
		
		//Vamos a ver un ejemplo de un objeti creao a través de
		//una clase ""anonima" que permite implementar la interface 
		//IMetrodo y vamos a definoir CÓMO se reliza ese método
		//o más bien, que es lo que queremos solicitarle
		IMetodo casio = (c,d) -> System.out.println("La multiplicacion es: " + (c*d));
		IMetodo resta = (x,y) -> System.out.println("La resta es: " + (x-y));

		//Una vez definida el método, podemos hacer uso inmediato del mismo
		casio.operacion(5, 11);
		resta.operacion(76, 50);
		
		
	}

}
