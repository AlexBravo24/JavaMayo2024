package com;

public class Principal {

	public static void main(String[] args) {
		
		// Vamos a probar crear una nueva persona
		Persona juan = new Empleado();
		
		//Vamos a probar en crear un nuevo empleado
		Empleado empleado1 = new Empleado("Perla", "Femenino", 23, "SAA18", "Desarroladora","Vespertino", 30000);
		//Las clases al volver abstarctas, ya no pueden instanciarse
		// ya podemos crear objetos de esa clase 
		//Persona juan = new Empleado();
		
		///System.out.println(jorge);
		System.out.println(empleado1);
		
		//voy a probar el metodo dormir, llamandolo a traves de mi persona juan
		
		juan.dormir();
		
		//Revisamos que los metodos tambien son heredados 
		//Mi empleado jorge tambien puede ejecutar la accion de dormir
		
		//jorge.dormir();
		
		//vamos a probar el metodoo comer, que es el metodo de retorno
		String queComeJuan = juan.comer(); //"Estoy comiendo a las 2pm";
		System.out.println(juan.comer());
		
		System.out.println(juan.comer("Pizza"));;
		
		System.out.println(juan.comer("tacos",3));
		
		//Probar el metodo sumar a traves de 
		juan.sumar(3, 10);
	}
	
	
	
	

}
