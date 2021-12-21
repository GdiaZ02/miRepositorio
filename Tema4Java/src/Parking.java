
public class Parking {
	private String nombre;
	private int [][] plazas;
	private int nplantas;
	private int nplazas;
	
	public Parking(String nombre, int nplantas, int nplazas) {
		super();
		this.nombre = nombre;
		
		this.nplantas = nplantas;
		this.nplazas = nplazas;
		plazas=new int [nplantas][nplazas];
	}
	
	public boolean plantaocupada(int planta) {
		for (int i = 0; i < plazas[planta].length; i++) {
			if (plazas[planta][i] == 0) {
				return false;

			}
		}
		return true;
	}
}
