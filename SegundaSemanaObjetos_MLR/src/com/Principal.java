package com;

public class Principal {

	public static void main(String[] args) {
		//en el paradigma de la POO solo debe existir
		//una unica clase Principal (una sola clase
		//que contenga el metodo main
		

		// Vamos a probar crear una nueva persona
		//ejemplo de crear una nueva persona y asignarle valores
		//a sus atributos
		//Instanciar una clase (crear un objeto a partir
		//de una clase) (clase objeto)
		Persona misa = new Persona();
		Persona misa = new Persona("Misael", "Masculino", 42, "JRGF9776", "Desarrollador", "Matutino", 30000);		
		
		
		// Cuando una clase se vuelve abstracta, no podemos instanciarla
		// es decir, no podemos crear objetos de esa clase
		// Persona juan = new Persona("Juan", "Masculino", 27);

		// Vamos a probar a crear un nuevo empleado
		Empleado jorge = new Empleado("Jorge", "Masculino", 33, "JRGF9776", "Desarrollador", "Matutino", 30000);
		
		//Las clases al volverse abstractas, ya no pueden instanciarse
		//(ya no podemos crear objetos de esa clase)
		Persona juan = new Empleado();
		
		Persona pedro = new Empleado(); //polimorfismo de asignacion

		System.out.println(jorge);
		
		//Voy a probar el método dormir, llamandolo a través de mi persona
		//juan
		juan.dormir();
		
		//Revisamos que los métodos también son heredados
		//Mi empleado jorge también puede ejecutar la accion de dormir
		jorge.dormir();
		
		//Vamos a probar el metodo comer, que es un metodo con retorno
		String queComerJuan = juan.comer();  //Estoy comiendo a las 2pm
		
		System.out.println(juan.comer());
		System.out.println(juan.comer("Pizza"));
		System.out.println(juan.comer("tacos", "3pm"));
		
		//probar el metodo sumar a traves de alguno de mis objetos empleado
		juan.sumar(3, 10);

	}

}