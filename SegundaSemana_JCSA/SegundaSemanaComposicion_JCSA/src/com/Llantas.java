package com;

public class Llantas {
	private String marca;
	private int rin;
	private String tipo;
	
	public Llantas () {}

	public Llantas(String marca, int rin, String tipo) {
		super();
		this.marca = marca;
		this.rin = rin;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRin() {
		return rin;
	}

	public void setRin(int rin) {
		this.rin = rin;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", rin=" + rin + ", tipo=" + tipo + "]";
	}
	
	
}
