package com;

public abstract class Persona {
	
	//Las clases nos van a servir como plantilla o molde
	//para generar diversos objetos
	
	//Los objetos deben contar con atributos y comportamientos
	
	//ABSTRACCION
	//Atributos
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {}

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
	
	//Creación de Métodos Propios
	//Estas van a ser acciones que vamos a poder llamar a través de los objetos
	//que vayamos a crear
	
	//Método sin retorno - llevan la palabra reservada void, la cual indica
	//que este método ejecuta algo, pero no debe retornar algun tipo de dato
	
	public void dormir () {
		System.out.println("Estoy durmiendo...");
	}
	
	//Métodos con retorno - indican desde la creación del método el tipo de
	//dato que el método debe devolver
	
	public String comer() {
		String comiendo = "Estoy comiendo a las 2pm";
		
		return comiendo;
	}
	
	//Creacion de un metodo Polimorfico
	
	public String comer(String comida) {
	
		String comiendo = "Estoy comiendo " + comida + " a las 2 pm";
		return comiendo;
	}

	//Creaando otro metodo comer, pero con otro argumento
	
	public String comer(String comida, String horario) {
	
		String comiendo = "Estoy comiendo " + comida + " a las " + horario;
		return comiendo;
	}	
	
	//La sobrecarga de argumentos va de la mano con la sobrecarga de metodos
	//La sobrecarga de metodos se podria entender que es tener un metodo polimorfico
	//o varios metodos con el mismo nombre, pero que van a realizar diferentes acciones
	//gracias a la cantidad de argumentos que soliciten (sobrecarga de argumentos)

	//Creacion de un metodo abstracto - esto obliga a que la clase se vuelva abstracta
	//las clases hijas se ven obligadas 
	public abstract void sumar (int a, int b);
		
}