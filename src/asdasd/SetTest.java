package asdasd;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class SetTest {

	@Test
	public void listTest() {

		List<Integer> unaColeccion = new ArrayList<>();

		unaColeccion.add(1);
		unaColeccion.add(1);
		// assertEquals(1, unaColeccion.size()); hay que corregir por tamaño = 2;

		unaColeccion.add(2);
		unaColeccion.add(3);

		int tamanioEsperado = 4; // como arreglar que no se puede usar Integer al estar comparando 2 objetos.
		assertEquals(tamanioEsperado, unaColeccion.size());

	}

	@Test
	public void listTest1() {

		List<Integer> miLista = new LinkedList<>();

		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(4);
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(4);

		Set<Integer> sinRepetidos = eliminarRepetidos(miLista);

		System.out.println(miLista + "\n");
		
		System.out.println(sinRepetidos);
		
	}

	private Set<Integer> eliminarRepetidos(List<Integer> miLista) {

		Set<Integer> sinRepetidos = new HashSet<Integer>();

		for (int i = 0; i < miLista.size(); i++) {

			sinRepetidos.add(miLista.get(i));

		}

		return sinRepetidos;
	}
}
