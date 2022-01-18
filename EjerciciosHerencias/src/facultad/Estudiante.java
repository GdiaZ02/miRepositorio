package facultad;

public class Estudiante extends Persona{
	private String curso;

	public Estudiante(String id, String nombre, String apellido, String curso) {
		super(id, nombre, apellido);
		this.curso = curso;
	}
	

	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "id= "+super.getId()+"nombre y apellidos= "+super.getNombre()+" "+super.getApellido()+"Estudiante [curso=" + curso + "]";
	}
	
	

}
