package com;

public class Persona {
	
	private String Nombre;
	private int edad;
	private String genero;
	
	public Persona() {}

	public Persona(String Nombre, int edad, String genero) {
		super();
		this.Nombre = Nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
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

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	

}
