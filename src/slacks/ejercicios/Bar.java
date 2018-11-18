package slacks.ejercicios;

import java.util.HashSet;
import java.util.Set;

public class Bar {

	private Set<ClientesBar> clientes = new HashSet<ClientesBar>();

	public Bar(Set<ClientesBar> clientes) {

		this.clientes = clientes;

	}

	public Set<ClientesBar> eliminarRepetidos(Set<ClientesBar> cliente, ClientesBar cliente1) throws Exception {

		Set<ClientesBar> clientesSet = new HashSet<ClientesBar>();

		for (ClientesBar e : clientes) {

			if (e.getNombre().equals(cliente1.getNombre())) {
				;
				{

					clientesSet.remove(e);
				}
			} else {

				clientesSet.add(e);

			}

		}
		return clientesSet;
	}
}
