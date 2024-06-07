package com;

public class Tipo {
	private String tama�o;
	private double motor;
	private int cilindraje;
	
	public Tipo() {}

	public Tipo(String tama�o, double motor, int cilindraje) {
		super();
		this.tama�o = tama�o;
		this.motor = motor;
		this.cilindraje = cilindraje;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Tipo [tama�o=" + tama�o + ", motor=" + motor + ", cilindraje=" + cilindraje + "]";
	}
	
	

}
