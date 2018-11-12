package asdasd;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ListaTest {

	@Test
	public void listTest() {

		List<Integer> miLista = new LinkedList<>();

		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(4);
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(4);

		// 1. miLista tiene 7 elementos -> no, tiene 8

		// 2. el cuarto elemento es 3 -> no, 4to elemenot es 4

		// ¿que pasa en este caso? -> agrega un 2 en el segundo index, moviendo todos
		// los elementos.
		miLista.add(2, 2);

		// 3. ¿Como probarias lo que paso anterior?

		// ¿que pasa en este caso? -> remueve el ulitmo elemento int de la lista, el
		// index 8.
		miLista.remove(8);

		// ¿que prueba se te ocurre

		System.out.println(miLista.get(7));
	}

	@Test
	public void borrarUnaPosicionNoExistente() {

		List<Integer> miLista = new LinkedList<>();

		miLista.add(1);

		miLista.remove(0); // agregue la posicion a remover

		assertEquals(0, miLista.size());
	}

	@Test
	public void agregarUnElementoEnUnaPosicion() {

		List<Integer> miLista = new LinkedList<>();

		miLista.add(1);
		miLista.add(2);

		miLista.add(2, 3); // modifique el index para que lo agregue en donde corresponde.

		assertEquals(3, miLista.size());
	}

	@Test
	public void ejemplosLista() {

		List<Integer> miLista = new LinkedList<>();

		miLista.add(8);
		miLista.add(4);
		miLista.add(7);
		miLista.add(10);
		miLista.add(12);
		miLista.add(90);
		miLista.add(24);
		miLista.add(84);
		miLista.add(18);

		assertEquals(28.55555555555557, calcularPromedio(miLista), 0.01);
		assertEquals(90, buscarElMayor(miLista).intValue());

	}

	private Double calcularPromedio(List<Integer> miLista) {

		Double promedio = 0.0;
		Double suma = 0.0;

		for (Integer e : miLista) {

			suma += e;
			System.out.println(suma);
		}
		
		promedio = suma / miLista.size();
		
		return promedio;
	}

	private Integer buscarElMayor(List<Integer> miLista) {
		
		Integer numeroMayor = 0;
		
		if (numeroMayor == 0) {
			
			numeroMayor = miLista.get(0);
		}
		
		for (Integer e : miLista) {
			
			if (e > numeroMayor){
				
				numeroMayor = e;
				
			}
			
		}

		return numeroMayor;
	}

	//Punto 4: sentencias: C -
	//Punto 5: A) A nivel basico si, hacen lo mismo. B) 
		// C) LinkedList lo usaria para manipular datos, aunque usa mucha memoria. Y ArrayList para guardar y acceder data.
	
	
	
	
}
