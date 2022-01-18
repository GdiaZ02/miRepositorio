package pq1;

public class Provincia {
	private String nombre;
	private String cc;
	private int km2;
	private int poblacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public int getKm2() {
		return km2;
	}

	public void setKm2(int km2) {
		this.km2 = km2;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public double densidad() {
		return (double)poblacion/km2;
	}

	public Provincia(String nombre, String cc, int km2, int poblacion) {
		super();
		this.nombre = nombre;
		this.cc = cc;
		this.km2 = km2;
		this.poblacion = poblacion;
	}
	public void muestra() {
		System.out.println("cc: "+cc+"\t"+" provincia: "+nombre);
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", cc=" + cc + ", km2=" + km2 + ", poblacion=" + poblacion + "]";
	}
	
}
