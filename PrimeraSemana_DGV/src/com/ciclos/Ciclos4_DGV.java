package com.ciclos;

public class Ciclos4_DGV {

	public static void main(String[] args) {
		int hora = 0;
		int minutos = 0;
		int segundos = 0;
		
		do {
			if (segundos < 60) {				
				segundos ++;
				try {
		            Thread.sleep(980);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			}
			if (segundos == 60) {
				segundos = 0;
				minutos ++;
			}
			if (minutos == 60) {
				minutos = 0;
				hora ++;
			}
			System.out.println(hora + " : " + minutos + " : " + segundos);
		}while(hora < 24 );
	}

}
