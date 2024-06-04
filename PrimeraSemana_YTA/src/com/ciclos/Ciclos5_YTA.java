package com.ciclos;

public class Ciclos5_YTA {

	public static void main(String[] args) {
		 //Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		 //de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		 //tendrá al cabo de un año si todo el dinero lo reinvierte?

		double principal = 1000.00; 
        double tasaInteresAnual = 2.0 / 100; 
        int periodos = 12; 

        
        double montoAcumulado = principal * Math.pow((1 + tasaInteresAnual / periodos), periodos * 12);

       
        System.out.printf("Después de un año, la persona tendrá: $%.2f%n", montoAcumulado);
		
	}

}
