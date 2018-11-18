package slacks.ejercicios;

public class ClientesBar implements Comparable<ClientesBar> {

	String nombre = "";
	Integer edad = 0;
	
	public ClientesBar(String nombre, Integer edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(ClientesBar o) {
		
		return this.nombre.compareTo(o.getNombre());
	}
	
	
	
	
}
