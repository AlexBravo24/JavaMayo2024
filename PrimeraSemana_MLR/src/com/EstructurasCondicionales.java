package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de desicion if - evaluan valores booleanos
		
		int x = 12;
		System.out.println("\n Valor inicial de x -> " + x + "\n");
		
//		if (x < 10) { // Si x e menos a 10
//			System.out.println("x < 10");
//		}else { //si x no es menos a 10
//			System.out.println("x > 10");
//		}
		
		//Condiciones compuestas con operadores logicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		// AND - && - Devuelte el valor "true" cuando se cumplen todas las condiciones
		if (x < 15 && x > 12) {
			System.out.println("x < 15 && x > 12 : Si");
		}else {
			System.out.println("x < 15 && x > 12 : No");
		}
		
		//OR - || - Devuelte el valor "true" cuando se cumple al menos una condicion
		if (x < 15 || x > 12) {
			System.out.println("x < 15 || x > 12 : Si");
		}else {
			System.out.println("x < 15 || x > 12 : No");
		}
		
		//NOT - ! - Niega una condicion o sentencia/cambia el valor
		//de true a false y viceversa
		// !NO
		
		if (!(x<15)) {
			System.out.println("!(x < 15) : Si");
		}else {
			System.out.println("!(x < 15) : No");
		}
		
		//IGUALDAD o COMPARACION - == - Revisa o compara el valor
		//para verfificar si son iguales
		//Un solo = significa asignacion de valor hacia una variable
		
		if (x == 12) {
			System.out.println("x == 12 : Si");
		}else {
			System.out.println("x == 12 : No");
		}
		
		//DIFERENTE DE - != - Devuelve el valor true si la condicion
		//es diferente de lo que se esta evaluando
		
		if (x != 12) {
			System.out.println("x != 12 : Si");
		}else {
			System.out.println("x != 12 : No");
		}
		
		
		//Estructura de if else anidado
		//Se utiliza para evaluar distintos "casos" que puedan presentarse
		
		int dia = 2;
		
		if (dia == 1) {// Si esto se cumple, ejecuta lo siguiente
			System.out.println("El numero de dia " + dia + " es Lunes");
		}else if (dia == 2) {  //si lo anterior no se cumple, evalua lo siguiente
			System.out.println("El numero de dia " + dia + " es Martes");
		}else if (dia == 3) {
			System.out.println("El numero de dia " + dia + " es Miercoles");
		}else if (dia == 4) {
			System.out.println("El numero de dia " + dia + " es Jueves");
		}else if (dia == 5) {
			System.out.println("El numero de dia " + dia + " es Viernes");
		}else { //si nada de lo anterior se cumple
			System.out.println("Error");
		}
		
		
		//Estructura de desicion SWITCH-CASE
		//Puede ser con tipo de dato, String, int, char, etc
		//Switch case se utiliza mas cuando tenemos casos bien definidos
		//y una variable nos ayuda a evaluarlos facilmente
		
		int day = 3;
		
		switch (day) { //de acuerdo al cambio de una variable
		case 1: //el valor que tenga
			System.out.println("El numero de dia " + day + " es Lunes");
			break;
		case 2: //el valor que tenga
			System.out.println("El numero de dia " + day + " es Martes");
			break;
		case 3: //el valor que tenga
			System.out.println("El numero de dia " + day + " es Miercoles");
			break;
		case 4: //el valor que tenga
			System.out.println("El numero de dia " + day + " es Jueves");
			break;
		case 5: //el valor que tenga
			System.out.println("El numero de dia " + day + " es Viernes");
			break;

		default:
			System.out.println("Error");
			break;
		}
		
	} 

}
