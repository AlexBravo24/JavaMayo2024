package com.ciclos;

public class Ciclos5_YTA {

	public static void main(String[] args) {
		 //Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		 //de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
		 //tendr� al cabo de un a�o si todo el dinero lo reinvierte?

		double principal = 1000.00; 
        double tasaInteresAnual = 2.0 / 100; 
        int periodos = 12; 

        
        double montoAcumulado = principal * Math.pow((1 + tasaInteresAnual / periodos), periodos * 12);

       
        System.out.printf("Despu�s de un a�o, la persona tendr�: $%.2f%n", montoAcumulado);
		
	}

}
