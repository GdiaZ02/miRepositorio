import java.util.Arrays;

public class Pelicula {
	private String titulo;
	private String genero;
	private int duracion;
	private String[]actores;
	public Pelicula(String titulo, String genero, int duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.actores=new String[3];
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public String critica() {
		return "La película "+titulo+" tiene el racismo como tema principal";
	}
	public static double recaudacion(int numesp) {
		return numesp*10.0;
	}
	public boolean agregar(String nombre) {
		for (int i = 0; i < actores.length; i++) {
			if(actores[i]!=null) {
				if(actores[i].equals(nombre)) { 
				return false;
			}
				
			}else {
				actores[i]=nombre;
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", actores="
				+ Arrays.toString(actores) + "]";
	}
}
