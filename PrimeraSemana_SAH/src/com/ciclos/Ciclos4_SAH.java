package com.ciclos;

public class Ciclos4_SAH {

	public static void main(String[] args) {
	
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
		//horas
		
		int segundos = 0;
        int minutos = 0;
        int horas = 0;
        int totalSegundos = 0;

        while (totalSegundos < 86400) { 
            horas = totalSegundos / 3600;
            minutos = (totalSegundos % 3600) / 60;
            segundos = totalSegundos % 60;

            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            totalSegundos++;

            try {
                Thread.sleep(1000); // 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

	}//Main

}//Final
