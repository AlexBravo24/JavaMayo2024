/**
 * 
 */
package com;

/**
 * @author korfirio
 *
 */
public class EstructurasCondicionales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 12;
//		
//		if(x<10) { //si x es menor a 10
//			System.out.println("si");
//			
//		}else { //si x no es menor a 10
//			System.out.println("No");
//		}

		
		//condiciones compuestas con operadores lógicos
		//AND, OR, NOT DIFERENTE DE, IGUALDAD
		
		//AND - && -- Devuelve el valor "true" cuando se cumplen
		//todas las condiciones
//		if (x<15 && x>12) {
//			System.out.println("Si");
//			
//		}else {
//			System.out.println("No");
//		}
		
		//OR - || - Devuelve el valor "true" cuando se cumple al menos
		//una condición
		
//		if (x<15 || x>12) {
//			System.out.println("Si");
//			
//		}else {
//			System.out.println("No");
//		}
		
		//NOT - ! - Niega una condicion o sentencia/Cambia el valor
		//de true a flase y vicerversa
		//!NO
		
//		if (! (x<15)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//IGUALDAD O COMPARACION - == - Revisa o compara el valor
		//para verificar si son iguales
		//Un solo = significa asignacion de valor hacia una variable 
		//Este operador funciona mejor al comparar valores numericos
		
		
//		if (x == 12) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		
		//DIFERENTRE DE - != - Devuelve el valor true si la condición
		//es diferente de lo que se esta evaluando
		
//		if(x != 10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		
		
		//Estructura if else anidado
		//Se utiliza para evalua distintos "casos" que pueden presentarse
		
		int dia = 5;
		
		if (dia == 1) { // si esto se cumple, ejecuta lo siguiente
			System.out.println("Lunes");
		}else if (dia == 2) {//si lo anterior no se cumple, evalu lo sig.
			System.out.println("Martes");
		}else if (dia == 3 ){
			System.out.println("Miercoles");
		}else if (dia == 4 ) {
			System.out.println("Jueves");
		}else if (dia == 5 ) {
			System.out.println("Viernes");
		}else {//si nada de lo anterior se cumple
			System.out.println("Error");
		}
		
		//Estructura de desicion SWHITCH-CASE
		//Puede ser con tipo de dato String, int, char, etc.
		//Switch case se utiliza cuando tenemos casos bien definidos
		//y una variable nos ayuda a evaluarlos facilmente
		
		int day = 3;
		
		switch (day) { // de acuerdo al cambio de una variable
		case 1: //el vaor que tenga
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Error");
			break;
		}
		
		
		
		
	}//cierre main

}// cierre de clase
