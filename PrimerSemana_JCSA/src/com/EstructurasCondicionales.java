package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decision if - evalua valores booleanos
		
		//int day = 12;
		
//		if(x<10) {
//			System.out.println("SI");
//		}
//		
//		else {
//			System.out.println("NO");
//		}
		
		// AND 
//		if (x<15 && x>12) {
//			System.out.println("SI");		
//		}else {
//			System.out.println("NO");
//		}
		
		//OR - || - Devuelve el valor "true" cuando se cumple al menos una condicion 
		
//		if (x<15 || x>12) {
//			System.out.println("SI");		
//		}else {
//			System.out.println("NO");
//		}
		
		int day = 5;
		
		switch (day) {
		case 1:
			System.out.println("Lunes ");
			break;
		case 2:
			System.out.println("Martes ");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves ");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Error");
			break;
		}
		
			}

}
