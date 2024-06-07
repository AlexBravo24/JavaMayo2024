package com;

public class Estereo {
	private String marca;
	private int salidas;
	private String reproduccion;
	
	public Estereo () {}

	public Estereo(String marca, int salidas, String reproduccion) {
		super();
		this.marca = marca;
		this.salidas = salidas;
		this.reproduccion = reproduccion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getSalidas() {
		return salidas;
	}

	public void setSalidas(int salidas) {
		this.salidas = salidas;
	}

	public String getReproduccion() {
		return reproduccion;
	}

	public void setReproduccion(String reproduccion) {
		this.reproduccion = reproduccion;
	}

	@Override
	public String toString() {
		return "Estereo [marca=" + marca + ", salidas=" + salidas + ", reproduccion=" + reproduccion + "]";
	}

	
}
