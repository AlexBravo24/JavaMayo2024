package com;

public class Computadora {
	
	private String marca;
	private String modelo;
	private String color;
	private String tipo;
	/// vamos a crear atributos que son otros que  en realidad son ostros 
	//objetos que forman parte de mi computadora 
	
	// primero creamos la clase almacenamiento 
	
	private Almacenamiento capacidad;
	private Ram ram;
	
	//Creamos los contructores 
	//inicicamos por el constructor basio
	
	public Computadora() {}

	public Computadora(String marca, String modelo, String color, String tipo, Almacenamiento capacidad, Ram ram) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.ram = ram;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Almacenamiento getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Almacenamiento capacidad) {
		this.capacidad = capacidad;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo
				+ ", capacidad=" + capacidad + ", ram=" + ram + "]";
	}
	
	


	
}
