package com;

public class Persona {
	
	//Las clases nos van a servir comoplantilla o molde 
	//para generar diversos objetos 
	
	//los objetos deben contar con atributos y comortamientos
	
	//ABSRACCION
	//Atributos
	//Los atributos deben llevar un modificador de acceso para restingir dichos valores de
	//modificacones no autorizadas
	//Estos modificadfores nos permiten establecer la ENCAPSULACION
	
	private String nombre;
	private int  edad;
	private String genero;
	
	
	//Metodos contructores 
	//SOn aquellos metosos que nos permiten instanciar o crear a nuestros objetos 
	//con determinados atributos
	//Existen 2 principales: Conctructor vacio y contsructor con todos los parametros
	
	//Contructor vacio- Nos permite crear un objeto isn tener iniciados sus atributos
	//persona pepe = new Persona()
	public Persona() {
		
	}

	//Constructor con todos los parametros - 
	//Nos permite crear un objeto con sus atributos iniciados
	//Persona Mary  = new Persona ("Maria", 18, "Femenino")
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	//Persona peter  = new Persona ("Pedro")
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	//Getters & Setters 
	//Metodo get - devuelve el valor del atributo indicado
	//Metodo set nos permite establecer un valor al atributo especificado
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	//Genereamos el metodo toString
	//el cual convierte todos los atributos a valotres String para poder visualizar en consola 
	//Este metodo actua como una radigrafia para permitir imprimir 
	// en consola los atributos de nuestros objetos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
	
	
	

}
