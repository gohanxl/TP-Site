package asdasd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapaTest {

	@Test
	public void Ejercicio17() {

		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, 2);
		mapa.put(9, 4);
		mapa.put(3, 6);
		mapa.put(12, 24);
		mapa.put(6, 12);

		System.out.println("Mapa sin ordenar");
		printMap(mapa);

		System.out.println("\nMapa Ordenado");
		Map<Integer, Integer> mapaOrdenado = multiplosDe4(mapa);

		printMap(mapaOrdenado);

		Integer valorObtenido = 4;

		assertNotNull(mapaOrdenado);

		// pasar a un hashSet y ordenar con un compareTo }
	}

	public Map<Integer, Integer> multiplosDe4(Map<Integer, Integer> mapa) {

		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(mapa.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}

		});

		Map<Integer, Integer> mapaOrdenado = new LinkedHashMap<Integer, Integer>();

		for (Map.Entry<Integer, Integer> entry : list) {

			if (entry.getValue() % 4 == 0) {

				mapaOrdenado.put(entry.getKey(), entry.getValue());
			}
		}

		return mapaOrdenado;
	}

	private static <K, V> void printMap(Map<K, V> map) {

		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

		}
	}

	@Test

	public void ejercicio13() {

		Integer sumatoria = 0;
		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, 2);
		mapa.put(2, 4);
		mapa.put(3, 6);

		Integer indiceEsperado = 3;
		assertEquals(6, mapa.get(indiceEsperado).intValue());

		// Los numeros 1, 2 y 3 son llamados keys.
		// No, no es la posicion del elemento del mapa, ya que no tiene posiciones, sino
		// que tiene keys.

		// Ejercicio 14
		for (Integer e : mapa.keySet()) {

			sumatoria += e;

		}

		Integer valorEsperado = 2;
		Integer valorObtenido = sumatoria / mapa.size();

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void mapearElementosTest() {

		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, 2);
		mapa.put(2, 4);
		mapa.put(3, 6);

		Map<Integer, String> otroMapa = crearNuevoMapa(mapa);

		assertEquals(otroMapa.get(1), "El doble de 1 es 2");
		assertEquals(otroMapa.get(2), "El doble de 2 es 4");
		assertEquals(otroMapa.get(3), "El doble de 3 es 6");

	}

	private Map<Integer, String> crearNuevoMapa(Map<Integer, Integer> mapa) {

		Map<Integer, String> nuevoMapa = new HashMap<>();

		nuevoMapa.put(1, "El doble de 1 es 2");
		nuevoMapa.put(2, "El doble de 2 es 4");
		nuevoMapa.put(3, "El doble de 3 es 6");

		return nuevoMapa;
	}

	@Test
	public void nullElements() {

		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, null);

		assertNull(mapa.get(1));
		assertNull(mapa.get(2));

		// El primer null devuelve el null perteneciente a la key 1 del mapa.
		// El segundo null devuelve null porque esa key no existe.

	}

	@Test
	public void multiplosDe4OrdenadosVersion2() {

		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, 2);
		mapa.put(2, 4);
		mapa.put(3, 6);
		mapa.put(12, 24);
		mapa.put(6, 12);

		Set<Integer> mapaOrdenado = multiplosDe4Version2(mapa);

		System.out.println("\nMapa Ordenado - Segunda Version \n" + mapaOrdenado);
	}

	public Set<Integer> multiplosDe4Version2(Map<Integer, Integer> mapa) {

		Set<Integer> mapaOrdenado = new HashSet<Integer>();

		for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {

			if (entry.getValue() % 4 == 0) {

				mapaOrdenado.add(entry.getValue());
			}
		}

		return mapaOrdenado;
	}
}