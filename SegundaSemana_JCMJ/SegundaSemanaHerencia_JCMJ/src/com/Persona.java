package com;

public abstract class Persona {
	private String nombre;
	private String genero;
	private int edad;
	
	//Constructor vacio 
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
	
	
	// Creacion de metodos propios 
	// estas van hacer acciones que vamos a poder  llamar a travez de los objetos a que vamos a crear 
	
	//metodo con retorno y sin retorno 
	
	public void dormir (){
		System.out.println("Estoy durmiendo...");
		
		//Metodos con retorno indican desde la creacion del metodo el tipo de 
		//de dato que el metodo de volver 
			
	}
	
	public String comer() {
		String cominedo = "Estoy comiendo a las 2pm";
		return cominedo;
	}
	
	//Creacion de un método Polimorfico
	
	public String comer(String comida) {
		String comiendo = "Estoy comiendo" + comida + "a las 2 pm";
		return comiendo;
		
	}
	
	//Creando otro metodo comer per con otro argumento 
	
	public String comer(String comida,String horario) {
		String comiendo = "estoy comiendo "+comida+"a las"+ horario;
		return comiendo;
		
	}
	//la sobre carga de argumentos va de la mano con la sobre carga de metodos
	//la sobrecarga de metodos se podria entender que es tener un metodo polimfomico 
	//o varios metodos con el mismi nombre , pero que va a realizar diferentes acciones 
	//gracias a la cantidad de argumentos que soliciten (sonre carha de argumento )

	
	//Declar un metodo 
	public abstract void sumar (int a,int b);
}
