package com.ciclos;

public class Ciclos4_JCMJ {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas

	//iteramos desde las 00:00:00 hasta las 23:59:59
		for (int hora = 0; hora < 24; hora++) {
			for (int minuto = 0; minuto < 60; minuto++) {
				for (int segundo = 0; segundo < 60; segundo++) {
					
					String horaFormateada = String.format("%02d", hora);
                    String minutoFormateado = String.format("%02d", minuto);
                    String segundoFormateado = String.format("%02d", segundo);
                    // Imprimimos la hora en formato HH:MM:SS
                    System.out.println(horaFormateada + ":" + minutoFormateado + ":" + segundoFormateado);
					
				}
				
			}
			
		}
	}

}
