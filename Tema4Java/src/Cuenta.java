
public class Cuenta {
	private String titular;
	private double cantidad;
	private double saldo;
	
	public Cuenta(String titular) {
		
	}

	public Cuenta(String titular, double saldo) {
	this.titular = titular;
	this.saldo = saldo;
}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + "]";
	}

	public double estado() {
		return saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double cantidad){
		if (cantidad < 0) {
			System.out.println("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	public void retirar(double cantidad){
		if (cantidad < 0) {
			System.out.println("No es posible retirar una cantidad negativa");
			;
		}
		if (estado() < cantidad) {
			saldo = 0;
		}
		setSaldo(saldo - cantidad);

	}
}
