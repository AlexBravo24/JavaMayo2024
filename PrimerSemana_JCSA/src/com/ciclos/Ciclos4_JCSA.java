package com.ciclos;

public class Ciclos4_JCSA {

	public static void main(String[] args) {
//		4. Simular el comportamiento de un reloj digital, 
//		imprimiendo la hora, minutos y segundos de un día 
//		desde las 00:00:00 horas hasta las 23:59:59 horas
		
		System.out.println("*************************************************************");
		System.out.println("***********Este programa simula un reloj digital*************"); 
		System.out.println("*************************************************************\n");
		
		for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    // Formatear la hora, el minuto y el segundo para que siempre tengan dos dígitos
                    String horaFormateada = String.format("%02d", hora);
                    String minutoFormateado = String.format("%02d", minuto);		// %02  es para que siempre tenga dos digitos
                    String segundoFormateado = String.format("%08d", segundo);  	// 'd' convertirlo en entero decimal
                    
                    // Imprimir la hora, el minuto y el segundo
                    System.out.println(horaFormateada + ":" + minutoFormateado + ":" + segundoFormateado);
				
			}
			
		}

	}

}
}
