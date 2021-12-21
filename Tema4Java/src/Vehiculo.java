





public class Vehiculo {

public int npasajeros;
public int capacidad;
public int consumo; // L/Km
public Vehiculo() {
	
}
public Vehiculo(int num,int cap,int con) {
	npasajeros=num;
	capacidad=cap;
	consumo=con;
}
public Vehiculo(int cap,int con) {
	npasajeros=10;
	capacidad=cap;
	consumo=con;
}
public void Informacion() {
	System.out.println("Tu vehículo puede llevar hasta "+npasajeros+" y consume "+consumo+" litros por kilómetro");
}
public double coste(double precio, int kmRecorridos) {
	double aux=precio*consumo*kmRecorridos;
	return aux;
}
}
