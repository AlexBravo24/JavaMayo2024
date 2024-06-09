package com;

public class Persona {

	// Las clases nos van a servir como plantilla o molde
	// para generar diveros objetos

	// Los objetos deben de contar con tributos y comportamientos

	// ABSTRACCI�N
	// Atributos
	// Los atributos deben de preferencia llevar modificador de acceso para
	// restringir dichos valores de modificaciones no autorizadas
	// Los modificadoress son private, prublic, default y protected
	// Estos modificadores nos perminten establecer la ENCAPSULACI�N

	private String nombre;
	private int edad;
	private String genero;

	/*
	 * Metodo Constructores Son aquellos m�todos que nos permiten instanciar o crear
	 * a nuestros objestos con determinados atributos Existen dos principales:
	 * Constructor vacio y contructor con todos los parametros
	 */
	
	// Constructor vacio - nos permite crear un objeto sin tener iniciados sus
	// atributos
	// Persona pepe =new Persona();

	public Persona() {

	}

	
	//Constructor con todos los parametros - nos permite crear un objeto
	//con sus atributos iniciados
	//Persona mary = new Persona("Maria", 18, "Femenino");
	public Persona(String nombre, int edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	//Persona peter = new Persona("Pedro");
	public Persona(String nombre) {
		this.nombre = nombre;
	}


	//Getters & Setters
	//M�todo get - devuelve el valor del atributo indicado
	//M�todo set - nos permite establecer un valor al atributo especificado
	
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


	//Generamos el m�todo toString
	//El cual convierte todos los atributos a valores String para poder visualizarlos en consola
	//Este m�todo actua como una ""radiografia" para permitirnos imprimir en consola
	//los atributos de nuestros objeto
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
	
	


}
