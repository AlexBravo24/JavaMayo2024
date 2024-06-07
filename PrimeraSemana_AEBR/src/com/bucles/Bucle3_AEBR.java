package com.bucles;

public class Bucle3_AEBR {

	public static void main(String[] args) {
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("                                    ");
		System.out.println("===========EJERCICIO NO 3===========");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		//Realiza un programa para determinar si un String es palíndromo. 
		String a = "canicula";
		String reversed= ""; //Se establece una cadena vacia

		for (int i = 0; i < a.length(); i++) {//Nos paramos en la posición cero de la palabra
			                                  // siempre que i sea menor a longitud de a, y va caminando de uno en uno
		  reversed = a.charAt(i) + reversed; //charAT regresa el valor especifico de una posición y ademas
		                                     //aqui se va a agregando a la cadena vacia inverso
		//  System.out.println(a.charAt(i));
		  System.out.println(reversed);
		}
      System.out.println("Reversed string: "+ reversed);
		System.out.println(a.equalsIgnoreCase (reversed));
	}
	}
//EN LA MANERA EN QUE YO ESCRIBI REVERSED LO QUE ESTA HACIENDO ES QUE EL CARACTER NUERO
//QUE ENTRA VA IR EMPUJANDO A LA DERECHA AL CARACTER YA PRESENTE EN LA VARIABLE REVERSED
// EN CONCATENACION DE CARACTERES SI IMPORTA EL ORDEN 
//c
//ac
//nac
//inac
//cinac
//ucinac
//lucinac
//alucinac
//        //OTRA MANERAL DE HACERLO

//         for (int i = a.length()-1; i >=0; i--) { //SE empieza de atras hacai adelnta
//        	 reversed = reversed + a.charAt(i) ;
//	}
//         System.out.println("Reversed string: "+ reversed);
// 		System.out.println(a.equalsIgnoreCase (reversed));
//
//}
//}