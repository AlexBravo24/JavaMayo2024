package com;

public class Cientifica extends Calculadora implements ITermometro {

	@Override
	public void sumar(double a, double b) {
		System.out.println("La Suma es: " + (a+b));
	}

	@Override
	public void restar(double a, double b) {
		System.out.println("La resta es: " + (a-b));
	}

	@Override
	public void dividir(double a, double b) {
		System.out.println("La divicion es: " + (a/b));
	}

	@Override
	public void mutiplicar(double a, double b) {
		System.out.println("La multiplicacion es: " + (a*b));
	}

	@Override
	public void sumar(double a, double b, double c) {
		System.out.println("La Suma es: " + (a+b+c));
	}

	@Override
	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		System.out.println("La temperatura es de 34°C ");
	}


}
