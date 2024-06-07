package com;

public class Principal {

	public static void main(String[] args) {
		
		Almacenamiento hitachi = new Almacenamiento("Hitachi", "HDD", 500);
		Ram adata = new Ram("ADATA", "DDR4",8); 
		//Ya podemos crear nuestra computadora 		
		Computadora laptop = new Computadora("Dell","A51", "Negra", "Laptod", hitachi, adata);
		System.out.println(laptop);	
	
	
		//Antes de crear nuestro Carro
		
		Tipo t1 = new Tipo("Compacto", 3.5 , 6);
		Llantas l1 = new Llantas("Michelin", 45, "Carga");
		Estereo e1 = new Estereo("Sony", 6, "bluetooth");
		
		Carro c1 = new Carro("Nissa","2024","Rojo", t1, l1, e1);
		System.out.println(c1);	
		
	}

}
