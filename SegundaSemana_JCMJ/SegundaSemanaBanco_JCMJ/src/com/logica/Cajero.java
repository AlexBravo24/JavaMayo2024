package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	// En el paquete com.logica se encuentrala clase
	// en cargada de resolver las operaciones
	// vamos a declarar unos atributos a nuestro cajero

	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	// Declarar una varable auxiliar para incrementar el folioen nuestro ticket
	private int folio = 1;

	// Constructor basio
	public Cajero() {
	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta = null;
		// Entonces asignamos posteriormente la cuenta si existe en elHasMap
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;

		// vamos a buscar la cuenta u necesitamos hacer unas validaciones
		// Primero,si se encuentra o localizan la cuenta ,la asignamos
		// para manipularla

		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			// una vez localizamos  la cuenta para manipular 
			//rr�ealizamos ciertas validaciones 
			if(monto>9000 ) {//validamos si el monto exede el maximo del cajero
				System.out.println("el monto exede el maximo permitido por el cajero");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {//si el saldo es menor al monto a retirar
				System.out.println("saldo insuficiente para realizar el retiro");
				return ticket;
			} else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()){
				System.out.println("El retiro deja por de bajo del minimo a la cuenta");
				return ticket;
				
			}else {//si el retiro puede realizarse
				//actualizamos el saldo nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);//realizamos el retiro 
				//Entonces ahora si 
				ticket = new  Ticket(folio++,new Date(),cuenta.getUsuario(),cuenta.getSaldo(),sucursal,1);
				return ticket;
			}
		}else {
			
			System.out.println("No existe una cuenta asociada a ese cliente");

		return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

}
