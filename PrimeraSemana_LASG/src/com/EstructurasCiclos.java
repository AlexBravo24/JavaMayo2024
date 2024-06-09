package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//Ciclos o tambien llamdaos bucles
		//nos ayudan a ejecutar "n" veces una acccion,
		//de acuerdo a una condicion
		
		//Casi siempre nos apoyamos par esto en el cmbio de una
		//variable, muchas veces numericas, ouede ser booleana, etc.
		
		//While (mientras se cumpla una condicion) 
		
		int x = 4; 
//		
//		while (x<=5) {
//			System.out.println("Hi world");
//			//para este ciclo que es indeterminado podemos recurrir
//			//a un incremento en x en este caso, para 
//			//controlarlo y detenerlo 
//			//x=x+1;
//			x++;
//			
//		}

		//do - while
		//similar al while, pero si nos encontramos con un posible panorama
		//en el que una condicion no pueda complirse, nos aseguramos que el programa
		//se ejecuta por lo menos 1 vez 
		
//		do { //haz lo sigueinte o ejecuta lo siguiente
//			System.out.println("HOLA MUNDO");
//		}while(x>2); //evalua si se debe seguir ejecutando
	
		
		//FOR - determinado- se utuliza cuando conocemos
		//o podemos saber hasta donde queremos que se ejecute una accion 
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ".-Hola munde");
			
		}
		}

}
