package practicaparcial.dos;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import practica.parcial.dos.Banco;
import practica.parcial.dos.Cliente;
import practica.parcial.dos.Cuenta;
import practica.parcial.dos.MontoInvalidoExcp;
import practica.parcial.dos.SaldoInsuficienteExc;

public class TestCliente {

	@Test (expected = Exception.class)
	public void test1() throws Exception {

		Cliente clienteOrigen = new Cliente("123", "Lucas", "asd123", 1200.0);
		Cliente clienteDestino = new Cliente("124", "Igna", "asd124", 500.0);

		List<Cliente> clientes = new LinkedList<Cliente>();

		Banco banco1 = new Banco(clientes);
		clientes.add(clienteOrigen);
		clientes.add(clienteDestino);


		banco1.hacerTransferencia2("123", "124", 400.0);

		Double valorEsperado1 = 800.0;
		Double valorObtenido1 = clienteOrigen.getCuenta().getSaldo();
		Double valorEsperado2 = 900.0;
		Double valorObtenido2 = clienteDestino.getCuenta().getSaldo();

		assertEquals(valorEsperado1, valorObtenido1);
		assertEquals(valorEsperado2, valorObtenido2);

	}

	@Test
	public void testQuePruebaExcepcionExtraer() {

		Cliente clienteOrigen = new Cliente("123", "Lucas", "asd123", 1200.0);

		Cliente clienteDestino = new Cliente("124", "Igna", "asd124", 500.0);

		List<Cliente> clientes = new LinkedList<Cliente>();

		Banco banco1 = new Banco(clientes);
		clientes.add(clienteOrigen);
		clientes.add(clienteDestino);

		try {
			clienteOrigen.getCuenta().extraer(1300.0);
		} catch (MontoInvalidoExcp e) {

			System.out.println(e.getMessage());
		} catch (SaldoInsuficienteExc e) {

			System.out.println(e.getMessage());
		}

	}

	@Test
	public void testQuePruebaLaOtraAlarma() {

		Cliente clienteOrigen = new Cliente("123", "Lucas", "asd123", 1200.0);
		Cliente clienteDestino = new Cliente("124", "Igna", "asd124", 500.0);

		List<Cliente> clientes = new LinkedList<Cliente>();

		Banco banco1 = new Banco(clientes);
		clientes.add(clienteOrigen);
		clientes.add(clienteDestino);

		try {
			clienteOrigen.getCuenta().extraer(-120.0);
		} catch (MontoInvalidoExcp e) {

			System.out.println(e.getMessage());
		} catch (SaldoInsuficienteExc e) {

			System.out.println(e.getMessage());
		}

	}
}
// try
/*
 * .extraer(monto); catch(MontoInvalidoExcp e){
 * 
 * syso(e.getMessage()); } catch(SaldoInsuficiente e){
 * 
 * syso(e.getMessage()); }
 * 
 */
// set (no tree set), list, hashmap
