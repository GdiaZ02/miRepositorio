package ejercicios;

public class pruebaNombres {

	public static void main(String[] args) {
		Nombres l1=new Nombres(3);
		l1.agregarNom("Raul");
		l1.agregarNom("Eva");
		l1.agregarNom("Juan");
		
//		int a=l1.agregarNom("Raul");
//		
//		if(a==1) {
//			System.out.println("agregado");
//		}
//		a=l1.agregarNom("Eva");
//		if(a==1) {
//			System.out.println("agregado");
//		}
//		a=l1.agregarNom("Raul");
//		
//		if(a==1) {
//			System.out.println("agregado");
//		}
//		a=l1.agregarNom("Pedrín");
//		
//		if(a==1) {
//			System.out.println("agregado");
//		}
		l1.verListaActual();
		l1.eliminar("Eva");
		l1.verListaActual();

	}

}
