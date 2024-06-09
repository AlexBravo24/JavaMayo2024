package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos 
		//Expreciones Lambda - son expresiones  o funciones 
		//"anónima que implemetan un metodo de una interface
		//Estas expresiones nos van a permitir escribir o "sobreescribir"
		//sin que una clase defina Como se va realizar 
		//su oprador es ->
		//Su sitaxis es (parametros)-> {cuerpo lambda}
		// vamos  aver un ejemplo de un objeto creado a travez de
		//una clase "anónima que me permita implementar la interface
		//IKetodo y vamos a definir como se raliza ese método
		//o más bien que es lo que queremos solicitarle
		IMetodo casio = (c,d)->System.out.println("la suema es "+(c+d));
		//Una vez defino el metodo,podemos hacer
		casio.operacion(1, 1);
	}

}
