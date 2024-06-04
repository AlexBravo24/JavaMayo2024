package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de decicion if - evaluan valores booleanos
		
		int x = 12;
		
//		if (x<10) { // Si x es menor a 10
//			System.out.println("Si");
//		}else { // si x no es menor a 10
//			System.out.println("No");
//		}
		
		//Condiciones compuestas con operadores logicos 
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND se identifica por ser un operador - && - Devulve el valor "true" cuando se cumplen
		//todas las condiciones
//		if (x<15 && x>12) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
		//OPERADOR OR - se identifica por barras paralelas || - Devulve el valor"true" cuando se cumpla al menos
		//una condicion
		
//		if (x<15 || x>12) {
//			System.out.println("Si");
//		}else {
//			System.out.println ("No");
//		}
		
		//NOT - ! - Niega una condicion o sentencia /Cambia el valor 
		//de true a false y viceversa
		//!NO
		
//		if (! (x<15)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//IGUALDAD o COMPARACION - cuyo operador es == - esta parte revisa o compara el valor
		//para verificar si son iguales
		//Un solo igual = significa asignacion de valor hacia una variable
		//Este operador funciona mejor al comparar valores numericos
		
//		if (x == 12) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
		//DIFERENTE DE  - != - Devuelve el valor true y la condicion
		//es diferente de lo que se esta evaluando
		
//		if (x != 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//ESTRUCTURA IF ELSE ANIDADO - 
		//Se utiliza para evaluadr distintos "casos" que puedan presentarse
		
		int dia = 2;
		
		if (dia == 1) {// si esto  no se cumple, ejecuta lo siguiente
			System.out.println("Lunes");
		}else if (dia == 2) {// si lo anterios nose cumple, evalua lo siguiente
			System.out.println("Martes");
		}else if (dia == 3) {
			System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else { // si nada de lo anterior se cumple
			System.out.println("Error");	
		}
		
		
		//	ESTRUCTURA DE DECISION SWITCH-CASE
		//Puede ser con tipo de dato String, int, char, etc
		//Switch case se utiliza mas cuando tenemos casos bien definidos
		//y una variable nos ayuda a evaluarlos facilmente
		
		int day =3;
		//escrbir swicht y dalr ctrl+espacio y dale enter arrojara las pestañas case/break
		switch (day) { // de acuero al cambio de una variable
		case 1: //el valor que tenga
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
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
		
		
		}//cierre del main
	
		
}//Cierre de la clase