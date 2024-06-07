package com;

public class Perfume {

	private String marca;
	 private String modelo;
	 private int ml;
	 private String aroma;

	 public Perfume() {}

	public Perfume(String marca, String modelo, int ml, String aroma) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ml = ml;
		this.aroma = aroma;
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

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	@Override
	public String toString() {
		return "Perfume [marca=" + marca + ", modelo=" + modelo + ", ml=" + ml + ", aroma=" + aroma + "]";
	}
	 
	 
	
}
