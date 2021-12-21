package ejercicios;

public class Veh�culo {
	private int numRuedas;
	private double velMax;
	private double peso;

	public Veh�culo(int num, double max, double ps) {
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

	public boolean esigual(Veh�culo otro) {
		if (numRuedas == otro.numRuedas && velMax == otro.velMax && peso == otro.peso) {
			return true;
		}
		return false;
	}
	public void copia(Veh�culo otro) {	//de otro vamos a copiar a veh�culo
		numRuedas=otro.numRuedas;
		velMax=otro.velMax;
		peso=otro.peso;
		
	}
	public void copia2(Veh�culo otro) {	
		numRuedas=otro.numRuedas;
		velMax=otro.velMax;
		peso=otro.peso;
	}
	public String informaci�n() {
		return "Veh�culo "+numRuedas+" " +velMax+" " +peso;
	}
	public Veh�culo copia3() {	
		return new Veh�culo(numRuedas,velMax,peso);
	}
}
