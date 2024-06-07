package com;

public class Carros {
	private String marca;
	private int 	modelo;
	private String color;
	private int cilindraje;
	
	public Carros () {}

	public Carros(String marca, int modelo, String color, int cilindraje) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cilindraje = cilindraje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "Carros [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cilindraje=" + cilindraje
				+ "]";
	}
	
	
}
