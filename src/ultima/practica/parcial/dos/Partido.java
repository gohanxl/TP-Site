package ultima.practica.parcial.dos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Partido {

	private List<Equipo> Equipos;
	private List<Gol> Goles;

	public Partido() {

		Equipos = new LinkedList<Equipo>();
		Goles = new ArrayList<Gol>();
	}

	public void agregarEquipo(Equipo equipo) throws RepetidosException, CantidadEquiposException {

		if (Equipos.size() >= 2) {

			throw new CantidadEquiposException("No puede haber mas de 2 (dos) equipos");
		}

		for (Equipo e : Equipos) {

			if (e.getNombreDelEquipo().equals(equipo.getNombreDelEquipo())) {

				throw new RepetidosException("No puede haber repetidos");
			}
		}

		Equipos.add(equipo);
	}

	public void agregarGol(Gol gol) throws JugadorInexistenteException {

		if (Equipos.get(0).getPlantel().contains(gol.getJugador())
				|| Equipos.get(1).getPlantel().contains(gol.getJugador())) {

			Goles.add(gol);

		} else {

			throw new JugadorInexistenteException("El jugador no existe");

		}

	}

	public Integer resultadoDelPartido(Equipo equipo1, Equipo equipo2) {

		Integer ganadorDePartido = 0;
		Integer golesEquipo1 = 0;
		Integer golesEquipo2 = 0;
		
		for (Gol gol : Goles) {
			
			if(equipo1.getPlantel().contains(gol.getJugador())){
				
				golesEquipo1++;
			}
			
			if(equipo2.getPlantel().contains(gol.getJugador())) {
				
				golesEquipo2++;
			}
			
		}
		
		if (golesEquipo1 > golesEquipo2) {
			
			ganadorDePartido = 1;
		}
		if (golesEquipo2 > golesEquipo1) {
			
			ganadorDePartido = 2;
		}
		
		return ganadorDePartido;
	}

//hay que hacer un instanceOf
}
