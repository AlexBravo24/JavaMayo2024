package com;

public class Tenis {

	 private String marca;
	 private String silueta;
	 private int talla;
	 private String color;
	 
	 public Tenis(){}
	 
	public Tenis(String marca, String silueta, int talla, String color) {
		
		this.marca = marca;
		this.silueta = silueta;
		this.talla = talla;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSilueta() {
		return silueta;
	}

	public void setSilueta(String silueta) {
		this.silueta = silueta;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Tenis [marca=" + marca + ", silueta=" + silueta + ", talla=" + talla + ", color=" + color + "]";
	}
	 
	 
	
}
