package pq1;

public class ProvinciaCostera extends Provincia {
	private int kmc;

	public int getKmc() {
		return kmc;
	}

	public void setKmc(int kmc) {
		this.kmc = kmc;
	}

	public ProvinciaCostera(String nombre, String cc, int km2, int poblacion, int kmcosta) {
		super(nombre, cc, km2, poblacion);
		kmc = kmcosta;
	}
	public void muestra() {
		System.out.println("Soy "+super.getNombre()+", provincia costera, y tengo "+kmc+" kilómetros de costa");//no es necesario poner super aquí pero ayuda a evitar problemas
	}

	@Override
	public String toString() {
		return super.toString() + "ProvinciaCostera [kmc=" + kmc + "]";
	}
}
