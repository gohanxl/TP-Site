package ultima.practica.parcial.dos;

public class Jugador {

	Integer numeroDeCamiseta;
	String apellido;

	public Jugador(Integer numeroDeCamiseta, String apellido) {

		this.numeroDeCamiseta = numeroDeCamiseta;
		this.apellido = apellido;

	}

	public Integer getNumeroDeCamiseta() {
		return numeroDeCamiseta;
	}

	public void setNumeroDeCamiseta(Integer numeroDeCamiseta) {
		this.numeroDeCamiseta = numeroDeCamiseta;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
