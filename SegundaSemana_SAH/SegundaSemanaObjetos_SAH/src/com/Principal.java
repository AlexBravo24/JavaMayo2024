package com;

public class Principal {

	public static void main(String[] args) {
		// En el paradigma de la POO solo debe existir 
		//una unica clase Principal(una sola clase
		//que contenga el método main)
		
		//Ejemplo de crear una nueva persona y asignarle valores
		//a sus atributos
		//Instanciar una clase(crear un objeto a partir
		//de una clase)(Clase objeto)
		Persona pepe = new Persona();
		
		//Asignar un nombre a nuestra persona pepe de forma incorrecta
		//pepe.nombre = "Jose Luis";
		
		//Creando una Persona (Instanciando una nueva Persona)
		//pero con los atributos iniciados
		Persona mary = new Persona("María", 18, "Femenino");
		
		//Creando una Persona unicamente con nombre
		Persona peter = new Persona("Pedro");
		
		//Probar el método setNombre para establecerle un nombre a pepe que está vacio
		pepe.setNombre("Jose Luis");
		//Asignandole una edad a Pepe
		pepe.setEdad(30);
		
		//Probando el método get - nos devuelve el valor de un atributo
		System.out.println(mary.getNombre()); //System.out.println("Maria");
		
		String nombrePeter = peter.getNombre();
		
		System.out.println(nombrePeter);
		
		System.out.println(mary);
		
		System.out.println(peter);
		
		System.out.println(pepe);
		
		
		//Crear 5 clases para poder instanciar 2 objetos de cada una
		//Van a instanciar uno vacio y uno con todos los argumentos
		//Los objetos a instanciar los van a crear en esta misma clase principal
		//y los mandan a imprimir
		//Ejemplo: voy a crear una plantilla de los personajes de dragon ball
		
		System.out.println();
		
		System.out.println("-----------Auto---------------");
		
		System.out.println();
		
		Auto S3 = new Auto();
		
		Auto Golf = new Auto("Volkswagen", "gti", 2022, "Azul");
		
		S3.setMarca("Audi");
		
		System.out.println(Golf);
		
		S3.setColor("negro");
		
		System.out.println(S3);
		
		System.out.println();
		{
		
		System.out.println("---------Jugador de Futbol------------");
		
		System.out.println();
		
		Jugador Pedri = new Jugador();
        Jugador Kross = new Jugador("Tony Kross", 8, "MEDIO", "REAL MADRID");
        
        Pedri.setNumeroCamiseta(6);
        Pedri.setEquipo("Barcelona");
        
        System.out.println(Pedri);
        System.out.println(Kross);
        
        System.out.println();
			
		}
		
		System.out.println("--------------Tenis--------------");
		System.out.println();
		
		Tenis jordan = new Tenis();
		Tenis airmax = new Tenis("Nike", "AirMax90", 27, "Amarillo");
		
		jordan.setMarca("Nike");
		jordan.setSilueta("Jordan 4");
		
		System.out.println(jordan);
		System.out.println(airmax);
		
		System.out.println();
		{
		System.out.println("------------------Celular----------------");
		System.out.println();
		
		Celular iphone = new Celular();
		Celular galaxy = new Celular("Samsung", "s23", 256, "Gris");
		
		iphone.setModelo("15 pro");
		iphone.setCapacidad(512);
		
		System.out.println(iphone);
		System.out.println(galaxy);
		
		System.out.println();

		
		}
		System.out.println("------------------Perfume----------------");
		System.out.println();
		
		Perfume Lacoste = new Perfume();
		Perfume Boss = new Perfume("Hugo Boss", "Bottle tonic", 100, "Fresco" );
		
		Lacoste.setModelo("L.12.12 Blanc");
		Lacoste.setMl(175);
		
		System.out.println(Lacoste);
		System.out.println(Boss);
		
		
		System.out.println();

	}

}
