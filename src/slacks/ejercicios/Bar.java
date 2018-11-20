package slacks.ejercicios;

import java.util.Set;
import java.util.TreeSet;

public class Bar {

	private Set<ClientesBar> clientes = new TreeSet<ClientesBar>();

	public Bar(Set<ClientesBar> clientes) {

		this.clientes = clientes;

	}

}
