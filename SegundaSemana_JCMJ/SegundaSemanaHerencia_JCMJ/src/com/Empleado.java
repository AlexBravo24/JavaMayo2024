package com;

public class Empleado extends Persona {
	
	private String rfc;
	private String puesto;
	private String turno ;
	private double salario;
	
	// Iniamos con los contructores vacios 
	
	public Empleado() {}

	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, String turno, double salario) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.puesto = puesto;
		this.turno = turno;
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", puesto=" + puesto + ", turno=" + turno + ", salario=" + salario
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void sumar(int a, int b) {
		// 
		System.out.println("la suma es " + ( a+b));
		
	}
	
	
	

}
