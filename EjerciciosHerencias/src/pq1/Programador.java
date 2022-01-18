package pq1;

import java.util.Arrays;

public class Programador extends Empleado{
	private String[] lenguajes;

	public Programador(String nombre, int telefono, String ...lenguajes) {// los 3 puntos significan que puede haber de 0 a infinitos lenguajes
		super(nombre, telefono);
		this.lenguajes = lenguajes;
	}

	public Programador(String nombre, String ...lenguajes) {
		super(nombre);
		this.lenguajes = lenguajes;
	}

	public String[] getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String[] lenguajes) {
		this.lenguajes = lenguajes;
	}
	
	public String[] mejcandidatos(String lenguajePpal, Programador[] ps) {
		String[] lengs;
		String[]salida=new String[ps.length];
		int cont=0;
		for (int i = 0; i < ps.length; i++) {
			lengs=ps[i].lenguajes;
			for (int j = 0; j < lengs.length; j++) {
				if(lengs[j].equals(lenguajePpal)) {
					salida[cont]=ps[i].getNombre()+", "+ps[i].getTelefono();
					cont++;
					break;
				}
				
			}
		}
		return salida;
	}

	@Override
	public String toString() {
		String salida= "El empleado "+super.getNombre()+", con teléfono "+super.getTelefono()+" conoce los lenguajes:"+"\t";
		for (String l : lenguajes) {
			salida+=l+"\t";
		}
		return salida;
	}


	

}
