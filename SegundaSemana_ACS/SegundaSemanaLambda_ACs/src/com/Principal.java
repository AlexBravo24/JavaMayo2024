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
		//"anonimas" que implementan un m�todo de una interface
		//funcional
		//Estas expreciones nos van a permitir escribir o "sobreescribir"
		//un m�todo para su suo inmediato
		//Sin que una clase defina C�MO se va a realizar
		//Su operador es ->
		//Su sintaxis es (parametros)-> {cuerpo lambda}
		
		//Vamos a ver un ejemplo de un objeti creao a trav�s de
		//una clase ""anonima" que permite implementar la interface 
		//IMetrodo y vamos a definoir C�MO se reliza ese m�todo
		//o m�s bien, que es lo que queremos solicitarle
		IMetodo casio = (c,d) -> System.out.println("La multiplicacion es: " + (c*d));
		IMetodo resta = (x,y) -> System.out.println("La resta es: " + (x-y));

		//Una vez definida el m�todo, podemos hacer uso inmediato del mismo
		casio.operacion(5, 11);
		resta.operacion(76, 50);
		
		
	}

}
