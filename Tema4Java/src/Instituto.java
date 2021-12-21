import java.util.Arrays;

public class Instituto {
	private String nombre;
	private String tipo;
	private String[] ense;
	private String direccion;
	private int numAls;
	

	
	public Instituto(String nombre, String tipo, String direccion) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.ense = new String[3];
		this.direccion = direccion;
		this.numAls = 700;
	}

	public Instituto(String nombre, String tipo, String[] ense, String direccion, int numAls) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.ense = ense;
		this.direccion = direccion;
		this.numAls = numAls;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String[] getEnse() {
		return ense;
	}
	public void setEnse(String[] ense) {
		this.ense = ense;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumAls() {
		return numAls;
	}
	public void setNumAls(int numAls) {
		this.numAls = numAls;
	}

	@Override
	public String toString() {
		return "Instituto [nombre=" + nombre + ", tipo=" + tipo + ", ense=" + Arrays.toString(ense) + ", direccion="
				+ direccion + ", numAls=" + numAls + "]";
	}

}
