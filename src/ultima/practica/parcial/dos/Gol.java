package ultima.practica.parcial.dos;

import java.util.ArrayList;
import java.util.List;

public class Gol {

	List<Gol> Goles;

	private Integer minuto;
	private Jugador jugador;

	public Gol(Integer minuto, Jugador jugador) {

		this.minuto = minuto;
		this.jugador = jugador;

		Goles = new ArrayList<Gol>();
	}

	public List<Gol> getGoles() {
		return Goles;
	}

	public void setGoles(List<Gol> goles) {
		Goles = goles;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	
	
	
}
