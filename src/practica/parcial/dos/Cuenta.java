package practica.parcial.dos;

public class Cuenta {

	private String cbu;
	private Double saldo;

	public Cuenta(String cbu, Double saldo) {

		this.cbu = cbu;
		this.saldo = saldo;

	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double monto) {

		this.saldo += monto;

	}

	public void extraer(Double monto) throws MontoInvalidoExcp, SaldoInsuficienteExc {

		if (monto <= 0) {

			throw new SaldoInsuficienteExc("Inhabilito cuenta");// LO TOMA
		}

		if (monto < this.saldo) {
			this.saldo -= monto;
		} else {

			throw new MontoInvalidoExcp("Ingrese saldo de nuevo por favor.");
		}

	}

}
