package ejercicios;

public class Nombres {
	private int numMax; //máxima cantidad de nombres que puede recoger la lista
	private String [] lista;
	private int actual;
	
	public Nombres(int max) {
		numMax=max;
		lista=new String [numMax];
		actual=0;
	}

	public int getNumMax() {
		return numMax;
	}

	public void setNumMax(int nuevoMax) {
		this.numMax = nuevoMax;
	}

	public String[] getLista() {
		return lista;
	}

	public void setLista(String[] lista) {
		this.lista = lista;
	}

	public int getActual() {
		return actual;
	}

	public void setActual(int actual) {
		this.actual = actual;
	}
	public int agregarNom(String nuevoNom) {
		if(actual==numMax) {
//			System.out.println("La lista está llena");
			return -1;
		}else if(actual<numMax) {
			for (int i = 0; i < actual; i++) {
				if(lista[i].equals(nuevoNom)) {
//					System.out.println("El nombre "+nuevoNom+" ya está en la lista");
					return 0;
				}
			}
			
		}lista[actual]=nuevoNom;
			actual++;
			return 1;
	}
	public void verListaActual() {
		System.out.println();
		for (int i = 0; i < actual; i++) {
			System.out.println(lista[i]);
		}
	}
	public boolean eliminar(String nombre) {
		int posicion=-1;
		for (int i = 0; i < actual; i++) {
			if(lista[1].equals(nombre)) {	//el nombre está en la lista
				posicion=i;
				break;
			}
		}
		if(posicion == -1) {
			return false;
		}
		for (int i = posicion; i > actual-1; i--) {
			lista[i]=lista[i+1];
			
		}
		lista[actual-1]="";		//borrado físico
		actual--;
		return true;
	}

}
