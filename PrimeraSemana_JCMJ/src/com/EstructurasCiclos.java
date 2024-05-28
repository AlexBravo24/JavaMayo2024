package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// ciclos o tambien llamada bucles 
		//Nos ayudan a ejecutar  "n"veces un accion de acuerdo 
		//a una condicion 
		//casi siempre nos apoyamos para esto 
		
		int x=1;
		//while(x<=5) {
			//System.out.println("hola mundo");
			//para este ciclo que inderminado,podemos
			//recurrir a un incremento en x este caso ,para 
			//controlarlo y detenerlo
			//x=x+1;
			//x++;
			//break;
			
			//do - while 
			//similar al while ,pero si nos encontramos con un posible panorama
			//en el que una condicion no pueda cumplirse, nos aseguramos que el programa 
			//se ejecute por lo menos 1 vez 
			
//			do {// haz lo siguiente o ejecuta lo siguiente
//				System.out.println("hola mundo");
//			}while(x>2);//y evaluamos si se debe seguir haciendo 
//			
//			}
		//}
	
		// for - ciclo determinado se utliza cuando conocemos
		//o podemos saber hasta donde queremos que se ejecute un accion 
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " hola mundo");
		}
	}
}
			
		

//}
