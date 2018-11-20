package asdasd;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class CollectionsTest {

	public interface Figura {

		Double calcularArea();

		Double calcularPerimetro();
	}

	public class Rectangulo implements Figura, Comparable<Rectangulo> {

		private Double lado1;
		private Double lado2;

		public Rectangulo(Double lado1, Double lado2) {

			this.lado1 = lado1;
			this.lado2 = lado2;
		}

		public Double calcularArea() {

			return lado2 * lado1;
		}

		public Double calcularPerimetro() {

			return this.lado2 * 2 + this.lado1 * 2;
		}

		public Double diferenciaArea(Rectangulo rectangulo) {

			return this.calcularArea() - rectangulo.calcularArea();
		}

		public Double getLado1() {
			return lado1;
		}

		public void setLado1(Double lado1) {
			this.lado1 = lado1;
		}

		public Double getLado2() {
			return lado2;
		}

		public void setLado2(Double lado2) {
			this.lado2 = lado2;
		}

		@Override
		public int compareTo(Rectangulo o) {
			// TODO Auto-generated method stub
			return Rectangulo.this.calcularPerimetro().compareTo(o.calcularPerimetro());
		}

	}
	// Que modificaciones tenes que hacer para que el siguiente test de verde

	@Test
	public void ordenarRectangulosDeMenorAMyorPorPerimetro() {

		List<Rectangulo> miLista = new LinkedList<>();

		miLista.add(new Rectangulo(4d, 6d));
		miLista.add(new Rectangulo(3d, 2d));
		miLista.add(new Rectangulo(4d, 5d));

		Collections.sort(miLista); // por que?

		assertEquals(10, miLista.get(0));
		assertEquals(18, miLista.get(1));
		assertEquals(20, miLista.get(2));

	}

	@Test
	public void ordenarRectangulosDeMenorAMyorPorSuperfice() {

		List<Rectangulo> miLista = new LinkedList<>();

		miLista.add(new Rectangulo(4d, 6d));
		miLista.add(new Rectangulo(3d, 2d));
		miLista.add(new Rectangulo(4d, 5d));

		Collections.sort(miLista, new Comparator<Rectangulo>() {
			@Override
			public int compare(Rectangulo o1, Rectangulo o2) {

				return o1.calcularPerimetro().compareTo(o2.calcularPerimetro());
			}
		});

		Double superficie1 = miLista.get(0).calcularArea();
		Double superficie2 = miLista.get(1).calcularArea();
		Double superficie3 = miLista.get(2).calcularArea();

		assertEquals(superficie1, miLista.get(0).calcularArea());
		assertEquals(superficie2, miLista.get(1).calcularArea());
		assertEquals(superficie3, miLista.get(2).calcularArea());
		
		
		System.out.println(miLista.get(0).calcularArea());

	}

	@Test
	public void ordenarRectangulosDeMenorAMyorPorPerimetro2() { // eliminar .sort

		List<Rectangulo> miLista = new LinkedList<>();

		miLista.add(new Rectangulo(4d, 6d));
		miLista.add(new Rectangulo(3d, 2d));
		miLista.add(new Rectangulo(4d, 5d));

		Set<Rectangulo> setOrdenado = new TreeSet<Rectangulo>();
		
		setOrdenado.addAll(miLista);
		
		Rectangulo [] elementosOrdenados = new Rectangulo[setOrdenado.size()];
		setOrdenado.toArray(elementosOrdenados);

		assertEquals(new Double(10), elementosOrdenados[0].calcularPerimetro());
		assertEquals(new Double(18), elementosOrdenados[1].calcularPerimetro());
		assertEquals(new Double (20), elementosOrdenados[2].calcularPerimetro());

	}

}
