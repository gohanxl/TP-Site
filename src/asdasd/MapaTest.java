package asdasd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MapaTest {

	@Test
	public void test1() {

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
}