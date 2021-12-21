import java.util.Arrays;

public class Cartelera {
	private static final String[] ciudades={"madrid","barcelona","sevilla"};
	private Pelicula[][] cartelera;
	private int longitud;
	public Cartelera(Pelicula[][] cartelera, int longitud) {
		this.cartelera = cartelera;
		this.longitud = longitud;
	}
	public Cartelera(int longitud) {
		this.longitud = longitud;
		this.cartelera=new Pelicula[ciudades.length][longitud];
	}
	public void agregarPelicula(Pelicula p,String ciudad) {
		int pos=-1;
		for (int i = 0; i < ciudades.length; i++) {
			if(ciudades[i].equals(ciudad)) {
				pos=i;
				break;
			}
		}if(pos!=-1) {
			for (int i = 0; i < cartelera[pos].length; i++) {
				if(cartelera[pos][i]!=null) {
					cartelera[pos][i]=p;
					break;
				}
			}
		}
	}
	public Cartelera(Pelicula[][] cartelera) {
		this.cartelera = cartelera;
		this.longitud = cartelera[0].length;
	}
	
	public String toString() {
		String s="";
		for (int i = 0; i < cartelera.length; i++) {
			s+="Cartelera de "+ciudades[i]+"\n";
			for (int j = 0; j < cartelera[i].length; j++) {
				if(cartelera[i][j]!=null) {
				s+=cartelera[i][j].toString();
				}
			}
		}
		return s;
	}
}
