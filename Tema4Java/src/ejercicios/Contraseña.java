package ejercicios;

public class Contraseņa {
	private int numAlumn;
	private Password[] mipass;
	private int tam;
	
	public Contraseņa(int numAlumn, int tam) {
		this.numAlumn = numAlumn;
		this.tam = tam;
		mipass=new Password[this.numAlumn];
	}
	private void rellena() {
		for (int i = 0; i < numAlumn; i++) {
			mipass[i]=new Password(tam);
		}
	}

}
