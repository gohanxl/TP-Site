package ultima.practica.parcial.dos;

import org.junit.Before;
import org.junit.Test;

import practica.parcial.dos.MontoInvalidoExcp;
import practica.parcial.dos.SaldoInsuficienteExc;

public class TestPartido {

	private Jugador j1;
	private Jugador j2;
	private Jugador j3;
	private Equipo e1;
	private Equipo e2;
	private Equipo e3;
	private Gol gol;

	@Before

	public void inicializacion() {
		j1 = new Jugador(7, "Martinez");
		j2 = new Jugador(32, "Tevez");
		j3 = new Jugador(2, "Ni  idea");
		e1 = new Equipo("River Plate");
		e2 = new Equipo("Boca Juniors");
		e3 = new Equipo("Racing Club");

		gol = new Gol(35, j1);
	}

	@Test
	public void primerTest() throws CantidadEquiposException, RepetidosException, JugadorInexistenteException {

		Partido partido1 = new Partido();

		e1.agregarJugador(j1);
		e2.agregarJugador(j2);
		e3.agregarJugador(j3);

		try {
			partido1.agregarEquipo(e1);
			partido1.agregarEquipo(e2);
			partido1.agregarEquipo(e3);
		} catch (RepetidosException e) {

			System.out.println(e.getMessage());
		} catch (CantidadEquiposException e) {

			System.out.println(e.getMessage());
		}

		try {
			partido1.agregarGol(gol);
		} catch (JugadorInexistenteException e) {

			System.out.println(e.getMessage());
		}

	}

	@Test

	public void TestQueFuncionaTodo() throws RepetidosException, CantidadEquiposException, JugadorInexistenteException {

		Partido partido1 = new Partido();

		e1.agregarJugador(j1);
		e2.agregarJugador(j2);

		partido1.agregarEquipo(e1);
		partido1.agregarEquipo(e2);
		partido1.agregarGol(gol);

		
		System.out.println("El ganador es el equipo" + partido1.resultadoDelPartido(e1, e2));
		
		
	}

}
