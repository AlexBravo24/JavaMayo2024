package com.ciclos;

public class Ciclos5_DGV {

	public static void main(String[] args) {
		int inversion = 1000;
		for(int i = 0; i <= 12; i++) {
			inversion *= 1.02;
		}
		System.out.println("Al final del año, usted tendrá: $" + inversion );
	}

}
