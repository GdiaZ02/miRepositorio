
public class Curso {
private String nombre;
private int creditos;
private boolean llave;
private Asignatura as;

public Curso() {
	
}

public Curso(String nombre) {
	super();
	this.nombre = nombre;
}

public Curso(String nombre, int creditos, boolean llave, Asignatura as) {
	this.nombre = nombre;
	this.creditos = creditos;
	this.llave = llave;
	this.as = as;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCreditos() {
	return creditos;
}
public void setCreditos(int creditos) {
	this.creditos = creditos;
}
public boolean isLlave() {
	return llave;
}
public void setLlave(boolean llave) {
	this.llave = llave;
}
public Asignatura getAs() {
	return as;
}
public void setAs(Asignatura as) {
	this.as = as;
}

@Override
public String toString() {
	return "Curso [nombre=" + nombre + ", creditos=" + creditos + ", llave=" + llave + ", as=" + as + "]";
}

}
