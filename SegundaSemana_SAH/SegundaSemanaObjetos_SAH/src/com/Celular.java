package com;

public class Celular {

	private String marca;
	 private String modelo;
	 private int capacidad;
	 private String color;
	 
	 public Celular() {}
	 
	public Celular(String marca, String modelo, int capacidad, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.color = color;
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

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + ", color=" + color + "]";
	}
	
	 
}
