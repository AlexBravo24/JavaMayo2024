package com;

public class Principal {

	public static void main(String[] args) {
		// En el paradigma de la POO solo debe existir
		//una unica clase Principal (una sola clase
		//que contenga el método main)
		
		//Ejemplo de crear una nueva persona y asignarle valores
		//a sus atributos
		//Instanciar una clase (crear un objeto a partir
		//de una clase) (Clase objeto)
		Persona pepe = new Persona();
		
		//Asignar un nombre a nuestra persona pepe de forma incorrecta
		//pepe.nombre="Jose Luis";
		
		//Creando una Persona (Instanciando una nueva Persona)
		//pero con los atributos iniciados
		Persona mary = new Persona("María", 18, "Femenino");
		
		//Creando una Persona unicamente con nombre
		Persona peter = new Persona("Pedro");
		
		//Probar el método setNombre para establecerle un nombre a pepe, que esta vacio
		pepe.setNombre("Jose Luis");
		//Asinandole un edad a Pepe
		pepe.setEdad(30);
		
		//Probando el método get - que nos devuelve el valor de un atributo
		System.out.println(mary.getNombre()); //System.out.println("María");
		
		String nombrePeter = peter.getNombre();
		
		System.out.println(nombrePeter);
		
		System.out.println(mary);
		
		System.out.println(peter);
		
		System.out.println(pepe);
		
		//CREAR 5 CLASES PARA PODER INSTANCIAR 2 OBJETOS DE CADA UNA
		//Cada clase u objeto debera tener por lo menos 3 atributos
		//VAN A INSTANCIAR UNO VACIO Y UNO CON TODOS LOS ARGUMENTOS
		//LOS OBJETOS A INSTANCIAR LOS VAN A CREAR EN ESTA MISMA CLASE PRINCIPAL
		//Y LOS MANDAN A IMPRIMIR
		//EJEMPLO: VOY A CREAR UNA PLANTILLA PARA GENERAR PERSONAJES DE DRAGON BALL
		
		Personaje goku = new Personaje();
		
		Personaje krilin = new Personaje("Krilin", "Masculino", "Dragon Ball", 38, "Kienzan");
		
		goku.setPoder("Kamehameha");
		
		System.out.println(goku);
		
		System.out.println(krilin);
		

	}

}
