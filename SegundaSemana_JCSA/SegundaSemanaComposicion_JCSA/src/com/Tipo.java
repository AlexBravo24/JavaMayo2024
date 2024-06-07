package com;

public class Tipo {
	private String tamaño;
	private double motor;
	private int cilindraje;
	
	public Tipo() {}

	public Tipo(String tamaño, double motor, int cilindraje) {
		super();
		this.tamaño = tamaño;
		this.motor = motor;
		this.cilindraje = cilindraje;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "Tipo [tamaño=" + tamaño + ", motor=" + motor + ", cilindraje=" + cilindraje + "]";
	}
	
	

}
