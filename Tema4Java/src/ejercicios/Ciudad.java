package ejercicios;

import java.util.Arrays;

public class Ciudad {
private String nombre;
private double [] temperaturaMaxima;
private double[] temperaturaMinima;

public Ciudad(String nombre) {
	this.nombre = nombre;
}

public Ciudad(String nombre, double max1, double min1) {
	this.nombre = nombre;
	temperaturaMaxima=new double[12];
	for (int i = 0; i < temperaturaMaxima.length; i++) {
		temperaturaMaxima[i]=Math.random()*100;
		temperaturaMaxima[i]=temperaturaMaxima[i]*100;
		temperaturaMaxima[i]=(int)temperaturaMaxima[i];
		temperaturaMaxima[i]=temperaturaMaxima[i]/100;
		if(max1<temperaturaMaxima[i]) {
			max1=temperaturaMaxima[i];
		} 
	}
	temperaturaMinima=new double[12];
	for (int i = 0; i < temperaturaMinima.length; i++) {
		temperaturaMinima[i]=(Math.random()*100);
		temperaturaMinima[i]=temperaturaMinima[i]*100;
		temperaturaMinima[i]=(int)temperaturaMinima[i];
		temperaturaMinima[i]=temperaturaMinima[i]/100;
		if(min1>temperaturaMinima[i]) {
			min1=temperaturaMinima[i];
			}
		}
	System.out.println("La temperatura máxima es: "+max1);
	System.out.println("La temperatura mínima es: "+min1);
	}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void registrarTemperatura(int mes, double temperatura) {
	
}

@Override
public String toString() {
	return "Ciudad [nombre=" + nombre + ", temperaturaMaxima=" + Arrays.toString(temperaturaMaxima)
			+ ", temperaturaMinima=" + Arrays.toString(temperaturaMinima) + "]";
}

}
