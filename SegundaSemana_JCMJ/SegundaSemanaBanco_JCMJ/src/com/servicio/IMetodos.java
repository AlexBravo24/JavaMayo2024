package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	// Aqui declaramos las operaciones que la clase encargada de la logica tendra
	// que resorver

	// primer metodo consulta la informacion de nuestra de cuenta

	public Cuenta consultar(int numeroCuenta);

	// Retirar recusos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);

	// Depositar recursos  recusos en nuestra cuenta
	public Ticket depositar(int numeroCuenta, double monto);
	

}
