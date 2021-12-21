
public class Asignatura {

String nombre;
String especialidad;
int horas;
public Asignatura() {
	
}
public Asignatura(String nombre, String especialidad, int horas) {
	super();
	this.nombre = nombre;
	this.especialidad = especialidad;
	this.horas = horas;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}
public int getHoras() {
	return horas;
}
public void setHoras(int horas) {
	this.horas = horas;
}
@Override
public String toString() {
	return "Asignatura [nombre=" + nombre + ", especialidad=" + especialidad + ", horas=" + horas + "]";
}

}
