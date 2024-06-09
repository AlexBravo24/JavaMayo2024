package com.ciclos;

public class Ciclos4_VIJL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for(int hora = 0 ; hora <= 23 ; hora ++) {
			for(int minutos = 0 ; minutos <= 59 ; minutos ++) {
				for(int segundos = 0 ; segundos <= 59 ; segundos ++) {
					System.out.println(+hora+":"+minutos+":"+segundos);	
					Thread.sleep(1000);
				}
			}
		}
	}

}
