package com;

public class Carro {
	private String marca;
	private String modelo;
	private String color;
	
	//Estos son objetos que en realidad son atributos en mi Clase Carro
	private Tipo tipo;
	private Llantas llantas;
	private Estereo estereo;
	
	public Carro  () {}

	public Carro(String marca, String modelo, String color, Tipo tipo, Llantas llantas, Estereo estereo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipo = tipo;
		this.llantas = llantas;
		this.estereo = estereo;
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

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Llantas getLlantas() {
		return llantas;
	}

	public void setLlantas(Llantas llantas) {
		this.llantas = llantas;
	}

	public Estereo getEstereo() {
		return estereo;
	}

	public void setEstereo(Estereo estereo) {
		this.estereo = estereo;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", llantas="
				+ llantas + ", estereo=" + estereo + "]";
	}

	
	

}