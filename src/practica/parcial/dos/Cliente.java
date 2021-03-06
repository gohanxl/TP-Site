package practica.parcial.dos;

public class Cliente {

	private String dni;
	private String nombre;
	private Cuenta cuenta;

	public Cliente(String dni, String nombre, String cbu, Double saldo) {

		this.dni = dni;
		this.nombre = nombre;
		this.cuenta = new Cuenta(cbu, saldo);

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	

}
