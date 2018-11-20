package practicaparcial.dos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import slacks.ejercicios.Bar;
import slacks.ejercicios.ClientesBar;

public class TestBar {

	@Test

	public void test1() throws Exception {

		Set<ClientesBar> clientes = new TreeSet<ClientesBar>();

		ClientesBar cliente1 = new ClientesBar("Roberto", 25);
		ClientesBar cliente2 = new ClientesBar("Dahyun", 21);
		ClientesBar cliente3 = new ClientesBar("Sana", 19);
		ClientesBar cliente4 = new ClientesBar("Lucas", 21);
		ClientesBar cliente5 = new ClientesBar("Roberto", 17);

		Bar bar1 = new Bar(clientes);

		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
		

		System.out.println(clientes.size());
		System.out.println(clientes);

	}

}
