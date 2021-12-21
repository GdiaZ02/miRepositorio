import java.util.Scanner;

public class pruebaVehiculo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vehiculo v1;
		Vehiculo v2=new Vehiculo(0,1,2);//los números dentro del paréntesis representan num cap y con de la clase Vehiculo
		v2.npasajeros=5;
		v2.consumo=4; // se reestablecen los valores  
		v2.capacidad=50;
		v1=new Vehiculo(1,2,3);//los números dentro del paréntesis representan num cap y con de la clase Vehiculo
		v1.npasajeros=60;
		v1.capacidad=1000;
		v1.consumo=10;
		v1.Informacion();
		v2.Informacion();
		System.out.println("¿Cuántos kilómetros quieres recorrer?");
		int km=sc.nextInt();
		double precioGasolina=1.12;
		System.out.println("para v1: "+v1.coste(precioGasolina, km));
		double a=v2.coste(precioGasolina, km);
		System.out.println("para v2: "+a);
		
		Vehiculo v3=new Vehiculo();
		Vehiculo v4=new Vehiculo(5,50,5);
		Vehiculo v5=new Vehiculo(3,2);
		v3.Informacion();
		v4.Informacion();
		v5.Informacion();
		

	}

}
