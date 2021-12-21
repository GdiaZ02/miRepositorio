package ejercicios;

public class Empleado {
	private String nombre;
	private String telefono;
	private static int numEmpleados;
	public Empleado(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		numEmpleados++;
	}
	public Empleado( String telefono) {
		this.nombre = "Pepe";
		this.telefono = telefono;
		numEmpleados++;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public static int getNumEmpleados() {
		return numEmpleados;
	}
	public boolean sonIguales(Empleado Otro) {//son iguales si tienen mismo nombre y mismo teléfono
		if(this.nombre.equals(Otro.getNombre())&& this.telefono.equals(Otro.getTelefono())) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
}
