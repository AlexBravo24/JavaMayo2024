package com;

public class Jugador {

	private String nombre;
    private int numeroCamiseta;
    private String posicion;
    private String equipo;
    
    public Jugador() {}
    
	public Jugador(String nombre, int numeroCamiseta, String posicion, String equipo) {

		this.nombre = nombre;
		this.numeroCamiseta = numeroCamiseta;
		this.posicion = posicion;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", numeroCamiseta=" + numeroCamiseta + ", posicion=" + posicion
				+ ", equipo=" + equipo + "]";
	}

     
	
}
