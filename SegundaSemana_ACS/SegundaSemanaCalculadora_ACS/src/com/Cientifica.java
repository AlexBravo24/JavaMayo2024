package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {

	private String marca;
	private String color;
	private double precio;

	public Cientifica() {

	}

	public Cientifica(String marca, String color, double precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cientifica [marca=" + marca + ", color=" + color + ", precio=" + precio + ", toString()="
				+ super.toString() + "]";
	}

	// rear 4 métodos abstractos (sumar, restar, multiplicar y dividir)
	public void sumar(int a, int b) {
		System.out.println("La suma es: " + (a + b));
	}

	// public void restar(int a, int b) {
	// System.out.println("La resta es: " + (a-b));

	public void restar() {
		int a;
		int b;

		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		a = input.nextInt();
		System.out.println("Introduce el segundo numero");
		b = input.nextInt();

		System.out.println("La resta es igual a: " + (a - b));

	}

	public void multiplicar(int a, int b) {
		System.out.println("La multiplicacion es: " + (a * b));

	}

	public void dividir(int a, int b) {
		System.out.println("La divicion es: " + (a / b));

	}
	
	
	public void sumar(double a, double b, double c) {
		System.out.println("La susma es: " + (a+b+c));
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("La temperatura corporal es de: " + 36);
		
	}
}
