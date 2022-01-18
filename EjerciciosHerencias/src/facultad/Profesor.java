package facultad;

public class Profesor extends Empleado{
	private String departamento;

	public Profesor(String id, String nombre, String apellido, int anyo, String departamento) {
		super(id, nombre, apellido, anyo);
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "id= "+super.getId()+"nombre y apellidos= "+super.getNombre()+" "+super.getApellido()+" Empleado [anyo=" + super.getAnyo() + "]"+"Profesor [departamento=" + departamento + "]";
	}
	
 
}
