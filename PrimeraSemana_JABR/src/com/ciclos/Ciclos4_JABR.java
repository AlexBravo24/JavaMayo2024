package com.ciclos;

public class Ciclos4_JABR {

	public static void main(String[] args) throws InterruptedException {
		//4. Simular el comportamiento de un reloj digital, 
		//imprimiendo la hora, minutos y segundos de un d�a desde 
		//las 00:00:00 horas hasta las 23:59:59 horas
		
		for (int hora = 0; hora <=23; hora++) {
			for (int minutos = 0; minutos < 60; minutos++) {
				for (int segundos = 0; segundos < 60; segundos++) {
					System.out.println(hora + ":" + minutos + ":" + segundos);
					Thread.sleep(1000);
				}
			}
		}
	}

}
