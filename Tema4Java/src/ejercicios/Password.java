package ejercicios;

import java.util.Iterator;

public class Password {
	
	private int longitud;
	private String clave;
	
	public Password() {
		this.longitud=8;
		this.clave=GenerarPassword();
	}
	
	public Password(int longitud, String clave) {
		this.longitud = longitud;
		this.clave = clave;
	}
	public Password(String clave) {
		this.clave = clave;
	}
	public Password(int longitud) {
		this.longitud = longitud;
		this.clave=GenerarPassword();
	}
	public String GenerarPassword() {
		String numeros="0123456789";
		String especiales="·$%&/()=?¿!¡";
		String letras="qwertyuiopasdfghjklñzxcvbnm";
		String cadena="";
		int num=0,esp=0,letr=0;
		for (int i = 0; i <5; i++) {
			int random=(int)(Math.random()*numeros.length());
			cadena+=numeros.charAt(random);
		}
		for (int i = 0; i <2; i++) {
			int random=(int)(Math.random()*letras.length());
			cadena+=letras.charAt(random);
		}
		cadena=cadena.toUpperCase();
		int random=(int)(Math.random()*letras.length());
		cadena+=letras.substring(random,random+1);
		for (int i = 0; i < longitud-8; i++) {
			 random=(int)(Math.random()*especiales.length());
			cadena+=especiales.charAt(random);
		}
		cadena=cadena.substring(0,longitud);
		return cadena;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", clave=" + clave + "]";
	}

}
