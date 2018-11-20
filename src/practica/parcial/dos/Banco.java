package practica.parcial.dos;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Banco {

	private List<Cliente> clientes = new LinkedList<Cliente>();

	public Banco(List<Cliente> clientes) {

		this.clientes = clientes;
	}

	public Boolean hacerTransferencia(Cliente clienteOrigen, Cliente clienteDestino, Double monto) throws Exception {

		Double nuevoSaldoOrigen = 0.0;
		Double nuevoSaldoDestino = 0.0;

		if (clienteOrigen.getCuenta().getSaldo() >= monto) {

			clienteDestino.getCuenta().depositar(monto);

			clienteDestino.getCuenta().setSaldo(nuevoSaldoDestino);

			clienteOrigen.getCuenta().extraer(monto);

			clienteOrigen.getCuenta().setSaldo(nuevoSaldoOrigen);

			return true;

		} else

			throw new Exception("El saldo es insuficiente");

	}

	public Boolean hacerTransferencia2(String cbuOrigen, String cbuDestino, Double monto) throws Exception {

		Cliente clienteOrigen = null;
		Cliente clienteDestino = null;

		for (Cliente cliente : clientes) {

			if (cliente.getCuenta().getCbu().equals(cbuOrigen)) {

				clienteOrigen = cliente;
				break;

			}

		}

		if (clienteOrigen == null) {

			throw new CbuIncorrectoExc("El CBU no coincide.");
		}

		for (Cliente cliente : clientes) {

			if (cliente.getCuenta().getCbu().equals(cbuDestino)) {

				clienteDestino = cliente;
				break;
			}
		}

		if (clienteDestino == null) {

			throw new CbuIncorrectoExc("El CBU no coincide.");

		}

		clienteOrigen.getCuenta().extraer(monto);
		clienteDestino.getCuenta().depositar(monto);

		return true;
	}

}
