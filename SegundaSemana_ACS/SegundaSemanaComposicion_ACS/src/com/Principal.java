package com;

public class Principal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//Explicacion del uso de constructor vacio
		//El constructor vacio nos sirve como un comodin 
		//para poder instanciar objetos vacios y posteriormente
		//iniciar o setear sus atributos si es necesario
		Almacenamiento hitachi = new Almacenamiento("hitachi", "HDD", 500);
		
		//Cuando tenemos un objeto que se compone de otros
		//necesitamos tener creado primero los m�s "peque�os"
		//que van a formar parte del m�s grande
		Ram adata = new Ram("ADATA","DDR4",8.9);
		
		//Ya podemos crear nuestra computadora
		Computadora laptop = new Computadora("HP", "A51", "Plata", "Laptop", hitachi, adata);
		
		System.out.println(laptop);
		System.out.println();
		
		//CREAR UN OBJETO DE COMPOSICION QUE TENGA SUS
		//PROPIOS ATRIBUTOS Y SE COMPONGA DE OTROS TRES OBJETOS
		//EJEMPLO. UN CELULAR QUE SE COMPONE DE MARCA, MODELO, COLOR
		//Y ADEM�S TIENE CAMARA, PROCESADOR Y RAM
		//EJ 2. PERSONAJE Y APARTE PUEDE TENER OBJETOS COMO ESPADA, ARMADURA Y PODER.
		
		
		/**************************************/
		/**************************************/
		
		Camara camara = new Camara("\nCanon","F45", 48);
		
		Memoria almac = new Memoria(128, 16, "SSD");
		
		Bateria bate = new Bateria("Niquel	", 12.5, "negro");
		
		Tablet samsung = new Tablet("Samsung", "Galaxia", "Gris fuerte", 9.9, camara, almac, bate);
		
		System.out.println(samsung);
	}

}
