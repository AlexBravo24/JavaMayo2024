package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		
		//Ciclos o tambi�n llamados bucles 
		//Nos ayudan a ejecutar "n" veces un acci�n, de acuerdo
		//a una condici�n
		
		//casi siempre nos apoyamos para esto en el cambio de una
		//variable, muchas veces num�rica, puede ser booleana, etc.
		
		//while (mientras se cumpla una condicion)
		
		int x = 1;
		
//		while (x<=5) {
//			System.out.println("Hola mundo");
//			//para este ciclo que es indeterminado, podemos
//			//recurrir a un incremento en x en este caso, para
//			//controlarlo y detenerlo
//			//x=x+1;
//			x++;
//		}
		
		//do - while
		//Similar al while, pero, si nos encontramos con un posible panorama
		//en el que una condici�n no pueda cumplirse, nos aseguramos que el programa
		//se ejecute por lo menos 1 vez
//		do {
//			System.out.println("Hola mundo");
//		}while(x>2); //Y evaluamos si se debe de seguir haciendo
//		
		
		//For - Determinado - se utiliza cuando concemos 
		//o podemos 
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + ".-Hola mundo");
			
		}
		
		
		
		
		

	}

}
