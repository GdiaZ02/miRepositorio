package facultad;

public class Empleado extends Persona{
	
	private int anyo;
	
	public Empleado(String id, String nombre, String apellido, int anyo) {
		super(id, nombre, apellido);
		this.anyo=anyo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return "id= "+super.getId()+"nombre y apellidos= "+super.getNombre()+" "+super.getApellido()+" Empleado [anyo=" + anyo + "]";
	}
	
	

}
