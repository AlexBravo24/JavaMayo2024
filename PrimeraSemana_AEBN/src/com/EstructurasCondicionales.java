package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 12;
		
//		if (x<10) { // si x es menos a 10
//			System.out.println("Si");
//		}else { // si x no es menos a 10 
//			System.out.println("No");
//		}
  // AND = && Devuelve el valor "true" cuando se cumplen 
		//todas las condiciones
//		if (x<15 && x>12) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		//OR = || - Devuelve el valor true cuando se cumpke el menos una condicion
//		if (x<15 || x>12) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		//NOT - ! - Niega una condicion o sentencia/cambia el valor de true a false y viceversa
//		if(!(x<15)) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		//IGUALDAD o COMPARACION - == - Revisa o compra el valor para verificar si son iguales
		//Un solo igual significa asignacion de valor, dos iguales significa comparacion
//		if (x== 12) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		//Diferente de  - != - Devulve el valor true si la condicion es diferente de lo que esta evaluando
//		if ( x != 12) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//			{
		//Estructura if else anidado, se utiliza para evaluar distintos casos 
		//que puedas presentarse
		int dia = 2;
		
		if (dia == 1 ) {
			System.out.println("Lunes");
		}else if (dia == 2) {
			System.out.println("Martes");
		}else if (dia == 3) {
			System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia ==5) {
			System.out.println("viernes");
		}else {
			System.out.println("Error");
		}
		// estructura de desicion SWITCH-CASE
		//Puede ser con tipo de dato string. int char, etc
		//swithc case se utiliza cuando tenemos casos bien definidos y una variable nos ayuda a evaluar facilmente
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;

		default:
			System.out.println("ERROR");
			break;
		}
	}

}
