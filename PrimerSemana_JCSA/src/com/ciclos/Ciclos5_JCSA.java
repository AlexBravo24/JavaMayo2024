package com.ciclos;

public class Ciclos5_JCSA {

	public static void main(String[] args) {
//		// 5. Una persona desea invertir $1000.00 en un banco, 
//		el cual le otorga un 2% de inter�s mensual. �Cu�l ser� 
//		la cantidad de dinero que esta persona tendr� al cabo 
//		de un a�o si todo el dinero lo reinvierte?
		
		System.out.println("**************************************************************************************");
		System.out.println("***Este programa determina cuanto sera la ganacia de una persona por invertir $1000***"); 
		System.out.println("**********con una tasa de interes de 2% al mes, si lo reinvierte un por un a�o********"); 
		System.out.println("**************************************************************************************\n");
		
        double monto= 1000;
    
        for (int i = 1; i <=12; i++) {
            monto *= (1.02);
            System.out.println("Mes "+i+ ". Monto $"+monto);
        }
        
        System.out.println("El monto final despu�s de un a�o es: $" + monto);
    }
				
	}

