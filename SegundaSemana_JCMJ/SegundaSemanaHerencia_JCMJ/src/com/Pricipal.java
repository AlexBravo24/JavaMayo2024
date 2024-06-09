package com;

public class Pricipal {

	public static void main(String[] args) {
		// Vamos a probar  crear  una nueva persona 
		
		//Persona juan= new Persona("juan","Masculino",27);
		Persona juan = new Empleado();
		
		
		
		//vamos a probar a crea un nuevo empleado 
		Empleado jorge = new Empleado("jorge", "masculino", 33, "sdsdhsjdn", "desarollador", "Matutino", 28000);
	
		//System.out.println(juan);
		System.out.println(jorge);
		
		juan .dormir();
		jorge.dormir();
		// a provar el metodo el metodo comer que es un retorno 
		
		juan.comer();
		//System.out.println(juan.comer());
		
		//probamos el poliformico
		juan.comer("pizza");
		System.out.println(juan.comer("pizza"));
		
		System.out.println(juan.comer("tacos", "3 pm"));
		
		juan.sumar(3,3);
	}

}
