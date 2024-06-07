package com;

public abstract class Persona {
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//Creacion de metodos propios 
	//Estas van a ser acciones que vamos a poder llamar atraves de los objetos
	//que vamos a crear
	
	//Metodo sin retorno -- lleva la palabra reservada  void la cual indica 
	//que este metodo ejecuta algo, pero no debe retornar algun tipo de dato
	
	public void dormir () {
		System.out.println("Estoy durmiendo...");
	}
	
	//Metodos con retorno - indica desde la creacion del metodo
	// el tipo de dato que el metodo debe devolver
	
	public String comer () {
		String comiendo = "Estoy comiendo a las 2pm";
		System.out.println(comiendo);
		return comiendo;
	}
	
	//Creacion de un metodo Polimorfico
		public String comer(String comida) {
			String comiendo = "Estoy comiendo " +comida+ " a las 2pm ";
			return comiendo;
		}
		
	//Crando otro metodo comer pero con otro argumento
		public String comer (String comida, int horario) {
			String comiendo = "Estoy comiendo" +comida+ "a las " +horario+ " pm";
			return comiendo;
		}
	
		//La sobrecarga de argumentos va de la mano con la sobrecarga de metodos
		//la sobrecarga de metodos se podria entender que es tener un metodo polimorfico
		//o varios metodos con el mismo nombre, pero que van a realizar diferenres acciones
		//gracias a la cantidad de argumentos que soicitan (Sobrecarga de argumentos)
		
		// Craeacion de un metodo abstracto - esto obliga a que la clase se vuelva abstracta
		//las clases hijas se  ven obligadas a definir como se va a realizar esta accion
		public abstract void sumar (int a, int b);
		
		//Un metodo abstarcto nos indica que se va hacer  pero NO COMO
		//Otra forma de entender las clases abstractas es por medio de 
		//la definicion que son clases "resume" que nos van a permitir 
		//heredarlas para poder especializar otros modelos 
		
		
		//
		

}
