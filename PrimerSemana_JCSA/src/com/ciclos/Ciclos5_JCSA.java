package com.ciclos;

public class Ciclos5_JCSA {

	public static void main(String[] args) {
//		// 5. Una persona desea invertir $1000.00 en un banco, 
//		el cual le otorga un 2% de interés mensual. ¿Cuál será 
//		la cantidad de dinero que esta persona tendrá al cabo 
//		de un año si todo el dinero lo reinvierte?
		
		System.out.println("**************************************************************************************");
		System.out.println("***Este programa determina cuanto sera la ganacia de una persona por invertir $1000***"); 
		System.out.println("**********con una tasa de interes de 2% al mes, si lo reinvierte un por un año********"); 
		System.out.println("**************************************************************************************\n");
		
        double monto= 1000;
    
        for (int i = 1; i <=12; i++) {
            monto *= (1.02);
            System.out.println("Mes "+i+ ". Monto $"+monto);
        }
        
        System.out.println("El monto final después de un año es: $" + monto);
    }
				
	}

