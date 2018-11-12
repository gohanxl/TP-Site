package asdasd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.junit.Test;

public class MapaTest {

	public void multiplosDe4Ordenados() {

		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, 2);
		mapa.put(2, 4);
		mapa.put(3, 6);
		mapa.put(12, 24);
		mapa.put(6, 12);
	}

	private Map multiplosDe4(Map<Integer, Integer> mapa) {

		Map<Integer, Integer> mapaOrdenado = new HashMap<>();

		for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
		     
		 

			if (entry.getValue() % 4 == 0) {

				mapaOrdenado.put(entry.getKey(), entry.getValue());

			}

		}

		System.out.println(mapaOrdenado);

		return mapaOrdenado;
	}

	@Test

	public void MapaTest1() {

		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, 2);
		mapa.put(2, 4);
		mapa.put(3, 6);
		mapa.put(12, 24);
		mapa.put(6, 12);

		multiplosDe4(mapa);
	}

}