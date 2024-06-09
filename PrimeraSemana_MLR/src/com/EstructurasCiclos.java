package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Ciclos o tambien llamados bucles
		// Nos ayudan a ejecutar "n" veces una accion, de acuero a una condicion
		
		// Casi siempre nos apoyamos para esto en el cambio de una
		// variable, muchas veces numerica, puede ser booleana, etc
		
		// while (mientras se cumpla una condicion)
		
		int x = 1;
		
//		while (x<=5) {
//			System.out.println(x + " Hola Mundo");
//			// Para este ciclo indeterminado
//			// recurrir a un incremento en x en este caso
//			// para controlarlo y detenerlo
//			//x=x+1;
//			x++; // Incremento en 1
//			//x--; // Decremento en 1
//			//break; // Detener el ciclo
//			
//		}
		
		// do - while
		// Similar al while, pero, si nos encontramos con un posible panorama
		// en el que una condicion no pueda cumplirse, nos aseguramos que el programa
		// se ejecute por lo menos 1 vez
		
		do { // Haz lo siguiente o ejecuta lo siguiente
			System.out.println("Hola Mundo");
		}while ( x > 2); // y evaluamos si se debe seguir haciendo
		
		// For - Determinado - Se utiliza cuando conocemos
		// o podemos saber hasa cuando queremos que se ejecute una accion, numero de veces
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ".- Hola Mundo");
		}

	}

}
