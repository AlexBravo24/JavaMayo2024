package com;

public class Principal {

	public static void main(String[] args) {
		// En el paradigma de la programacion orientada a 
		//objetos solo debe de existir una sola clase principal
		// que contenga el metodo main
		
		//Ejemplo de crear una nueva persona y asignarle valores a sus stributos 
				
		Persona pepe = new Persona();	//Instaciar una clase (Crear un objeto apartir de un objeto)
		
		
		//Asignar un nombre a nuestra persona pepe de forma incorrecta
		//pepe.nombre = "Jose Luis";
		
		//Creando una persona (INstanciando una nueva perosna)
		//Pero con los atibustos iniciados
		
		Persona mary = new Persona ("Maria",18,"Femeneno");
		
		//Creando una perosona con nombre 
		Persona peter = new Persona("Pedro");
		
		//Probar el metodo nombre para establecerle un nombre a pepe que esta vacio
		
		pepe.setNombre("Jose Luis");
		//Asignandole una edad a pepe 
		pepe.setEdad(30);
		
		
		//Probando el metodo get- Nos devuelve el valor de un atributo
		System.out.println(mary.getNombre());	 //System.out.println("Maria");
	
		String nombrePeter = peter.getNombre();
		
		System.out.println(nombrePeter);
		System.out.println(mary);
		
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno("Juan", "Garcia",17,172);
		alumno1.setNombre("Pedro");
		System.out.println(alumno1);
		System.out.println(alumno2);
		
		Carros carro1 = new Carros("Nissan", 2019, "Rojo", 8);
		System.out.println(carro1);
		Carros carro2 = new Carros();
		carro2.setMarca("Chevrolet");
		carro2.setModelo(2024);
		System.out.println(carro2);
		
	
		Computadoras com1 = new Computadoras("HP","Plata", 7, 8,"Solido");
		System.out.println(com1);
		Computadoras com2 = new Computadoras();
		System.out.println(com2);
		com2.setMarca("Dell");
		com2.setTipoDisco("Mecanico");
		System.out.println(com2);
		
		Muebles m1 = new Muebles();
		System.out.println(m1);
		Muebles m2 = new Muebles("Silla","Cafe","Mediana","Cedro");
		System.out.println(m2);
		
		
		
		//Personaje p1 = new Personaje("Goku", "Masculino","Dragon ball", "30","Henkidama");
		//Personaje p1 = new Personaje("Goku", "Masculino","Dragon Ball","30 ","Henkidama");
		//System.out.println(p1);
		Personaje p2 = new Personaje();
		p2.setNombre("Luffy");
		p2.setAnime("One Piece");
		System.out.println(p2);
		
		Alumno a1 = new Alumno();
		a1.setNombre("Juan");
		a1.setEdad(30);
		System.out.println(a1);
		Alumno a2 = new Alumno("Julio", "Samperio", 34, 172);
		System.out.println(a2);
		
		
	}	
}

	
