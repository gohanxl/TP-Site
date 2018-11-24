package ultima.practica.parcial.dos;

import java.util.LinkedList;
import java.util.List;

public class Equipo {

	List<Jugador> Plantel;

	private String nombreDelEquipo;

	public Equipo(String nombreDelEquipo) {

		this.nombreDelEquipo = nombreDelEquipo;
		Plantel = new LinkedList<Jugador>();

	}

	public void agregarJugador(Jugador jugador) {

		Plantel.add(jugador);
	}

	public List<Jugador> getPlantel() {
		return Plantel;
	}

	public void setPlantel(List<Jugador> plantel) {
		Plantel = plantel;
	}

	public String getNombreDelEquipo() {
		return nombreDelEquipo;
	}

	public void setNombreDelEquipo(String nombreDelEquipo) {
		this.nombreDelEquipo = nombreDelEquipo;
	}

}
