package com.modelo;

public class Cuenta {
	// En el paquete com.modelo guardamos la infomacion
	// de los objetos o entidades a los cuales queremos acceder
	// En este ejempolo necesitamos crear varias cuentas de usuarios y las agregamos
	// a un HashMap
	// para simular una pequeña BD
	// modelar que es lo que tienes las cuentas de banco

	// Creacción del HahMap

	// 1-Atributos
	private String usuario;
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String topoCuenta;

	// 2-Constructor basio
	public Cuenta() {
	}

	// 3-constructor 

	public Cuenta(String usuario, double saldo, double saldoMin, double saldoMax, String topoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.topoCuenta = topoCuenta;
		
		//4-Generar getters and setters
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	public String getTopoCuenta() {
		return topoCuenta;
	}

	public void setTopoCuenta(String topoCuenta) {
		this.topoCuenta = topoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax
				+ ", topoCuenta=" + topoCuenta + "]";
	}
	
	//-5 Metodo to String
	
	

}
