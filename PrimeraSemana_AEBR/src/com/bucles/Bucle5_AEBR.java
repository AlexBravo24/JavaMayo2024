package com.bucles;

public class Bucle5_AEBR {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 5===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		 //Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		 //de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		 //tendrá al cabo de un año si todo el dinero lo reinvierte? 
		
		float inv = 1000.00F;
 

	    for (int i = 0; i < 12; i++) {
	    	float inte = (float) (inv*0.02);
	    	inv += inte; //aqui vamos guardando en la misma variable
	    	 System.out.printf("Después del mes %d, el saldo es: $%.2f%n", i, inv);
	    	}
	    System.out.printf("La cantidad de dinero después de un año es: $%.2f%n",inv);

	}
}
