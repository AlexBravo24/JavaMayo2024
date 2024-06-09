/**
 * 
 */
package com;

/**
 * @author korfirio
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// En el paradigma de la POO solo debe existir
		// una unica clase principal (una sola clase
		// que contenga el método main)

		// Ejemplo de crear en una nueva persona y asignarle valores
		// a sus atributos
		// Instanciar una clase (crear un objeto a partir
		// de una clase) (clase objeto)

		Persona pepe = new Persona();

		// Asignar un nombre a nuestra persona pepe de forma incorrecta
		// pepe.nombre="Jose Luis";

		// CReando una Persona (Instanciando una nueva persona)
		// pero con los atributos iniciados
		Persona mary = new Persona("Maria", 18, "Femenino");

		// Creando una Persona unicamente con nombre
		Persona peter = new Persona("Pedro");

		// Probar el metodo setNombre para establcerle un nombre a pepe, que esta vacio
		pepe.setNombre("Jose Luis");
		// Asignarle una edad a Pepe
		pepe.setEdad(30);

		// Probando el método get - que nos devuelve el valor de un atributo
		System.out.println(mary.getNombre()); // System.out.println("Maria");

		String nombrePeter = peter.getNombre();

		System.out.println(nombrePeter);

		System.out.println(mary);
		System.out.println(pepe);
		System.out.println(peter);
		System.out.println();
		
		// CREAR 5 CLASES PARA PODER INSTANCIAR 2 OBJETOS DE CADA UNA
		//VAN A INSTANCIAR UNO VACIO Y UNO CON TODOS LOS ARGUMENTOS
		//LOS OBJETOS A INTANCIAR LOS VAN A CREAR EN ESTA MISMA CLASE PRINCIPAL
		//Y LOS MANDAN A IMPRIMIR
		//EJEMPLO: VOY A CREAR UNA PLANTILLA PARA GENERAR PERSONAJES DE DRAGON BALL

		/***************** Clase Ropa********************/

		Ropa moda = new Ropa();

		Ropa cloth = new Ropa("ibai", 120, "verde", "M", "lana:suave");

		moda.setMarca("Gucci");
		moda.setPrecio(350);
		moda.setColor("Azul");
		moda.setTalla("EG");

		System.out.println(cloth);
		System.out.println(moda);
		System.out.println();
		
		
		
		/***************Clase Carro********************/
		
		Carro car = new Carro();
		
		Carro auto = new Carro("Tesla","Teslita", 2023, 2,"Gris Neon");
		
		car.setMarca("Nissan");
		car.setModelo("Sentra");
		car.setAño(2020);
		car.setPuertas(4);
		car.setColor("Blanco");
		
		
		System.out.println(auto);
		System.out.println(car);
		System.out.println();
		
		
		/***************Clase Ropero********************/
		
		Ropero ropero = new Ropero();
		
		Ropero rop = new Ropero(120, 40, "Cafe", 6, "Cuadrado");
		
		ropero.setAltura(139);
		ropero.setAncho(35);
		ropero.setColor("Gris");
		ropero.setCajones(5);
		ropero.setForma("Rectangular");

		System.out.println(rop);
		System.out.println(ropero);
		System.out.println();
		
		
		/***************Clase Motocicleta********************/
		
		Motocicleta motos = new Motocicleta();
		
		Motocicleta moto = new Motocicleta("Veloci", "ft150", 5, "Rojo", 12);
		
		motos.setMarca("BW");
		motos.setModelos("Bs300");
		motos.setVelocidades(6);
		motos.setColor("Blanco");
		motos.setRines(15);
		
		System.out.println(moto);
		System.out.println(motos);
		System.out.println();
		
		/***************Clase Casa********************/
		
		Casa cas = new Casa();
		
		Casa ca = new Casa(450, 5, "Rosa", "rustico", "tejas");
		
		System.out.println(cas);
		System.out.println(ca);
		
	}

	
}
