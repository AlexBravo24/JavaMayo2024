package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Almacenamiento hitachi = new Almacenamiento ("Hitachi","HDD",500);
		
		Ram adata = new Ram("ADATA","DDR4",8);
		
		//Ya podemos crear nuestra computadora 
		Computadora laptop = new Computadora("Dell", "A51","Plata" , "Laptop", hitachi, adata);
		
		System.out.println(laptop);
	}

}
