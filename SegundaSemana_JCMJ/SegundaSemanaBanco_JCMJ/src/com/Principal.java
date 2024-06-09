package com;
import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Vamos acrear nuestra base de datos

		// crear nuestra HashMap
		Map<Integer,Cuenta > cuentas = new HashMap<Integer,Cuenta>();
		
		//fata agregar cunetas
		//para agregar cuentas en nuestro HashMap podemos hacerlo de dos 
		//forma 
		//creando la cuenta y agregamos  despues 
		
		Cuenta alex  = new Cuenta("alex", 133000,4000, 50000,"Devito");
		cuentas.put(1001, alex);
		
		//Creando la cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000,100, 15000,"Debito "));
		cuentas.put(1003, new Cuenta("juan", 10000,100, 20000,"Debito "));
		cuentas.put(1004, new Cuenta("Pablo", 500,100, 10000,"Debito "));
		// si nos acordamos ,para recuperar el valor de un objeto  en HashMap
		//System.out.println(cuentas.get(1003));
		//Crear nuevo cajero
		Cajero angelopolis = new Cajero("angelopolis",cuentas);
		System.out.println(angelopolis.consultar(1001));
		// probar el metodo retirar 
		System.out.println(angelopolis.retirar(1001, 5000));
		System.out.println(angelopolis.retirar(1001, 5000));
		
	} 

}
 