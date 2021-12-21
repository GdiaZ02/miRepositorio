package ejercicios;

public class Vehículo {
	private int numRuedas;
	private double velMax;
	private double peso;

	public Vehículo(int num, double max, double ps) {
		numRuedas = num;
		velMax = max;
		peso = ps;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int num) {
		this.numRuedas = num;
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double max) {
		this.velMax = max;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double ps) {
		this.peso = ps;
	}

	public boolean esigual(Vehículo otro) {
		if (numRuedas == otro.numRuedas && velMax == otro.velMax && peso == otro.peso) {
			return true;
		}
		return false;
	}
	public void copia(Vehículo otro) {	//de otro vamos a copiar a vehículo
		numRuedas=otro.numRuedas;
		velMax=otro.velMax;
		peso=otro.peso;
		
	}
	public void copia2(Vehículo otro) {	
		numRuedas=otro.numRuedas;
		velMax=otro.velMax;
		peso=otro.peso;
	}
	public String información() {
		return "Vehículo "+numRuedas+" " +velMax+" " +peso;
	}
	public Vehículo copia3() {	
		return new Vehículo(numRuedas,velMax,peso);
	}
}
