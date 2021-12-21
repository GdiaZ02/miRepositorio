package ejercicios;

public class Profesor {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean especialista;

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEspecialista() {
		return especialista;
	}

	public void setEspecialista(boolean especialista) {
		this.especialista = especialista;
	}
	public Profesor(String nombre, String apellidos, int edad, boolean especialista) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad=edad;
		this.especialista=especialista;
	}
	public String informa() {
		//falta algo aquí *if()*
		String aux="no";
		return "Nombre y apellidos: "+nombre+" "+apellidos+" edad: "+edad+" especialista: "+aux;
	}

}
