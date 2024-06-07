package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if es un si condicional - si ( esto se cumple) abre una llave y se ejecuta esto; si no se cumle se ejecuta otra cosa.
		
		//Estructuras de decision if - evaluan valores booleanos
		
        int x = 12;
//		
//		if (x<10) { //si x es menor a 10
//			System.out.println("Si");
//		}else //si x no es menor a 10
//			System.out.println("No");



	
	
	//Condiciones compuestas con operadores logicos 
	//AND, OR, NOT DIFERENTE DE, IGUALDAD

	//AND - && - Devuelve el valor "true" cuando se cumplen 
	//todas las condiciones 
	
//	
//	if (x<15 && x>12) {
//		System.out.println("Si");
//	}else {
//		System.out.println("No");
//	}
//	
//	//OR - || - Devuelve el valor "True" cuando se cumpla al menos una condicion
//	
//	if (x<15 || x>12) {
//		System.out.println("si");
//	}else {
//		System.out.println("No");
//		
//		
//		//NOT - ! - Niega una condicion o sentencia/Cambia el valor 
//		//de true a false y viceversa
//		
//		if (!(x<15)) {
//			System.out.println("Si");
//			}else {
//				System.out.println("No");
//			}
        
        
        //IGUALDAD o COMPARACION - == - revisa o compara el valo
        //para vereficiar si son iguales
        //Un solo = significa asignacion de valaor hacia una variable
        //Este operador funciona mejor al comparar valores numericos
        
//        if (x == 12) { 
//        	System.out.println("Si");
//        }else {
//        	System.out.println("No");
//        }
//        
        //Diferente de - ! - Devuelve el valor true si la condicion 
        // es diferente de lo que se esta evaluando 
        
//        if (x != 20) {
//        	System.out.println("Si");
//        }else {
//        	System.out.println("No");
//        }
        
        //Estructura if else anidado 
        //Evalua diferente opciones o situaciones
        
        
        int dia = 1;
        if (dia == 1) { 
        	System.out.println("Lunes");
        }else if (dia == 2) {
        	System.out.println("Martes");
        }else if ( dia == 3) {
        	System.out.println("Miercoles");
        }
        
        //Estructura de desicion SWITCH-CASE
        //Puede ser con tipo de dato String, int, chart, etc..
        // Switch case se utiliza cuando tenemos casos bien definidos
        //Y una variable nos a evaluarlos facilmente.
        int day = 3;
        
        switch (day) { //de acuerdo al cambio de variable
        
		case 1: //el valor que tenga 
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");


		default:
			break;
		}
        		
	}
}
