package com.ciclos;

public class Ciclos1_DGV {

	public static void main(String[] args) {
		System.out.println("Tabla del 12");
		int x = 0;
		int y = 0;
		do{
			y++;
			x = 12 * y;
			System.out.println("12 x " + y + " = " + x);
		}while(y<12);

	}

}
