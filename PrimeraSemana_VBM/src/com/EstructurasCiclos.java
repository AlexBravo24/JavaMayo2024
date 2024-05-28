package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//Ciclos o tambien llamados bucles
		//Nos ayuda a ejecutar "n" veces una accion, de acuerdo 
		//a una condicion
		
		//Casi siempre nos apoyamos para esto en el cambio de una
		//variable, muchas veces numerica, puede ser booleana, etc
		
		//PRIMER CICLO-WHILE (MIENTRAS SE CUMPLA UNA CONDICION)
		
		int x = 1;
		
////		while (x<=5) {
////			System.out.println("Hola mundo");
////			//Para este ciclo que es indeterminado, podemos
////			//recurri a un incremento en x en este caso, para
////			//controlarlo y detenerlo
////			//x=x+1;
////			//x++;
//		}
		
	//do-while
	//Similar al while, pero si nos encontramos con un posible panorama
	//en el que una condicion no puede cumplirse, nos aseguramos que el programa
	//se ejecute por lo menos 1 vez
	
//	do { //haz lo siguiente o ejecuta lo siguiente
//		System.out.println("Hola mundo");
//	}while(x>2); //evaluamos si se debe seguir haciendo
	
	//SEGUNDO CICLO - For (significa para)- Es un ciclo determinado -se uitiliza cuando conocemos
	//o podemos saber hasta donde queremos que se ejecute  una accion (cuantas veces)
	for (int i = 0; i <= 5; i++) {
		System.out.println(i + ".- Hola mundo");
	}
	}

}